package com.example.shoppingmalladminbe.controller;

import com.example.shoppingmalladminbe.repository.UserRepository;
import com.example.shoppingmalladminbe.service.UserService;
import com.example.shoppingmalladminbe.util.message.Message;
import com.example.shoppingmalladminbe.util.message.StatusEnum;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserController {

    UserService userService;

    @GetMapping("/users")
    public ResponseEntity pageFindAll(Pageable pageable) {
        System.out.println(pageable.toString());
        return new ResponseEntity(new Message(userService.pageFindAll(pageable), StatusEnum.OK), HttpStatus.OK);
    }
}
