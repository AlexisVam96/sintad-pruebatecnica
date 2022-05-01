package com.sintad.pruebatecnica.repository;

import com.sintad.pruebatecnica.entity.Entidad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEntidadRepository extends JpaRepository<Entidad, Integer> {
}
