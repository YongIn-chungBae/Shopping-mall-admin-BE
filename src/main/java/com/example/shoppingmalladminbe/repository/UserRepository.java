package com.example.shoppingmalladminbe.repository;

import com.example.shoppingmalladminbe.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByIdAndPassword(String id, String password);

    User findByIdx(Long idx);
}
