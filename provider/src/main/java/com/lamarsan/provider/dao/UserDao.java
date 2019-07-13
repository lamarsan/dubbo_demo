package com.lamarsan.provider.dao;

import com.lamarsan.provider.model.UserModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * className: UserDao
 * description: TODO
 *
 * @author hasee
 * @version 1.0
 * @date 2019/7/13 15:37
 */
@Mapper
@Repository
public interface UserDao {
    /**
     * 根据id查找数据
     * @param id
     * @return
     */
    UserModel selectById(Integer id);

    /**
     * 根据id查找姓名
     * @param id
     * @return
     */
    String selectNameById(Integer id);
}
