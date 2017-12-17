package com.linksinnovation.springboot.controller;

import com.linksinnovation.springboot.dto.Comment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Porjai on 8/8/2558.
 */
@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping(method = RequestMethod.GET)
    public String home(Model model) {

//        Comment comment = new Comment();
//
//        comment.setComment("this is comment");
//        comment.setAuthor("MyName");
//
//        model.addAttribute("comment", comment);
//
//        model.addAttribute("formComment",new Comment());

        return "index";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String save(@ModelAttribute("formComment") Comment formComment, Model model) {
//        System.out.println(formComment.getComment());
//        model.addAttribute("comment",formComment);
//        model.addAttribute("formComment",new Comment());
        return "index";
    }
}
