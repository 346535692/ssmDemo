package com.ltest.stu.service.intf;


import com.ltest.stu.entity.User;

import java.util.List;

public interface IIndexService {

    String say();

    List<User> findList();

}