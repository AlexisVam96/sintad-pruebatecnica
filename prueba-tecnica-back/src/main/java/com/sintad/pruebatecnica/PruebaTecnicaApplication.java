package com.sintad.pruebatecnica;

import com.sintad.pruebatecnica.entity.Usuario;
import com.sintad.pruebatecnica.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class PruebaTecnicaApplication implements CommandLineRunner {

	@Autowired(required=true)
	private BCryptPasswordEncoder passwordEncoder;

	@Autowired
	private UsuarioService usuarioService;

	public static void main(String[] args) {
		SpringApplication.run(PruebaTecnicaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String password = "12345";

		for (int i=0; i<4; i++) {
			String passwordBcrypt = passwordEncoder.encode(password);
			System.out.println(passwordBcrypt);
		}

		Usuario usuario = usuarioService.findByUsername("alexis");
		System.out.println(usuario.toString());
	}

}
