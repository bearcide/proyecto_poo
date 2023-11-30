/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_poo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Es una clase para guardar datos estadisticos de las materias
 */
public class PlanEstudiosEstadisticos{
    
    NodoEstadistico root;

    public PlanEstudiosEstadisticos(NodoEstadistico root) {
        this.root = root;
    }
    /**
     * Inicializa el arbol
     */
    public void innit(){
        ///////////////////// SEMESTRE 10 //////////////////////////////////////////////////////
        NodoEstadistico NOPT1 = new NodoEstadistico(10, "Primera Optativa", 9991, 8);
        NodoEstadistico NOPT2 = new NodoEstadistico(10, "Segunda Optativa", 9992, 8);
        NodoEstadistico NOPT3 = new NodoEstadistico(10, "Tercera Optativa", 9993, 8);
        NodoEstadistico NOPT4 = new NodoEstadistico(10, "Cuatro Optativa", 9994, 8);
        NodoEstadistico NOPT5 = new NodoEstadistico(10, "Quinta Optativa", 9995, 8);
        ///////////////////// SEMESTRE 9 //////////////////////////////////////////////////////
        NodoEstadistico NOS91 = new NodoEstadistico(9, "Organizacion y Arquitectura de Computadoras", 1867, 8);
        NodoEstadistico NOS92 = new NodoEstadistico(9, "Fundamentos de Sistema Embebidos", 1858, 8);
        NodoEstadistico NOS93 = new NodoEstadistico(9, "Sistemas Distribuidos", 9993, 8);
        NodoEstadistico NOS94 = new NodoEstadistico(9, "Optativa de Campo de Profundizacion", 9996, 8);
        NodoEstadistico NOS95 = new NodoEstadistico(9, "Recursos y Necesidades de Mexico", 2080, 8);
        ///////////////////// SEMESTRE 8 //////////////////////////////////////////////////////
        NodoEstadistico NOS81 = new NodoEstadistico(8, "Optativa(s) de  Ciencias Sociales y Humanidades", 9997, 6);
        NodoEstadistico NOS82 = new NodoEstadistico(8, "Microcomputadoras (L+)", 1672, 8);  NOS82.add(NOS91); NOS82.add(NOS92); 
        NodoEstadistico NOS83 = new NodoEstadistico(8, "Computadoras Grafica E Iteraccion Humano-Computadora", 1590, 10);
        NodoEstadistico NOS84 = new NodoEstadistico(8, "Etica Profesional", 1052, 6);
        NodoEstadistico NOS85 = new NodoEstadistico(8, "Redes de Datos Seguras (L+)", 1598, 14);
        ///////////////////// SEMESTRE 7 //////////////////////////////////////////////////////
        NodoEstadistico NOS71 = new NodoEstadistico(7, "Finanzas en la Ingenieria en Computacion", 1537, 6);
        NodoEstadistico NOS72 = new NodoEstadistico(7, "Diseño Digital VLSI", 1535, 8); NOS72.add(NOS82);
        NodoEstadistico NOS73 = new NodoEstadistico(7, "Inteligencia Artificial", 0406, 8);
        NodoEstadistico NOS74 = new NodoEstadistico(7, "Compiladores", 0434, 8);
        NodoEstadistico NOS75 = new NodoEstadistico(7, "Sistemas de Comunicaciones (L+)", 1686, 8); NOS75.add(NOS85);
        NodoEstadistico NOS76 = new NodoEstadistico(7, "Introduccion a la Economia", 1413, 8);
        ///////////////////// SEMESTRE 6 //////////////////////////////////////////////////////
        NodoEstadistico NOS61 = new NodoEstadistico(6, "Sistemas Operativos", 840, 8);
        NodoEstadistico NOS62 = new NodoEstadistico(6, "Diseño Digital Moderno (L+)", 1645, 10); NOS62.add(NOS72);
        NodoEstadistico NOS63 = new NodoEstadistico(6, "Bases de Datos (L+)", 1644, 14);
        NodoEstadistico NOS64 = new NodoEstadistico(6, "Circuitos Electronicos (L)", 1562, 8);
        NodoEstadistico NOS65 = new NodoEstadistico(6, "Administracion de Proyectos de Software", 1643, 8);
        ///////////////////// SEMESTRE 5 //////////////////////////////////////////////////////
        NodoEstadistico NOS51 = new NodoEstadistico(5, "Estructura y Programacion de Computadoras", 1503, 8); NOS51.add(NOS61);
        NodoEstadistico NOS52 = new NodoEstadistico(5, "Dispositivos Electronicos (L+)", 138, 10);
        NodoEstadistico NOS53 = new NodoEstadistico(5, "Lenguajes Formales y Automatas", 442, 8); NOS53.add(NOS73); NOS53.add(NOS74);
        NodoEstadistico NOS54 = new NodoEstadistico(5, "Señales y Sistemas (L+)", 1473, 8); NOS54.add(NOS64); NOS54.add(NOS75);
        NodoEstadistico NOS55 = new NodoEstadistico(5, "Ingenieria de Software", 1531, 8); NOS55.add(NOS65);
        ///////////////////// SEMESTRE 4 //////////////////////////////////////////////////////
        NodoEstadistico NOS41 = new NodoEstadistico(4, "Fundamentos de Estadistica", 1445, 8);
        NodoEstadistico NOS42 = new NodoEstadistico(4, "Electricidad y Magnetismo (L+)", 1414, 10); NOS42.add(NOS52);
        NodoEstadistico NOS43 = new NodoEstadistico(4, "Analisis Numerico", 1433, 8);
        NodoEstadistico NOS44 = new NodoEstadistico(4, "Matematicas Avanzadas", 1424, 8); NOS44.add(NOS54);
        NodoEstadistico NOS45 = new NodoEstadistico(4, "Estructuras Discretas", 119, 8);
        ///////////////////// SEMESTRE 3 //////////////////////////////////////////////////////
        NodoEstadistico NOS31 = new NodoEstadistico(3, "Probabilidad", 1436, 8); NOS31.add(NOS41);
        NodoEstadistico NOS32 = new NodoEstadistico(3, "Calculo Vectorial", 1321, 8); NOS32.add(NOS42);
        NodoEstadistico NOS33 = new NodoEstadistico(3, "Ecuaciones Diferenciales", 1325, 8); NOS33.add(NOS43);
        NodoEstadistico NOS34 = new NodoEstadistico(3, "Cultura y Comunicacion", 1222, 2);
        NodoEstadistico NOS35 = new NodoEstadistico(3, "Estructura de Datos y Algoritmos II", 1317, 10); NOS35.add(NOS45);
        NodoEstadistico NOS36 = new NodoEstadistico(3, "Programacion Orientada a Objetos", 1323, 10);
        ///////////////////// SEMESTRE 2 //////////////////////////////////////////////////////
        NodoEstadistico NOS21 = new NodoEstadistico(2, "Algebra Lineal", 1220, 8); NOS21.add(NOS31);
        NodoEstadistico NOS22 = new NodoEstadistico(2, "Calculo Integral", 1221, 8); NOS22.add(NOS32); NOS22.add(NOS33);
        NodoEstadistico NOS23 = new NodoEstadistico(2, "Mecanica", 1228, 12);
        NodoEstadistico NOS24 = new NodoEstadistico(2, "Redaccion y Exposicion de Temas de Ingenieria", 1124, 6);
        NodoEstadistico NOS25 = new NodoEstadistico(2, "Estructura de Datos y Algoritmos I", 1227, 10); NOS25.add(NOS35); NOS25.add(NOS36);
        ///////////////////// SEMESTRE 1 ///////////////////////////////////////////////////////
        NodoEstadistico NOS11 = new NodoEstadistico(1, "Algebra", 1120, 8); NOS11.add(NOS21);
        NodoEstadistico NOS12 = new NodoEstadistico(1, "Calculo y Geometria Analitica", 1121, 12); NOS12.add(NOS22); NOS12.add(NOS23);
        NodoEstadistico NOS13 = new NodoEstadistico(1, "Quimica (L+)", 1123, 10);
        NodoEstadistico NOS14 = new NodoEstadistico(1, "Fundamentos de Fisica (L)", 1130, 6);
        NodoEstadistico NOS15 = new NodoEstadistico(1, "Fundamentos de Programacion (L)", 1122, 10); NOS15.add(NOS25);
        NodoEstadistico NOS16 = new NodoEstadistico(1, "Igualdad de Genero en Ingenieria", 8000, 0);
        
        ///////////////////// NODOS DE SERVICIO /////////////////////////////////////////////////
        
        NodoEstadistico S10 = new NodoEstadistico(10, "10", 0, 0); 
        S10.add(NOPT1); S10.add(NOPT2); S10.add(NOPT3); S10.add(NOPT4); S10.add(NOPT5);
        NodoEstadistico S09 = new NodoEstadistico(9, "9", 0, 0);
        S09.add(NOS93); S09.add(NOS94); S09.add(NOS95); S09.add(S10);
        NodoEstadistico S08 = new NodoEstadistico(8, "8", 0, 0);
        S08.add(NOS81); S08.add(NOS83); S08.add(NOS84); S08.add(S09);
        NodoEstadistico S07 = new NodoEstadistico(7, "7", 0, 0);
        S07.add(NOS71); S07.add(NOS76); S07.add(S08);
        NodoEstadistico S06 = new NodoEstadistico(6, "6", 0, 0);
        S06.add(NOS62); S06.add(NOS63); S06.add(S07);
        NodoEstadistico S05 = new NodoEstadistico(5, "5", 0, 0);
        S05.add(NOS51); S05.add(NOS53); S05.add(NOS55); S05.add(S06);
        NodoEstadistico S04 = new NodoEstadistico(4, "4", 0, 0);
        S04.add(NOS44); S04.add(S05);
        NodoEstadistico S03 = new NodoEstadistico(3, "3", 0, 0);
        S03.add(NOS34); S03.add(S04); 
        NodoEstadistico S02 = new NodoEstadistico(2, "2", 0, 0);
        S02.add(NOS24); S02.add(S03); 
        root.add(NOS11); root.add(NOS12); root.add(NOS13); root.add(NOS14); root.add(NOS15); root.add(NOS16); root.add(S02); 
    }
    
    /**
     * Metodo para buscar en el arbol
     * @param nombre el nombre de la materia
     * @return regresa la materia
     */
    
    public Nodo find(String nombre){
	Queue<Nodo> queue = new LinkedList();
        Nodo r = root;
	if(r!=null){
            queue.add(r);
            while(!queue.isEmpty()){
                r = (Nodo)queue.poll();    
                if(nombre.equalsIgnoreCase(r.nombre)){
                    System.out.println("Si se encontro " + r.nombre + " en el plan de estudios");
                    System.out.println(r.calificacionActas);
                    return r;
                }
                for(int i = 0; i<r.sons.size(); i++){
                    queue.add(r.sons.get(i));    
                    
                }
            }
	}
        System.out.println("No se encontro " + r.nombre + " en el plan de estudios");
        return null;
    }
      
     /**
     * Metodo para buscar en el arbol
     * @param clave la clave de la materia
     * @return regresa la materia
     */
    
    public Nodo find(Integer clave){
	Queue<Nodo> queue = new LinkedList();
        Nodo r = root;
	if(r!=null){
            queue.add(r);
            while(!queue.isEmpty()){
                r = (Nodo)queue.poll();  
                if(clave.equals(r.clave)){
                    System.out.println("Si se encontro " + r.nombre + " en el plan de estudios");
                    return r;
                }
                for(int i = 0; i<r.sons.size(); i++){
                    queue.add(r.sons.get(i));    
                    
                }
            }
	}
        System.out.println("No se encontro " + r.nombre + " en el plan de estudios");
        return null;
    }
    /**
     * Para guardar los datos en un csv
     * @throws IOException 
     */
    public void toCsv() throws IOException{
        FileWriter fw = new FileWriter("EstadisticasDeMaterias.csv");
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter impresoraDeArchivos = new PrintWriter(bw);
        impresoraDeArchivos.println("Nombre,Clave,Semestre,Creditos,Alumnos que la an Inscrito, Alumnos que la an Pasado,Indice de Aprobacion,Promedio General");
        Queue<NodoEstadistico> queue = new LinkedList();
        NodoEstadistico r = root;
	if(r!=null){
            queue.add(r);
            while(!queue.isEmpty()){
                r = (NodoEstadistico)queue.poll();
                if(r.clave!=0 && r.alumnosInscritos>0){
                    impresoraDeArchivos.println(r.nombre+","+r.clave+","+r.semestre+","+r.creditos+","+r.alumnosInscritos+","+r.alumnosPasados+","+r.alumnosPasados/r.alumnosInscritos+","+r.promedioAcumulado/r.alumnosInscritos);
                }
                for(int i = 0; i<r.sons.size(); i++){
                    queue.add(r.sons.get(i));    
                    
                }
            }
	}
        impresoraDeArchivos.close();
    }
    
    
}
