package org.example.jwt.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "comment")
@Getter
@Setter
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String comment;
    @ManyToOne
    @JoinColumn(name = "user_id")
    Usuario usuario;
    public Comment() {
    }
    public Comment(String comment, Usuario usuario) {
        this.comment = comment;
        this.usuario = usuario;
    }
    public Comment(Long id, String comment, Usuario usuario) {
        this.id = id;
        this.comment = comment;
        this.usuario = usuario;
    }
}
