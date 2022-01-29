package com.ltest.stu.service;


import com.ltest.stu.entity.User;
import com.ltest.stu.mapper.IndexMapper;
import com.ltest.stu.service.intf.IIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class IndexService implements IIndexService {

    @Autowired
    private IndexMapper indexMapper;

    @Override
    public String say() {
        System.out.println("IndexService say");
        return "IndexService say";
    }

    @Override
    public List<User> findList() {
        /*User user = new User();
        user.setName("b");
        user.setAge(11);
        user.setCreateTime(new Date());
        int i = indexMapper.addOne(user);
        System.out.println(i);*/
        return indexMapper.findList();
    }
}
