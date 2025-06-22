package com.eartrainer.eartrainer.repository;

import com.eartrainer.eartrainer.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // automatic Spring implementation
}
