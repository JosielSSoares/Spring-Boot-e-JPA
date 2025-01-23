package com.treinandospring.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.treinandospring.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
