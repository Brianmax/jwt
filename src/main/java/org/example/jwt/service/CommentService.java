package org.example.jwt.service;


import org.example.jwt.entity.Comment;

import java.util.Optional;

public interface CommentService {
    Comment save(Comment comment);
    Optional<Comment> findById(Long id);
    Comment update(Comment comment);
    void delete(Long id);
}
