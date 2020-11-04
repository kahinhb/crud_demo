package com.crud.demo.starter.service;

import com.crud.demo.starter.dao.UserMapper;
import com.crud.demo.starter.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired(required = false)
    UserMapper userMapper;

    public List<User> getAll(){
        return userMapper.getAll();
    }

    public User getUserById(int id){
        return userMapper.getUserById(id);
    }

    public void delete(int id){
         userMapper.delete(id);
    }

    public void update(User user){
         userMapper.update(user);
    }

    public void insert(User user){
         userMapper.insert(user);
    }
}
