/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ARSW.LibraryAPI.Persistance;

import com.ARSW.LibraryAPI.Entities.Libreria;
import com.ARSW.LibraryAPI.Entities.Libro;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;

/**
 *
 * @author estudiante
 */
@Service
public class LibraryPersistance {
    Map<String,Libreria> librerias=new HashMap<>();
     Map<String,Libro> libros = new HashMap<>();
    

    public LibraryPersistance() {
        
       
        for (int i=0; i<10; i++){libros.put("libro"+ i, new Libro("libro"+i, "pepeman"+ i, "la historio de pepeman"+ i));}
        librerias.put("libreria1", new Libreria("libreria1", "calle falsa 123", "321321321",1, libros));
        librerias.put("libreria2", new Libreria("libreria2", "calle falsa 234", "321321321",2, libros));
        librerias.put("libreria3", new Libreria("libreria3", "calle falsa 345", "321321321",3, libros));
    }

    public Map<String, Libreria> getLibrerias() {
        return librerias;
    }

    public void setLibrerias(Map<String, Libreria> librerias) {
        this.librerias = librerias;
    }

    public Map<String, Libro> getLibros() {
        return libros;
    }

    public void setLibros(Map<String, Libro> libros) {
        this.libros = libros;
    }
    
    public Boolean deleteLibreria(int id){
        Boolean exito=false;
        if (librerias.get("libreria"+ id).getLibros().isEmpty()){
            librerias.remove("libreria"+id);
            exito=true;
        }
        
        return exito;
    }
    public void insertlibro(int id, Libro libro){
        librerias.get("libreria"+id).getLibros().put("newBook", libro);
        
    }
    
    
}
