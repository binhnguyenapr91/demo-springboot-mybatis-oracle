package com.example.demospringbootmybatisoracle.service;

import com.example.demospringbootmybatisoracle.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: ntbinh10@cmc.com.vn
 * Jul 22, 2021
 */
@Mapper
public interface UserService {
    List<User> list();
    User create(String name);
    List<User> query(String keyword);
}
