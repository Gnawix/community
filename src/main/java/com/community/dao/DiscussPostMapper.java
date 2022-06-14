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
     * @Param注解用于给参数取别名,如果只有一个参数,并且在<if>里使用,则必须加别名.
     */
    int selectDiscussPostRows(@Param("userId") int userId);

    int insertDiscussPost(DiscussPost discussPost);

    DiscussPost selectDiscussPostById(int id);

    int updateCommentCount(int id, int commentCount);

}
