package org.example.jwt.service.impl;

import org.example.jwt.dao.CommentDao;
import org.example.jwt.entity.Comment;
import org.example.jwt.service.CommentService;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class CommentServiceImpl implements CommentService {
    private final CommentDao commentDao;

    public CommentServiceImpl(CommentDao commentDao) {
        this.commentDao = commentDao;
    }
    @Override
    public Comment save(Comment comment) {
        return commentDao.save(comment);
    }

    @Override
    public Optional<Comment> findById(Long id) {
        return commentDao.findById(id);
    }

    @Override
    public Comment update(Comment comment) {
        return commentDao.save(comment);
    }

    @Override
    public void delete(Long id) {
        commentDao.deleteById(id);
    }
}