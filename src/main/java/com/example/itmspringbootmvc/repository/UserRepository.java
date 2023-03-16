package com.example.itmspringbootmvc.repository;

import com.example.itmspringbootmvc.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findAll();
    User save(User user);
    Optional<User> findById(Long id);
    void deleteById(Long id);
}
