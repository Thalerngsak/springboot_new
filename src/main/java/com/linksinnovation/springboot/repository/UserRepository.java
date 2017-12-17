package com.linksinnovation.springboot.repository;

import com.linksinnovation.springboot.dto.Users;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Porjai on 9/8/2558.
 */
public interface UserRepository extends JpaRepository<Users, String> {
}
