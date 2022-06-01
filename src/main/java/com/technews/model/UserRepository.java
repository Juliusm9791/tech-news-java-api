package com.technews.model;

import com.technews.model.User;
import org.springframework.data.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
    User findUserByEmail(String email) throws Exception;
}
