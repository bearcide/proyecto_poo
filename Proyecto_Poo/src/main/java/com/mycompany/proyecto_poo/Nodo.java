/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_poo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Nodo para el arbol
 */
public class Nodo{
    Integer clave, creditos, semestre, calificacionActas=0;
    String nombre;
    LinkedList<Nodo> sons = new LinkedList<>(); 
    Boolean passed = false;

    public Nodo() {
    }

    public Nodo(Integer semestre, String nombre, Integer clave, Integer creditos) {
        this.clave = clave;
        this.creditos = creditos;
        this.semestre = semestre;
        this.nombre = nombre;
    }

    public Integer getClave() {
        return clave;
    }

    public Integer getCreditos() {
        return creditos;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public String getNombre() {
        return nombre;
    }
    
    public LinkedList<Nodo> getSons() {
        return sons;
    }

    public Boolean getPassed() {
        return passed;
    }

    public void setClave(Integer clave) {
        this.clave = clave;
    }

    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSons(LinkedList<Nodo> sons) {
        this.sons = sons;
    }

    public void setPassed(Boolean passed) {
        this.passed = passed;
    }
    
    public void add(Nodo son){
        sons.add(son);
    }
}
