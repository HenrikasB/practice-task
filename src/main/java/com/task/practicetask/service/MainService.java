package com.task.practicetask.service;

import com.task.practicetask.module.User;
import org.springframework.stereotype.Service;

@Service
public class MainService {


    public void printInfo(User user) {
        System.out.println("Loading...");
        System.out.println(user);
        System.out.println("User created!");
    }
}
