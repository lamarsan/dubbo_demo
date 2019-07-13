package com.lamarsan.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lamarsan.provider.dao.UserDao;
import com.lamarsan.provider.model.UserModel;
import com.lamarsan.provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * className: UserServiceImpl
 * description: TODO
 *
 * @author hasee
 * @version 1.0
 * @date 2019/7/13 15:30
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    public UserModel getUser(Integer id) {
        UserModel userModel = userDao.selectById(id);
        System.out.println(userModel);
        return userDao.selectById(id);
    }

    public String getName(Integer id) {
        String userName = userDao.selectNameById(id);
        System.out.println(userName);
        return userName;
    }
}
