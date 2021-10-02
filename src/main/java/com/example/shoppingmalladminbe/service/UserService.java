package com.example.shoppingmalladminbe.service;

import com.example.shoppingmalladminbe.entity.User;
import com.example.shoppingmalladminbe.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    UserRepository userRepository;

    public Page<User> pageFindAll(Pageable pageable) {
        return userRepository.findAll(pageable);
    }
}
