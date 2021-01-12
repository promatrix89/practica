package com.clase3.microservicios.app.repository;

import com.clase3.microservicios.app.models.entity.Articulo;
import org.springframework.data.repository.CrudRepository;

public interface ArticuloRepository extends CrudRepository<Articulo,Long> {
}
