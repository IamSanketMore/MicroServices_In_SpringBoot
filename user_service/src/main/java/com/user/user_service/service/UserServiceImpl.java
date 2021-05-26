package com.user.user_service.service;

import com.user.user_service.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements  IUserService
{
    List<User> list = List.of(
            new User(1311L,"Sanet More","7889465654665"),
            new User(1L,"Parag More","7889465654665")
    );
    @Override
    public User getUser(Long userId) {
        return this.list.stream().filter(user -> user.getUserId().equals(userId)).findAny().orElseThrow();
    }
}
