package com.lamarsan.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lamarsan.provider.model.UserModel;
import com.lamarsan.provider.service.UserService;
import org.springframework.web.bind.annotation.*;


/**
 * className: UserController
 * description: TODO
 *
 * @author hasee
 * @version 1.0
 * @date 2019/7/13 16:00
 */
@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {
    @Reference
    UserService userService;

    @PostMapping("/getUser")
    @ResponseBody
    public UserModel getUser(Integer id) {
        return userService.getUser(id);
    }

    @GetMapping("/getUserName")
    @ResponseBody
    public String getUserName(Integer id) {
        return userService.getName(id);
    }
}
