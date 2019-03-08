/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ARSW.LibraryAPI.Entities;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 *
 * @author estudiante
 */
public class Libro {
    
    private String nombre;
    private String autor;
    private String Sinopsis;
    
    
    public Libro(String nombre, String autor, String Sinopsis) {
        this.nombre = nombre;
        this.autor = autor;
        this.Sinopsis = Sinopsis;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getSinopsis() {
        return Sinopsis;
    }

    public void setSinopsis(String Sinopsis) {
        this.Sinopsis = Sinopsis;
    }
    
    
    
    
    
}
