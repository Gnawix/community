package com.community.util;

import org.apache.commons.lang3.StringUtils;
import org.springframework.util.DigestUtils;


import java.util.UUID;

/**
 * @Author Gnawix
 * @Date 2022/2/21 14:42
 * @Version 1.0
 */
public class CommunityUtil {
    // 生成随机字符串
    public static String generateUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    // MD5加密
    public static String md5(String key) {
        if (StringUtils.isBlank(key)) {
            return null;
        }
        return DigestUtils.md5DigestAsHex(key.getBytes());
    }
}
