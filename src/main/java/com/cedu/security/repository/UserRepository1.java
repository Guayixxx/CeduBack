package com.cedu.security.repository;

import com.cedu.security.model.User1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository1 extends JpaRepository<User1, String> {
}
