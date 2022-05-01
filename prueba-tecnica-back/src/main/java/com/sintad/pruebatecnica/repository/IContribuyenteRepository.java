package com.sintad.pruebatecnica.repository;

import com.sintad.pruebatecnica.entity.Contribuyente;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "contribuyentes")
public interface IContribuyenteRepository extends PagingAndSortingRepository<Contribuyente, Integer> {
}
