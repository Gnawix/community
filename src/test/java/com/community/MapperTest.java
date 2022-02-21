package com.community;

import com.community.dao.DiscussPostMapper;
import com.community.dao.UserMapper;
import com.community.entity.DiscussPost;
import com.community.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @Author Gnawix
 * @Date 2022/2/20 19:20
 * @Version 1.0
 */
@SpringBootTest
public class MapperTest {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private DiscussPostMapper discussPostMapper;

    @Test
    public void testSelectUser() {
        User user = userMapper.selectById(101);
        System.out.println(user);

        user = userMapper.selectByName("liubei");
        System.out.println(user);

        user = userMapper.selectByEmail("nowcoder101@sina.com");
        System.out.println(user);
    }

    @Test
    public void testSelectPosts() {
        List<DiscussPost> list = discussPostMapper.selectDiscussPosts(149, 0, 10);
        for(DiscussPost post : list) {
            System.out.println(post);
        }

        int rows = discussPostMapper.selectDiscussPostRows(149);
        System.out.println(rows);
    }

}
