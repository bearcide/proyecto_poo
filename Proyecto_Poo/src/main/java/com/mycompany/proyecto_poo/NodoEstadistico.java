package com.mycompany.proyecto_poo;

import java.util.LinkedList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Metodo para los nodos en el arbol
 */
public class NodoEstadistico extends Nodo{
    double alumnosInscritos = 0, alumnosPasados = 0, promedioAcumulado = 0;
    LinkedList<NodoEstadistico> sons = new LinkedList<>(); 
    
    public NodoEstadistico(Integer semestre, String nombre, Integer clave, Integer creditos) {
        this.clave = clave;
        this.creditos = creditos;
        this.semestre = semestre;
        this.nombre = nombre;
    }
    
    public void add(NodoEstadistico son){
        sons.add(son);
    }
    
}
