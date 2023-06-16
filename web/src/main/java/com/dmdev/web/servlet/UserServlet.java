package com.dmdev.web.servlet;

import com.dmdev.service.UserService;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

import java.util.function.Supplier;
@WebServlet("/users")
public class UserServlet extends HttpServlet {
    private final UserService userService = new UserService();

//    @Override
    protected void doGet(HttpServlet request, HttpServlet response) {
        userService.getUser(1L);
    }
}
