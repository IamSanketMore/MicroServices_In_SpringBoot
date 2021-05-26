package com.user.user_service.controller;

import com.user.user_service.entity.User;
import com.user.user_service.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController
{
    @Autowired
    private IUserService iUserService;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{userId}")
    public User getUser(@PathVariable("userId") Long userId)
    {
        User user = this.iUserService.getUser(userId);
        //http://localhost:9001/contact/user/1311
        List contants = this.restTemplate.getForObject("http://localhost:9001/contact/user/"+userId, List.class);
        user.setContactList(contants);
        return user;
    }
}
