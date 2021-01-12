package com.clase3.microservicios.app.services;

import com.clase3.microservicios.app.models.entity.Articulo;

import java.util.Optional;

public interface ArticuloService {
    public Iterable<Articulo> findAll();

    public Optional<Articulo> findById(Long id);

    public Articulo save(Articulo articulo);
}
