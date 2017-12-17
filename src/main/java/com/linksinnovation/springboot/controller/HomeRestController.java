package com.linksinnovation.springboot.controller;

import com.linksinnovation.springboot.dto.Comment;
import com.linksinnovation.springboot.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Porjai on 8/8/2558.
 */
@RestController
@RequestMapping("/api")
public class HomeRestController {

    @Autowired
    private CommentRepository commentRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<Comment> home() {
//        Comment comment = new Comment();
//        comment.setComment("comment");
//        comment.setAuthor("author");

        return commentRepository.findAll();
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping(method = RequestMethod.POST)
    public Comment save(@Validated @RequestBody Comment comment) {
//        if(result.hasErrors()){
//            System.out.println("has "+result.getErrorCount()+"error");
//        }
        return commentRepository.save(comment);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public List<Comment> delete(@PathVariable("id") Integer id) {
        commentRepository.delete(id);
        return commentRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Comment update(@Validated @RequestBody Comment comment) {
        return commentRepository.save(comment);
    }

    @RequestMapping(value = "/find/{id}", method = RequestMethod.GET)
    public Comment findOne(@PathVariable("id") Integer id) {
        return commentRepository.findOne(id);
    }

    @RequestMapping(value = "/search/{comment}", method = RequestMethod.GET)
    public List<Comment> searchComment(@PathVariable("comment") String keyword) {
        return commentRepository.findByCommentLike("%" + keyword + "%");
    }

    @RequestMapping(value = "/find/{comment}/{author}")
    public List<Comment> findByCommentAndAuthor(@PathVariable("comment") String comment, @PathVariable("author") String author) {
        return commentRepository.findByCommentAndAuthor(comment, author);
    }
}
