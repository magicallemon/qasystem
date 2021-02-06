package com.springboot.qa.qasystem.service.serviceImpl;

import com.springboot.qa.qasystem.mapper.UserMapper;
import com.springboot.qa.qasystem.model.User;
import com.springboot.qa.qasystem.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    //将DAO注入Service层
    @Resource
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
