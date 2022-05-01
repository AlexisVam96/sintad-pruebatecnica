package com.sintad.pruebatecnica.repository;

import com.sintad.pruebatecnica.entity.Documento;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "documentos")
public interface IDocumentoRepository extends PagingAndSortingRepository<Documento, Integer> {
}
