package com.ltest.stu.mapper;


import com.ltest.stu.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IndexMapper {


    List<User> findList();

    int addOne(User user);
}