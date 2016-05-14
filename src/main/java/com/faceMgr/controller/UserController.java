package  com.faceMgr.controller;


import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.faceMgr.bean.User;
import com.faceMgr.service.IUserService;

@Controller
@RequestMapping(value = "/")
public class UserController {
    @Resource
    private IUserService userService;
    private static Logger log = LoggerFactory.getLogger(UserController.class);
        
    @RequestMapping(value = "user",method = RequestMethod.POST)
    @ResponseBody
    public String addUser(@RequestBody User user){
        //User user = new User.Builder(1, "hh","3424145",23).build();
        userService.insertUser(user);
        return "OK";
    }
    
    @RequestMapping(value = "user/{userid}",method = RequestMethod.DELETE)
    @ResponseBody
    public int deleteUser(@PathVariable int userid){
        log.info(String.valueOf(userid));
        return userid;
    }
    
    @RequestMapping(value = "users",method = RequestMethod.DELETE)
    @ResponseBody
    public int deleteUser(@RequestBody List<Integer> ids){
        log.info(String.valueOf(ids));
        return ids.get(0);
    }
}		
