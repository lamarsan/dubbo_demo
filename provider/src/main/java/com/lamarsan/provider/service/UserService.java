package com.lamarsan.provider.service;

import com.lamarsan.provider.model.UserModel;

/**
 * className: UserService
 * description: TODO
 *
 * @author hasee
 * @version 1.0
 * @date 2019/7/13 15:29
 */
public interface UserService {
    UserModel getUser(Integer id);

    String getName(Integer id);
}
