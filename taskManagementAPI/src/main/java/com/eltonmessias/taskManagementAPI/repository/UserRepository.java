package com.eltonmessias.taskManagementAPI.repository;

import com.eltonmessias.taskManagementAPI.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
