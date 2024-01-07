package org.example.jwt.service.impl;

import org.example.jwt.dao.UserDao;
import org.example.jwt.entity.Usuario;
import org.example.jwt.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public Usuario save(Usuario usuario) {
        return userDao.save(usuario);
    }

    @Override
    public Optional<Usuario> findByUsername(String username) {
        return Optional.empty();
    }

    @Override
    public Optional<Usuario> findById(Long id) {
        return userDao.findById(id);
    }

    @Override
    public Usuario update(Usuario usuario) {
        return userDao.save(usuario);
    }

    @Override
    public void delete(Long id) {
        userDao.deleteById(id);
    }
}
