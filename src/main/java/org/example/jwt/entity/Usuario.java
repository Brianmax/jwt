package org.example.jwt.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String username;
    String password;
    String role;
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    Set<Comment> comments;
    public Usuario() {
    }
    public Usuario(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role=role;
    }
    public Usuario(Long id, String username, String password, String role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role=role;
    }
}
