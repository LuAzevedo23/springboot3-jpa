package com.luazevedodeveloper.spring.config;

import com.luazevedodeveloper.spring.entities.Usuario;
import com.luazevedodeveloper.spring.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public void run(String... args) throws Exception {

        Usuario user1 = new Usuario(null, "Marcia Santos", "marcia@gmail.com", "3451-2514", "45@2587");
        Usuario user2 = new Usuario(null, "Lucca Matos", "lucca@gmail.com", "98262-5874", "987*254");
        Usuario user3 = new Usuario(null, "Larissa Gonçalves", "larissa@gmail.com", "2978-4578", "258-55*");
        Usuario user4 = new Usuario(null, "Marcia Santos", "marcia@gmail.com", "3451-2514", "45@2587");
        Usuario user5 = new Usuario(null, "Marcelo Azevedo", "marcelo@gmail.com", "99650-9879", "288***@");

        usuarioRepository.saveAll(Arrays.asList(user1, user2,user3,user4,user5));
    }
}





