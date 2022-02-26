package com.community.util;

import com.community.entity.User;
import org.springframework.stereotype.Component;

/**
 * @Author Gnawix
 * @Date 2022/2/25 20:34
 * @Version 1.0
 */
@Component
public class HostHolder {
    private ThreadLocal<User> users = new ThreadLocal<>();

    public void setUser(User user) {
        users.set(user);
    }

    public User getUser() {
        return users.get();
    }

    public void clear() {
        users.remove();
    }
}
