package com.clase3.microservicios.app.services;

import com.clase3.microservicios.app.models.entity.Articulo;
import com.clase3.microservicios.app.repository.ArticuloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ArticuloServiceImpl implements ArticuloService{

    @Autowired
    private ArticuloRepository repository;

    @Override
    public Iterable<Articulo> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Articulo> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Articulo save(Articulo articulo) {
        return repository.save(articulo);
    }
}
