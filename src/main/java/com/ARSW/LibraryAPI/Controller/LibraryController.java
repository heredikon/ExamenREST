/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ARSW.LibraryAPI.Controller;

import com.ARSW.LibraryAPI.Entities.Libro;
import com.ARSW.LibraryAPI.Persistance.LibraryPersistance;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author estudiante
 */
@RestController
public class LibraryController {

    @Autowired
    public LibraryPersistance libreriaO;

    @GetMapping("/librerias")
    public ResponseEntity<?> controladorLibrerias() {
        try {
            return new ResponseEntity<>(libreriaO.getLibrerias(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            return new ResponseEntity<>("ERROR 404 NOT FOUND", HttpStatus.NOT_FOUND);
        }

    }

    @GetMapping("/librerias/{id}/libros")
    public ResponseEntity<?> controladorLibrosDeLibreria(@PathVariable("id") int id) {
        try {
            return new ResponseEntity<>(libreriaO.getLibrerias().get("libreria" + id).getLibros(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            return new ResponseEntity<>("ERROR 404 NOT FOUND", HttpStatus.NOT_FOUND);
        }

    }

    @DeleteMapping("/librerias/{id}")
    public ResponseEntity<?> controladorEliminaLibreria(@PathVariable("id") int id) {
        if (libreriaO.deleteLibreria(id)) {
            try {
                return new ResponseEntity<>(HttpStatus.GONE);
            } catch (Exception ex) {
                return new ResponseEntity<>("ERROR 401 NOT ALLOWED", HttpStatus.FORBIDDEN);
            }
        }
        return new ResponseEntity<>("ERROR 401 NOT ALLOWED", HttpStatus.HTTP_VERSION_NOT_SUPPORTED);

    }

    /*curl -i -X POST -H 'Content-Type: application/json' -d 
    {"el diablo usa prada":{"nombre":"el diablo usa prada","autor":"pepeman34","sinopsis":"la historio de pepemanmanwoman"}
    http://localhost:8080/librerias/3*/
    
    @PostMapping("/librerias/{id}")
    public @ResponseBody ResponseEntity<?> controladorAgregarLibro(@PathVariable("id") int id,Libro libro) {
        try {
            libreriaO.insertlibro(id, libro);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception ex) {
            return new ResponseEntity<>("ERROR 405 NOT ALLOWED", HttpStatus.LOCKED);
        }
    }
    
    

}
