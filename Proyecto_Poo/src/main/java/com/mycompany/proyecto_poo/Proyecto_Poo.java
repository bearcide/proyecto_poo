/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto_poo;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author emilio
 */
public class Proyecto_Poo {

    public static void main(String[] args) throws IOException {
        Integer creditosNecesarios[] = {46, 90, 136, 178, 220, 268, 314, 358, 398, 438, 438, 438, 438, 438, 438};
        NodoEstadistico rootMadre = new NodoEstadistico(1, "1", 0, 0);
        PlanEstudiosEstadisticos planMadre = new PlanEstudiosEstadisticos(rootMadre);
        planMadre.innit();
        String nombres[] = {"Emilio", "Brayan", "Cris", "Alejandro", "Lalo", "Tota", "3333", "Pau", "ÑÑÑÑÑ"};
        String apellidos[] = {"Garcia", "Montez", "Cristero", "aeoui", "Aleman", "Tromp", "ñoño", "Cabeza", "Bourbon"};
        String ubicaciones[] = {"Coyoacan", "Tlalpan", "San Nicolas Totolapan"};
        Alumnado alumnado = new Alumnado();
        //alumnado.innit(100, nombres, apellidos, ubicaciones, creditosNecesarios, planMadre);
        //alumnado.sortAlumnado();
        //alumnado.to_csv();
        //alumnado.fromCsv(planMadre);
        //alumnado.test(100);
        //alumnado.sort(Comparator.comparing(Alumno::getIndicadorEscolar).thenComparing(Alumno::getIndicadorEscolar));
        //Collections.reverse(alumnado);
        Scanner scan = new Scanner(System.in);
        
        boolean run = true;
        while(run){
            System.out.println("1. Crear Alumnado");
            System.out.println("2. Hacer operaciones manuales");
            System.out.println("3. Generar el Numero de Inscripcion");
            System.out.println("4. Buscar");
            System.out.println("5. Guardar");
            System.out.println("6. Cargar");
            System.out.println("7. Imrpimir");
            System.out.println("8. Salir");
            Integer inpI = scan.nextInt(), inp2;
                switch(inpI){
                case 1:
                    System.out.println("Cual es el tamaño?");
                    inp2 = scan.nextInt();
                    alumnado.innit(inp2, nombres, apellidos, ubicaciones, creditosNecesarios, planMadre);
                    System.out.println("Se creo al alumnado con exito.");
                break;

                case 2:
                    System.out.println("Quieres: 1. Añadir un alumno 2. Borrar un alumno 3. Editar un alumno");
                    inp2 = scan.nextInt();
                    switch(inp2){
                        case 1:
                            alumnado.addAlumnoManual(planMadre);
                        break;

                        case 2:
                            alumnado.delete(alumnado);
                        break;

                        case 3:
                            alumnado.edit(alumnado);
                        break;
                    }
                    System.out.println("La operacion se hizo");
                break;

                case 3:
                    alumnado.sortAlumnado();
                    System.out.println("Ya se genero el numero de inscripcion");
                break;

                case 4:
                    int res = alumnado.buscar(alumnado);
                    if(res == -1){
                        System.out.println("No se encontro");
                    }else{
                        System.out.println("Si esta en el sistema"); 
                    }
                break;

                case 5:
                    System.out.println("Deseas guardar: 1. Todos los alumnos 2.Todas las materias 3. Un alumno");
                    inp2 = scan.nextInt();
                    switch(inp2){
                        case 1:
                            alumnado.to_csv();
                        break;

                        case 2:
                            planMadre.toCsv();
                        break;

                        case 3:
                            int pos = alumnado.buscar(alumnado);
                            alumnado.alumnado.get(pos).toCsv(alumnado.alumnado.get(pos));
                        break;
                    }
                    System.out.println("Se guardaron los datos");
                break;

                case 6:
                    alumnado.fromCsv(planMadre);
                    System.out.println("Se cargaron los archivos");
                break;

                case 7:
                    System.out.println("Los alumnos guardados son: ");
                    alumnado.print();
                break;
                
                case 8:
                    run = false;
                break;

                default:
                    System.out.println("La opcion dada no es valida");
                break;
            }
        }
    }
}