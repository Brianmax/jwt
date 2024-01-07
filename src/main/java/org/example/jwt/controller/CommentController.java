package org.example.jwt.controller;

import org.example.jwt.entity.Comment;
import org.example.jwt.service.CommentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/comment")
public class CommentController {
    private final CommentService commentService;
    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @PostMapping
    public Comment save(@RequestBody Comment comment) {
        return commentService.save(comment);
    }

    @GetMapping("/{id}")
    public Comment get(@PathVariable Long id) {
        return commentService.findById(id).get();
    }

    @PutMapping
    public Comment update(@RequestBody Comment comment) {
        return commentService.update(comment);
    }

    @DeleteMapping
    public void delete(@PathVariable Long id) {
        commentService.delete(id);
    }
}
