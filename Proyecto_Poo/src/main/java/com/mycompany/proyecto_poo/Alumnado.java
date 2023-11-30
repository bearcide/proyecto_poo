/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_poo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Clase para guardar a todos los alumnos
 */
public class Alumnado {
    List<Alumno> alumnado = new ArrayList<Alumno>();  

    public Alumnado() {
    }

    /**
     * Metodo para generar n alumnos
     * @param size el numero de alumnos
     * @param nombres de donde se sacaran los nombres
     * @param apellidos de donde se sacaran los apellidos
     * @param ubicaciones de donde se sacaran las ubicaciones
     * @param creditosNecesarios los creditos que se necesitan por semestre
     * @param planMadre donde se guardaran los datos
     */
    public void innit(int size, List<String> nombres, List<String> apellidos, List<String> ubicaciones, Integer creditosNecesarios[], PlanEstudiosEstadisticos planMadre) {
        Alumno alu = new Alumno();
        for(int i = 0; i<size; i++){
            alu = alu.generarAlumno(nombres, apellidos, ubicaciones, creditosNecesarios, planMadre);
            alumnado.add(alu);
        }
    }
    /**
     * Para guardar los alumnados en un csv
     * @throws IOException 
     */
    public void to_csv() throws IOException{
        FileWriter fw = new FileWriter("alumnado.csv");
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter impresoraDeArchivos = new PrintWriter(bw);
        impresoraDeArchivos.println("Nombre,Apellido Paterno,Apellido Materno,Edad,Ubicacion,Semestre,Numero de Cuenta,Numero de Inscripcion,Promedio,Creditos,Trayectoria Escolar");
        for(int i = 0; i<alumnado.size(); i++){
            impresoraDeArchivos.println(alumnado.get(i).getNombre() + "," + alumnado.get(i).getApellidoPaterno() + "," + alumnado.get(i).getApellidoMaterno() + "," + alumnado.get(i).edad + "," + alumnado.get(i).getDomicilio() + "," + alumnado.get(i).semestre + "," + alumnado.get(i).getNumeroDeCuenta() + "," + (i+1) + "," + alumnado.get(i).promedioAcumulado/alumnado.get(i).materiasCursadas + "," +alumnado.get(i).creditos + "," + alumnado.get(i).plan.to_string());
        }
        impresoraDeArchivos.close();
    }
    /**
     * Para cargar los datos de un csv
     * @param planMadre donde se guardaran los datos estadisticos
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public void fromCsv(PlanEstudiosEstadisticos planMadre) throws FileNotFoundException, IOException{
            FileReader fr = new FileReader("alumnado.csv"); 
            BufferedReader br = new BufferedReader(fr);
            String linea = br.readLine();
            linea = br.readLine();
            while(true){      
                Alumno alu = new Alumno();
                StringTokenizer token = new StringTokenizer(linea, ",");
                alu.setNombre(token.nextToken());
                alu.setApellidoPaterno(token.nextToken());
                alu.setApellidoMaterno(token.nextToken());
                alu.edad = Integer.parseInt(token.nextToken());
                alu.setDomicilio(token.nextToken());
                alu.semestre = Integer.parseInt(token.nextToken());

                alu.setNumeroDeCuenta(token.nextToken());
                token.nextToken(); token.nextToken(); token.nextToken();
                alu.plan.from_string(alu, planMadre, token.nextToken());
                alumnado.add(alu);
                linea = br.readLine();  
                if(linea==null) break;
            }
            br.close();
    }
    /**
     * Este metodo genera el numero de inscripcion. Este siendo el indice
     */
    public void sortAlumnado(){
        alumnado.sort(Comparator.comparing(Alumno::getIndicadorEscolar).thenComparing(Alumno::getIndicadorEscolar));
        Collections.reverse(alumnado);
    }
    /**
     * Añade un alumno manualmente
     * @param planMadre donde se guardaran los datos estadisticos
     */
    public void addAlumnoManual(PlanEstudiosEstadisticos planMadre){
        Scanner scan = new Scanner(System.in);
        Alumno alu = new Alumno();
        System.out.println("¿Cual es su nombre?");
        String inp = scan.next();
        alu.setNombre(inp);
        System.out.println("¿Cual es su apellido paterno?");
        inp = scan.next();
        alu.setApellidoPaterno(inp);
        System.out.println("¿Cual es su apellido materno?");
        inp = scan.next();
        alu.setApellidoMaterno(inp);
        System.out.println("¿Donde vive?");
        inp = scan.next();
        alu.setDomicilio(inp);
        System.out.println("¿Cual es su numero de cuenta?");
        inp = scan.next();
        alu.setNumeroDeCuenta(inp);
        System.out.println("¿Cual es su edad?");
        Integer inpI = scan.nextInt();
        alu.edad = inpI;
        System.out.println("¿En que semestre va?");
        inpI = scan.nextInt();
        alu.semestre = inpI;
        alu.plan = alu.plan.addPlanManual(alu, alu.plan, planMadre);
        alumnado.add(alu);
    }
    /**
     * Busca a un alumno
     * @param nombre el nombre del alumno
     * @param apellidoPaterno el apellido paterno del alumno
     * @param apellidoMaterno el apellido meterno del alumno
     * @return regresa el indice donde esta contenido
     */
    public int buscarAlumnoNombre(String nombre, String apellidoPaterno, String apellidoMaterno){
        for(int i = 0; i<alumnado.size(); i++){
            if(nombre.equals(alumnado.get(i).getNombre()) && apellidoPaterno.equals(alumnado.get(i).getApellidoPaterno()) && apellidoMaterno.equals(alumnado.get(i).getApellidoMaterno()) ){
                return i;
            }
        }
        return -1;
    }
    /**
     * Busca un alumno
     * @param cuenta el numero de cuenta del alumno
     * @return el indice donde esta contenido
     */
    public int buscarAlumnoCuenta(String cuenta){
        for(int i = 0; i<alumnado.size(); i++){
            if(cuenta.equals(alumnado.get(i).getNumeroDeCuenta())){
                return i;
            }
        }
        return -1;
    }
    /**
     * Un menu para buscar un alumno
     * @param alumnado donde estan guardados los alumnos
     * @return el indice donde esta contenido un alumno
     */
    public int buscar(Alumnado alumnado){
        Scanner scan = new Scanner(System.in);
        System.out.println("¿Quieres encontrar al alumno por 1.Nombre o por 2.Numero de Cuenta?");
        Integer inpI = scan.nextInt();
        switch(inpI){
            case(1):
                String nom, a1, a2;
                System.out.println("¿Cual es su nombre?");
                nom = scan.next();
                System.out.println("¿Cual es su apellido paterno?");
                a1 = scan.next();
                System.out.println("¿Cual es su apellido materno?");
                a2 = scan.next();
                inpI = alumnado.buscarAlumnoNombre(nom, a1, a2);
            break;
            
            case(2):
                String cuent;
                System.out.println("¿Cual es su numero de cuenta?");
                cuent = scan.next();
                inpI = alumnado.buscarAlumnoCuenta(cuent);
            break;
        }
        return inpI;
    }
    /**
     * Metodo para borrar un alumno
     * @param alumnado donde estan contenidos los alumnos
     */
    public void delete(Alumnado alumnado){
        int pos = buscar(alumnado);
        if(pos==-1){
            System.out.println("El alumno no se encontro");
        }else{
            alumnado.alumnado.remove(pos);
            System.out.println("El alumno se borro con exito");
        }
    }
    /**
     * Menu para editar un alumno
     * @param alumnado donde estan guardados los alumnos
     */
    public void edit(Alumnado alumnado){
        int pos = buscar(alumnado);
        if(pos==-1){
            System.out.println("El alumno no se encontro");
        }else{
            Scanner scan = new Scanner(System.in);
            System.out.println("¿Que quieres editar: 1.Nombre 2.Apellido Paterno 3.Appellido Materno 4.Domicilio 5.Numero de Cuenta 6.Edad 7.Semestre en el que cursa 8.Calificacion de una materia");
            Integer inpI = scan.nextInt(), inp2;
            String inp;
            switch(inpI){
                case 1:
                    System.out.println("¿Cual es el nombre?");
                    inp = scan.next();
                    alumnado.alumnado.get(pos).setNombre(inp);
                break;
                
                case 2:
                    System.out.println("¿Cual es el apellido paterno?");
                    inp = scan.next();
                    alumnado.alumnado.get(pos).setApellidoPaterno(inp);
                break;
                
                case 3:
                    System.out.println("¿Cual es el apellido materno?");
                    inp = scan.next();
                    alumnado.alumnado.get(pos).setApellidoMaterno(inp);
                break;
                
                case 4:
                    System.out.println("¿Cual es el domicilio?");
                    inp = scan.next();
                    alumnado.alumnado.get(pos).setDomicilio(inp);
                break;
                
                case 5:
                    System.out.println("¿Cual es su numero de cuenta?");
                    inp = scan.next();
                    alumnado.alumnado.get(pos).setNumeroDeCuenta(inp);
                break;
                
                case 6:
                    System.out.println("¿Cual es su edad?");
                    inp2 = scan.nextInt();
                    alumnado.alumnado.get(pos).edad= inp2;
                break;
                
                case 7:
                    System.out.println("¿Cual es su Semestre?");
                    inp2 = scan.nextInt();
                    if(inp2>15) inp2 = 15;
                    alumnado.alumnado.get(pos).semestre= inp2;
                    
                break;
                
                case 8:
                    Nodo nodo = new Nodo();
                    nodo = alumnado.alumnado.get(pos).plan.Buscar(alumnado.alumnado.get(pos).plan);
                    if(nodo!=null){
                        System.out.println("¿Cual seria la calificacion?");
                        inp2 = scan.nextInt();
                        nodo.calificacionActas = inp2;
                    }
                break;
            }
        }
    }
    /**
     * Para imprimir a los alumnos
     */
    public void print(){
        for(int i = 0; i<alumnado.size(); i++){
            System.out.println("################# El alumno: " + alumnado.get(i).getNombre() + " " + alumnado.get(i).getApellidoPaterno() + " " + alumnado.get(i).getApellidoMaterno() + " ################");
            System.out.println("Vive en " + alumnado.get(i).getDomicilio());
            System.out.println("Su Numero de cuenta es: " + alumnado.get(i).getNumeroDeCuenta());
            System.out.println("Su Edad es " + alumnado.get(i).edad + " y esta en el semestre: " + alumnado.get(i).semestre);
            System.out.println("Consiguiendo un promedio de: " + alumnado.get(i).promedioAcumulado/alumnado.get(i).materiasCursadas);
            System.out.println("Los creditos que tiene hasta ahora son: " + alumnado.get(i).creditos);
            System.out.println("Su trayectoria escolar a sido:");
            alumnado.get(i).plan.print();
            System.out.println("Basado en los anteriores datos, su numero de IndicadorEscolar es: " + alumnado.get(i).indicadorEscolar);
        }
    }
    
}
