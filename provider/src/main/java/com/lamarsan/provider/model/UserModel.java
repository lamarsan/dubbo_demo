package com.lamarsan.provider.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * className: UserModel
 * description: TODO
 *
 * @author hasee
 * @version 1.0
 * @date 2019/7/13 15:35
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserModel implements Serializable {
    private Integer userId;

    private String userName;

    private Integer userSex;

    private Date userBirth;

    private String userSchool;

    private String userSign;

    private String userPhone;

    private String userImg;

    private String userResume;

    private String userHonour;

    private Date createTime;

    private Date updateTime;

    private String openId;

    private String unionId;

    private String userCountry;

    private String userCity;

    private String userProvince;

    private String userNickname;
}
