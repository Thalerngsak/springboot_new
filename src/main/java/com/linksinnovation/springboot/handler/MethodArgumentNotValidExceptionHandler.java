package com.linksinnovation.springboot.handler;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.*;

/**
 * Created by Porjai on 8/8/2558.
 */
@ControllerAdvice
public class MethodArgumentNotValidExceptionHandler {
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, Object> handler(MethodArgumentNotValidException ex) {
        Map<String, Object> map = new HashMap();
        List<Object> list = new ArrayList<Object>();
        for (FieldError error : ex.getBindingResult().getFieldErrors()) {
            Map<String, Object> mapError = new HashMap();
            mapError.put("field", error.getField());
            mapError.put("message", error.getDefaultMessage());
        }
        map.put("errors", list);
        return map;
    }
}
