package com.community.dao;

import com.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author Gnawix
 * @Date 2022/2/20 18:42
 * @Version 1.0
 */
@Mapper
public interface DiscussPostMapper {

    /**
     * @param userId  userID
     * @param offset  每页的起始id
     * @param limit  每页的数据条数
     * @return List
     */
    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

    /**
     * 返回所有数据条数
     */
    int selectDiscussPostRows(@Param("userId") int userId);



}
