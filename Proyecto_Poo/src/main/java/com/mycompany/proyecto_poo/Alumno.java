/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_poo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
/**
 * Esta clase srive para simular a un alumno
 */
/**
 *
 * @author emilio
 */
public class Alumno {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String numeroDeCuenta;
    private String domicilio;
    public int semestre, edad, materiasPasadas;
    public double promedioAcumulado, materiasCursadas, creditos, indicadorEscolar;
    
    Nodo root = new Nodo(1, "1", 0, 0);
    PlanEstudios plan = new PlanEstudios(root);
    /**
     * Constructor vacío de la clase Alumno.
     */
    public Alumno() {
        plan.innit();
        creditos = 0;
        materiasCursadas = 0;
        semestre = 0;
        edad = 0;
        materiasPasadas = 0;
    }
    
    /**
     * Constructor con atributos de la clase Alumno.
     *
     * @param nombre           Nombre del alumno.
     * @param apellidoPaterno  Apellido paterno del alumno.
     * @param apellidoMaterno  Apellido materno del alumno.
     * @param numeroDeCuenta   Número de cuenta del alumno.
     * @param domicilio        Domicilio del alumno.
     * @param creditos         Número de créditos del alumno.
     * @param promedioAcumulado         Promedio del alumno.
     */
    public Alumno(String nombre, String apellidoPaterno, String apellidoMaterno) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.plan.innit();
    }

    /**
     * Obtiene el nombre del alumno.
     *
     * @return El nombre del alumno.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del alumno.
     *
     * @param nombre El nuevo nombre del alumno.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el apellido paterno del alumno.
     *
     * @return El apellido paterno del alumno.
     */
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    /**
     * Establece el apellido paterno del alumno.
     *
     * @param apellidoPaterno El nuevo apellido paterno del alumno.
     */
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    /**
     * Obtiene el apellido materno del alumno.
     *
     * @return El apellido materno del alumno.
     */
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    /**
     * Establece el apellido materno del alumno.
     *
     * @param apellidoMaterno El nuevo apellido materno del alumno.
     */
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    
    
    /**
     * Obtiene el número de cuenta del alumno.
     *
     * @return El número de cuenta del alumno.
     */
    public String getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    /**
     * Establece el número de cuenta del alumno.
     *
     * @param numeroDeCuenta El nuevo número de cuenta del alumno.
     */
    public void setNumeroDeCuenta(String numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    /**
     * Obtiene el domicilio del alumno.
     *
     * @return El domicilio del alumno.
     */
    public String getDomicilio() {
        return domicilio;
    }

    /**
     * Establece el domicilio del alumno.
     *
     * @param domicilio El nuevo domicilio del alumno.
     */
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    /**
     * Obtiene el número de créditos del alumno.
     *
     * @return El número de créditos del alumno.
     */
    public double getCreditos() {
        return creditos;
    }

    /**
     * Establece el número de créditos del alumno.
     *
     * @param creditos El nuevo número de créditos del alumno.
     */
    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    /**
     * Obtiene el promedioAcumulado del alumno.
     *
     * @return El promedioAcumulado del alumno.
     */
    public double getPromedio() {
        return promedioAcumulado;
    }

    /**
     * Establece el promedioAcumulado del alumno.
     *
     * @param promedioAcumulado El nuevo promedioAcumulado del alumno.
     */
    public void setPromedio(double promedioAcumulado) {
        this.promedioAcumulado = promedioAcumulado;
    }

    /**
     * Carga nombres o apellidos desde un archivo CSV y los guarda en el arreglo correspondiente.
     *
     * @param archivoCSV Ruta del archivo CSV que contiene los nombres o apellidos.
     * @return Arreglo de Strings con los nombres o apellidos cargados desde el archivo.
     * @throws IOException Si hay un error al leer el archivo.
     */
    private String[] cargarDesdeArchivoCSV(String archivoCSV) throws IOException {
        List<String> listaNombres = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(archivoCSV))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                listaNombres.add(linea);
            }
        }
        return listaNombres.toArray(new String[0]);
    }
    
    public double getIndicadorEscolar() {
        return indicadorEscolar;
    }


    /**
     * Genera nombres aleatorios para el alumno basados en arreglos dados de nombres y apellidos.
     */
    public void generarNombresAleatoriosYUbicacion(String[] nombres,String[] apellidos,String[] ubicaciones) {
        Random random = new Random();
        nombre = nombres[random.nextInt(nombres.length)];
        apellidoPaterno = apellidos[random.nextInt(apellidos.length)];
        apellidoMaterno = apellidos[random.nextInt(apellidos.length)];
        domicilio = ubicaciones[random.nextInt(ubicaciones.length)];
    }
    /**
     * Genera un numero aleatorio de 9 digitos
     */
    public void generarNumeroCuenta(){
        Random random = new Random();
        numeroDeCuenta = "";
        String num;
        for(int i = 0; i<9; i++){
            if(i==0) num = Integer.toString(random.nextInt(8) + 1);
            else num = Integer.toString(random.nextInt(9));
            numeroDeCuenta += num;
        }
    }
    /**
     * Este metodo crea la edad y en base a esto crea el semestre
     */
    public void generarEdadSemestre(){
        Random random = new Random();
        int rint = random.nextInt(8) + 18;
        if(rint>25){
            edad = random.nextInt(25) + 26;
            semestre = 15;
        }else{
            edad = rint;
            semestre = edad-18 + random.nextInt(2) + 1;
        }
        
    }
   /**
    * Este metodo genera el indicador escolar
    * @param alu El alumno al cual le vamos a crear el indicador escolar
    * @param creditosNecesarios Los creditos que debe tener dependiendo del semestre
    * @return regresa el indicador
    */
    public double generarIndicadorEscolar(Alumno alu, Integer[] creditosNecesarios){
        return ((alu.promedioAcumulado/alu.materiasCursadas)*(alu.materiasPasadas*100/alu.materiasCursadas)*(alu.creditos*100/creditosNecesarios[alu.semestre-1]));
    }
    /**
     * Crea a un alumno
     * @param nombres los nombres al azar
     * @param apellidos los apellidos al azar
     * @param ubicaciones las ubicaciones al azar
     * @param creditosNecesarios los creditas que necesita un alumno por semestre
     * @param planMadre donde vamos a guardar nuestros datos estadisticos
     * @return regresa al alumno
     */
    public Alumno generarAlumno(String[] nombres, String[] apellidos, String[] ubicaciones, Integer[] creditosNecesarios, PlanEstudiosEstadisticos planMadre){
        Alumno alu = new Alumno();
        alu.generarNombresAleatoriosYUbicacion(nombres, apellidos, ubicaciones);
        System.out.println("################# Generando al alumno: " + alu.nombre + " " + alu.apellidoPaterno + " " + alu.apellidoMaterno + " ################");
        System.out.println("Vive en " + alu.domicilio);
        alu.generarNumeroCuenta();
        System.out.println("Su Numero de cuenta es: " + alu.numeroDeCuenta);
        alu.generarEdadSemestre();
        System.out.println("Su Edad es " + alu.edad + " y esta en el semestre: " + alu.semestre);
        System.out.println("Su trajectoria en la Facultad es la siguiente: ");
        Nodo root = new Nodo(1, "1", 0, 0);
        PlanEstudios plan = new PlanEstudios(root);
        plan.innit();
        plan = plan.breadthFrist(alu, plan, planMadre);
        alu.plan = plan;
        System.out.println("Consiguiendo un promedio de: " + alu.promedioAcumulado/alu.materiasCursadas);
        System.out.println("Los creditos que tiene hasta ahora son: " + alu.creditos + " que es un avanze curricular de: " + alu.creditos/creditosNecesarios[alu.semestre-1]);
        alu.indicadorEscolar = alu.generarIndicadorEscolar(alu, creditosNecesarios);
        System.out.println("Basado en los anteriores datos, su numero de IndicadorEscolar es: " + alu.indicadorEscolar);
        return alu;
    }
    /**
     * Guarda un alumno en un csv
     * @param alu el alumno a guardar
     * @throws IOException 
     */
    public void toCsv(Alumno alu) throws IOException{
        FileWriter fw = new FileWriter(nombre+"_"+apellidoPaterno+"_"+apellidoMaterno+".csv");
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter impresoraDeArchivos = new PrintWriter(bw);
        impresoraDeArchivos.println("Edad,Ubicacion,Semestre,Numero de Cuenta,Promedio,Creditos");
        impresoraDeArchivos.println(edad+","+domicilio+","+semestre+","+numeroDeCuenta+","+promedioAcumulado/materiasCursadas+","+creditos);
        impresoraDeArchivos.println("Trayectoria Escolar");
        impresoraDeArchivos.println("Asignatura,Clave,Semestre,Calificacion en Actas");
        Queue<Nodo> queue = new LinkedList();
        Nodo r = alu.plan.root;
	if(r!=null){
            queue.add(r);
            while(!queue.isEmpty()){
                r = (Nodo)queue.poll();   
                if(r.clave!=0&&r.calificacionActas!=0){
                    impresoraDeArchivos.println(r.nombre+","+r.clave+","+r.semestre+","+r.calificacionActas);

                }
                for(int i = 0; i<r.sons.size(); i++){
                    if(r.calificacionActas!=0||r.clave==0){
                        queue.add(r.sons.get(i));    
                    }
                }
            }
	}
        impresoraDeArchivos.close();
    }
    
    
    /**
     * Representación de cadena del objeto Alumno.
     *
     * @return Cadena que representa el objeto Alumno.
     */
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + ", numeroDeCuenta=" + numeroDeCuenta + ", domicilio=" + domicilio + ", creditos=" + creditos + ", materiasCursadas=" + materiasCursadas + ", semestre=" + semestre + ", edad=" + edad + ", promedioAcumulado=" + promedioAcumulado + ", root=" + root + ", plan=" + plan + '}';
    }
}
