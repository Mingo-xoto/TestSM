package com.yhq.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.ui.ModelMap;
import com.yhq.pojo.User;
import com.yhq.service.IUserService;

@Controller
@RequestMapping("/test/")
public class TestController {
    private String PATH = "/";

    @Autowired
    private IUserService userService;

    @RequestMapping("test")
    public String test(User user,ModelMap map) {
	if (!this.userService.select(user.getId()))
	    this.userService.insert(user);
	else{
	    map.put("IdConfilct", "id重复了");
	    System.out.println("id重复");
	}
	return PATH + "test";
    }
}
