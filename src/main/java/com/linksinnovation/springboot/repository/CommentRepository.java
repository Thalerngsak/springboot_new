package com.linksinnovation.springboot.repository;

import com.linksinnovation.springboot.dto.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Porjai on 9/8/2558.
 */
public interface CommentRepository extends JpaRepository<Comment, Integer> {
    public List<Comment> findByCommentLike(String comment);

    public List<Comment> findByCommentAndAuthor(String comment, String author);
}
