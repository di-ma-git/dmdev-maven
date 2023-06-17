package com.dmdev.service;

import com.dmdev.database.dao.UserDao;
import com.dmdev.dto.UserDto;

import java.util.Optional;

public class UserService {
    private final UserDao userDao = new UserDao();
    public Optional<UserDto> getUser(Long id) {
        var user = userDao.findById(id);
        return user.map(it -> new UserDto());
    }
}
