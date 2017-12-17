package com.linksinnovation.springboot.dto;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Porjai on 9/8/2558.
 */
@Entity
public class Authority implements GrantedAuthority {

    @Id
    private String authority;

    @Override
    public String getAuthority() {
        return null;
    }
}
