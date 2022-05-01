package com.sintad.pruebatecnica.repository;

import com.sintad.pruebatecnica.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {

    public Usuario findByUsername(String username);
}
