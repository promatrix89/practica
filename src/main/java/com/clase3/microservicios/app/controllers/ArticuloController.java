package com.clase3.microservicios.app.controllers;


import com.clase3.microservicios.app.models.entity.Articulo;
import com.clase3.microservicios.app.services.ArticuloService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
public class ArticuloController {
    @Autowired
    private ArticuloService service;

    @GetMapping
    public ResponseEntity<?> verTodos(){
        return ResponseEntity.ok().body(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarPorId(@PathVariable Long id){
        Optional<Articulo> o = service.findById(id);
        if(!o.isPresent()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(o.get());
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Articulo articulo){
        Articulo articuloBd=service.save(articulo);
        return ResponseEntity.status(HttpStatus.CREATED).body(articuloBd);
    }
}
