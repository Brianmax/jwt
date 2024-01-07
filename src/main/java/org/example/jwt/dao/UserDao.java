package org.example.jwt.dao;

import org.example.jwt.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<Usuario, Long> {
}
