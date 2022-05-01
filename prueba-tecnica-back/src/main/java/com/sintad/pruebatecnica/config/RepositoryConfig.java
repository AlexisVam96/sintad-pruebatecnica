package com.sintad.pruebatecnica.config;

import com.sintad.pruebatecnica.entity.Contribuyente;
import com.sintad.pruebatecnica.entity.Documento;
import com.sintad.pruebatecnica.entity.Rol;
import com.sintad.pruebatecnica.entity.Usuario;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        config.exposeIdsFor(Contribuyente.class, Documento.class);

    }
}
