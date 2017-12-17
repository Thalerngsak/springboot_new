package com.linksinnovation.springboot.controller;

import com.linksinnovation.springboot.repository.CommentRepository;
import junit.framework.TestCase;
import org.mockito.Mockito;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.web.context.WebApplicationContext;

import java.util.Collections;

public class HomeRestControllerTest extends TestCase {

    private WebApplicationContext wac;

    private HomeRestController homeRestController;

    public void setUp() throws Exception {
        super.setUp();

    }

    public void tearDown() throws Exception {

    }

    @org.junit.Test
    public void testHome() throws Exception {

//        CommentRepository mock =  Mockito.mock(CommentRepository.class);
//        Mockito.when(mock.findAll()).thenReturn(Collections.EMPTY_LIST);
//        ReflectionTestUtils.setField(homeRestController,"");
//        String contentAsString = moc

    }

    public void testSave() throws Exception {

    }

    public void testDelete() throws Exception {

    }

    public void testUpdate() throws Exception {

    }

    public void testFindOne() throws Exception {

    }

    public void testSearchComment() throws Exception {

    }

    public void testFindByCommentAndAuthor() throws Exception {

    }
}