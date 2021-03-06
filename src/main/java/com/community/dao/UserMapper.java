package com.community.dao;

import com.community.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author Gnawix
 * @Date 2022/2/20 19:04
 * @Version 1.0
 */
@Mapper
public interface UserMapper {
    User selectById(int id);

    User selectByName(String username);

    User selectByEmail(String email);

    int insertUser(User user);

    int updateStatus(int id, int status);

    int updateHeader(int id, String headerUrl);

    int updatePassword(int id, String password);
}
