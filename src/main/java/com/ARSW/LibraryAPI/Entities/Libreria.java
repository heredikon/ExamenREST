/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ARSW.LibraryAPI.Entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author estudiante
 */
public class Libreria {
    
    
    private String nombre; 
    private String direccion;
    private String telefono;
    private int id;
    private Map<String,Libro> libros;

    public Libreria(String nombre, String direccion, String telefono, int id, Map<String,Libro> libros) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.id = id;
        this.libros = libros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Map<String,Libro> getLibros() {
        return libros;
    }

    public void setLibros(Map<String,Libro> libros) {
        this.libros = libros;
    }
    
    
}
