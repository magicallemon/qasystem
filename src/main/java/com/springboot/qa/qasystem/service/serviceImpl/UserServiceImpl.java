package com.springboot.qa.qasystem.service.serviceImpl;

import com.springboot.qa.qasystem.dao.UserMapper;
import com.springboot.qa.qasystem.model.User;
import com.springboot.qa.qasystem.model.UserExample;
import com.springboot.qa.qasystem.service.UserService;
import org.apache.ibatis.reflection.ArrayUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.ArrayUtils;
import org.thymeleaf.util.ListUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    //将DAO注入Service层
    @Autowired(required=false)
    private UserMapper userMapper;

    @Override
    public User findUserByUserNameAndPassword(String userName, String password) {
//        UserExample example = new UserExample();
//        UserExample.Criteria criteria = example.createCriteria();
//        criteria.andUserNameEqualTo(userName);
//        criteria.andPasswordEqualTo(password);
//        List<User> list =  userMapper.selectByExample(example);
//        if (ListUtils.isEmpty(list)) {
//            return null;
//        }else {
//            return list.get(0);
//        }
        return userMapper.selectByPrimaryKey(1);
    }
}
