package com.jwt.Example.JwtExample3.service;

import com.jwt.Example.JwtExample3.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> store = new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(), "Aakash Kumar","abc@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Roopak Kumar","aojh@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Satyam Karn","frc@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Rahul Karn","bc@gmail.com"));
    }

    public List<User> getUsers(){
        return this.store;
    }

}
