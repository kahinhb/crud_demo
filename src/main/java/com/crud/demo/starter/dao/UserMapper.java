package com.crud.demo.starter.dao;

import com.crud.demo.starter.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> getAll();

    User getUserById(int id);

    void delete(int id);

    void insert(User user);

    void update(User user);






}
