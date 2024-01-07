package org.example.jwt.service;


import org.example.jwt.entity.Usuario;

import java.util.Optional;

public interface UserService {
    Usuario save(Usuario usuario);
    Optional<Usuario> findByUsername(String username);
    Optional<Usuario> findById(Long id);
    Usuario update(Usuario usuario);
    void delete(Long id);
}
