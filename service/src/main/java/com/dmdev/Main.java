package com.dmdev;

import com.dmdev.service.UserService;

public class Main {
    public static void main(String[] args) {
        var userService = new UserService();
        System.out.println(userService.getUser(25L));
    }
}