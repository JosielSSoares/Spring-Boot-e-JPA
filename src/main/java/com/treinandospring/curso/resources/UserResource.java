package com.treinandospring.curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.treinandospring.curso.entities.User;


@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User usuario = new User(1L, "Josiel Amaral", "josielsoares2@hotmail.com", "+556799108-8734", "123456");
        return ResponseEntity.ok().body(usuario);

    }
}
