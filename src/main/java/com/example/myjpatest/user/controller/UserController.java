package com.example.myjpatest.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.myjpatest.user.dto.UserDTO;
import com.example.myjpatest.user.service.UserService;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/user/list")
    public ModelAndView list() {
        ModelAndView mv = new ModelAndView("user/list");
        List<UserDTO> userList = userService.findAll();
        mv.addObject("userList", userList);
        return mv;
    }
}
