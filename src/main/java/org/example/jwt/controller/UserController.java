package org.example.jwt.controller;

import org.example.jwt.entity.Usuario;
import org.example.jwt.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {
    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public Usuario save(@RequestBody Usuario usuario) {
        return userService.save(usuario);
    }

    @GetMapping("/{id}")
    public Usuario get(@PathVariable Long id) {
        return userService.findById(id).get();
    }

    @PutMapping
    public Usuario update(@RequestBody Usuario usuario) {
        return userService.update(usuario);
    }

    @DeleteMapping
    public void delete(@PathVariable Long id) {
        userService.delete(id);
    }
}
