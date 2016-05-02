package com.faceMgr.service.impl;


import java.util.List;

import javax.annotation.Resource;
//import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.faceMgr.dao.IUserDao;
import com.faceMgr.pojo.User;
import com.faceMgr.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService{
    
    private static Logger LOG = LoggerFactory.getLogger(UserServiceImpl.class);
    
    @Resource
    private IUserDao userDao;
    
    @Override
    public User getUserById(int userId) {
        return this.userDao.selectByPrimaryKey(userId);
    }
    
    //此处添加DB事务处理
    //@Transactional
    @Override
    public void insertUsers(List<User> users){
    	LOG.debug("UserServiceImpl insertUsers begin~");
        for (int i = 0; i < users.size(); i++) {
            if(i < 2){
                this.userDao.insert(users.get(i));
            } else {
                throw new RuntimeException();
            }
        }
    }
    public void insertUser(User user){
        this.userDao.insert(user);
    }
}
