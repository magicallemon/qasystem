package com.springboot.qa.qasystem.service;

import com.springboot.qa.qasystem.model.User;

public interface UserService {
     /**
      *
      * @param userName
      * @param password
      * @return
      */
     User findUserByUserNameAndPassword(String userName,String password);
}
