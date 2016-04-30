package com.haih.controller;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.haih.pojo.User;
import com.haih.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private IUserService userService;
    private static Logger LOG = LoggerFactory.getLogger(UserController.class);
    @RequestMapping("/showName")
    @ResponseBody
    public String Index(HttpServletRequest request,Model model){
<<<<<<< HEAD
    	String resultString = "OK";
    	return resultString;
//        int userId = Integer.valueOf(request.getParameter("id"));
//        User user = userService.getUserById(userId);
//        model.addAttribute("user", user);
//        return "show";
=======
    	LOG.info("Index begin!");
    	String tracking = (String)request.getAttribute("trackingID");
        int userId = Integer.valueOf(request.getParameter("id"));
        User user = userService.getUserById(userId);
        model.addAttribute("user", user);
        return "show";
>>>>>>> origin/master
    }
    
    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    @ResponseBody
    public String addUser(User user){
        //User user = new User.Builder(1, "hh","3424145",23).build();
        userService.insertUser(user);
        return "OK";
    }
}