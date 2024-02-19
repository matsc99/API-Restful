package com.mateuscruz.mongodb.resources;

import com.mateuscruz.mongodb.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value="/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        User Mateus = new User("1", "Mateus Cruz", "email@email.com");
        User Fernanda = new User("2", "Fernanda Rogana", "email@email.com");
        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(Mateus, Fernanda));
        return ResponseEntity.ok().body(list);
    }
}
