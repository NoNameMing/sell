package com.ming.sell.constant;

/**
 * redis 常量
 */
public interface RedisConstant {

    String TOKEN_PREFIX = "token_%s";

    Integer EXPIRE = 7200; // 过期时间两小时
}
