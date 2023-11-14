/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_poo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

/**
 *
 * @author emilio
 */
public class PlanEstudios {
    Nodo root;

    public PlanEstudios(Nodo root) {
        this.root = root;
    }
            
    public void innit(){
        ///////////////////// SEMESTRE 10 //////////////////////////////////////////////////////
        Nodo NOPT1 = new Nodo(10, "Primera Optativa", 9991, 8);
        Nodo NOPT2 = new Nodo(10, "Segunda Optativa", 9992, 8);
        Nodo NOPT3 = new Nodo(10, "Tercera Optativa", 9993, 8);
        Nodo NOPT4 = new Nodo(10, "Cuatro Optativa", 9994, 8);
        Nodo NOPT5 = new Nodo(10, "Quinta Optativa", 9995, 8);
        ///////////////////// SEMESTRE 9 //////////////////////////////////////////////////////
        Nodo NOS91 = new Nodo(9, "Organizacion y Arquitectura de Computadoras", 1867, 8);
        Nodo NOS92 = new Nodo(9, "Fundamentos de Sistema Embebidos", 1858, 8);
        Nodo NOS93 = new Nodo(9, "Sistemas Distribuidos", 9993, 8);
        Nodo NOS94 = new Nodo(9, "Optativa de Campo de Profundizacion", 9996, 8);
        Nodo NOS95 = new Nodo(9, "Recursos y Necesidades de Mexico", 2080, 8);
        ///////////////////// SEMESTRE 8 //////////////////////////////////////////////////////
        Nodo NOS81 = new Nodo(8, "Optativa(s) de  Ciencias Sociales y Humanidades", 9997, 6);
        Nodo NOS82 = new Nodo(8, "Microcomputadoras (L+)", 1672, 8);  NOS82.add(NOS91); NOS82.add(NOS92); 
        Nodo NOS83 = new Nodo(8, "Computadoras Grafica E Iteraccion Humano-Computadora", 1590, 10);
        Nodo NOS84 = new Nodo(8, "Etica Profesional", 1052, 6);
        Nodo NOS85 = new Nodo(8, "Redes de Datos Seguras (L+)", 1598, 14);
        ///////////////////// SEMESTRE 7 //////////////////////////////////////////////////////
        Nodo NOS71 = new Nodo(7, "Finanzas en la Ingenieria en Computacion", 1537, 6);
        Nodo NOS72 = new Nodo(7, "Diseño Digital VLSI", 1535, 8); NOS72.add(NOS82);
        Nodo NOS73 = new Nodo(7, "Inteligencia Artificial", 0406, 8);
        Nodo NOS74 = new Nodo(7, "Compiladores", 0434, 8);
        Nodo NOS75 = new Nodo(7, "Sistemas de Comunicaciones (L+)", 1686, 8); NOS75.add(NOS85);
        Nodo NOS76 = new Nodo(7, "Introduccion a la Economia", 1413, 8);
        ///////////////////// SEMESTRE 6 //////////////////////////////////////////////////////
        Nodo NOS61 = new Nodo(6, "Sistemas Operativos", 840, 8);
        Nodo NOS62 = new Nodo(6, "Diseño Digital Moderno (L+)", 1645, 10); NOS62.add(NOS75);
        Nodo NOS63 = new Nodo(6, "Bases de Datos (L+)", 1644, 14);
        Nodo NOS64 = new Nodo(6, "Circuitos Electronicos (L)", 1562, 8);
        Nodo NOS65 = new Nodo(6, "Administracion de Proyectos de Software", 1643, 8);
        ///////////////////// SEMESTRE 5 //////////////////////////////////////////////////////
        Nodo NOS51 = new Nodo(5, "Estructura y Programacion de Computadoras", 1503, 8); NOS51.add(NOS61);
        Nodo NOS52 = new Nodo(5, "Dispositivos Electronicos (L+)", 138, 10);
        Nodo NOS53 = new Nodo(5, "Lenguajes Formales y Automatas", 442, 8); NOS53.add(NOS73); NOS53.add(NOS74);
        Nodo NOS54 = new Nodo(5, "Señales y Sistemas (L+)", 1473, 8); NOS54.add(NOS74);
        Nodo NOS55 = new Nodo(5, "Ingenieria de Software", 1531, 8);
        ///////////////////// SEMESTRE 4 //////////////////////////////////////////////////////
        Nodo NOS41 = new Nodo(4, "Fundamentos de Estadistica", 1445, 8);
        Nodo NOS42 = new Nodo(4, "Electricidad y Magnetismo (L+)", 1414, 10); NOS42.add(NOS52);
        Nodo NOS43 = new Nodo(4, "Analisis Numerico", 1433, 8);
        Nodo NOS44 = new Nodo(4, "Matematicas Avanzadas", 1424, 8); NOS44.add(NOS54);
        Nodo NOS45 = new Nodo(4, "Estructuras Discretas", 119, 8);
        ///////////////////// SEMESTRE 3 //////////////////////////////////////////////////////
        Nodo NOS31 = new Nodo(3, "Probabilidad", 1436, 8); NOS31.add(NOS41);
        Nodo NOS32 = new Nodo(3, "Calculo Vectorial", 1321, 8); NOS32.add(NOS42);
        Nodo NOS33 = new Nodo(3, "Ecuaciones Diferenciales", 1325, 8); NOS33.add(NOS43);
        Nodo NOS34 = new Nodo(3, "Cultura y Comunicacion", 1222, 2);
        Nodo NOS35 = new Nodo(3, "Estructura de Datos y Algoritmos II", 1317, 10); NOS35.add(NOS45);
        Nodo NOS36 = new Nodo(3, "Programacion Orientada a Objetos", 1323, 10);
        ///////////////////// SEMESTRE 2 //////////////////////////////////////////////////////
        Nodo NOS21 = new Nodo(2, "Algebra Lineal", 1220, 8); NOS21.add(NOS31);
        Nodo NOS22 = new Nodo(2, "Calculo Integral", 1221, 8); NOS22.add(NOS32); NOS22.add(NOS33);
        Nodo NOS23 = new Nodo(2, "Mecanica", 1228, 12);
        Nodo NOS24 = new Nodo(2, "Redaccion y Exposicion de Temas de Ingenieria", 1124, 6);
        Nodo NOS25 = new Nodo(2, "Estructura de Datos y Algoritmos I", 1227, 10); NOS25.add(NOS35); NOS25.add(NOS36);
        ///////////////////// SEMESTRE 1 ///////////////////////////////////////////////////////
        Nodo NOS11 = new Nodo(1, "Algebra", 1120, 8); NOS11.add(NOS21);
        Nodo NOS12 = new Nodo(1, "Calculo y Geometria Analitica", 1121, 12); NOS12.add(NOS22); NOS12.add(NOS23);
        Nodo NOS13 = new Nodo(1, "Quimica (L+)", 1123, 10);
        Nodo NOS14 = new Nodo(1, "Fundamentos de Fisica (L)", 1130, 6);
        Nodo NOS15 = new Nodo(1, "Fundamentos de Programacion (L)", 1122, 10); NOS15.add(NOS25);
        Nodo NOS16 = new Nodo(1, "Igualdad de Genero en Ingenieria", 8000, 0);
        
        ///////////////////// NODOS DE SERVICIO /////////////////////////////////////////////////
        
        Nodo S10 = new Nodo(10, "10", 0, 0); 
        S10.add(NOPT1); S10.add(NOPT2); S10.add(NOPT3); S10.add(NOPT4); S10.add(NOPT5);
        Nodo S09 = new Nodo(9, "9", 0, 0);
        S09.add(NOS93); S09.add(NOS94); S09.add(NOS95); S09.add(S10);
        Nodo S08 = new Nodo(8, "8", 0, 0);
        S08.add(NOS81); S08.add(NOS83); S08.add(NOS84); S08.add(S09);
        Nodo S07 = new Nodo(7, "7", 0, 0);
        S07.add(NOS71); S07.add(NOS76); S07.add(S08);
        Nodo S06 = new Nodo(6, "6", 0, 0);
        S06.add(NOS62); S06.add(NOS63); S06.add(S07);
        Nodo S05 = new Nodo(5, "5", 0, 0);
        S05.add(NOS51); S05.add(NOS53); S05.add(NOS15); S05.add(S06);
        Nodo S04 = new Nodo(4, "4", 0, 0);
        S04.add(NOS44); S04.add(S05);
        Nodo S03 = new Nodo(3, "3", 0, 0);
        S03.add(NOS34); S03.add(S04); 
        Nodo S02 = new Nodo(2, "2", 0, 0);
        S02.add(NOS24); S02.add(S03); 
        root.add(NOS11); root.add(NOS12); root.add(NOS13); root.add(NOS14); root.add(NOS15); root.add(NOS16); root.add(S02); 
    }        
            
    public double[] breadthFrist(Nodo Next, int semestre, double materiasCursadas, double promedioAcumulado, double creditos){
        Random rand = new Random();
	Queue<Nodo> queue = new LinkedList();
        Nodo r = Next;
        double ans[] = {0, 0, 0};
	if(r!=null){
            queue.add(r);
            while(!queue.isEmpty()){
                r = (Nodo)queue.poll();      
                int cal = rand.nextInt(5) + 5;
                if(r.clave!=0){
                    promedioAcumulado += cal;
                    materiasCursadas++;
                    creditos += r.creditos;
                    if(cal>5){
                        System.out.println("La materia de " + r.nombre + " la paso con: " + cal + " cambiando su promedio a " + promedioAcumulado/materiasCursadas + ". Creditos: " + creditos);    
                    }else{
                        System.out.println("La materia de " + r.nombre + " la reprobo con: " + cal + " cambiando su promedio a " + promedioAcumulado/materiasCursadas + ". Creditos: " + creditos);    
                    }
                }
                for(int i = 0; i<r.sons.size(); i++){
                    if( (cal>5 || r.clave == 0) && semestre>=r.semestre){
                        queue.add(r.sons.get(i));    
                    }
                }
            }
	}
        ans[0] = promedioAcumulado;
        ans[1] = materiasCursadas;
        ans[2] = creditos;
        return ans;
    }
}