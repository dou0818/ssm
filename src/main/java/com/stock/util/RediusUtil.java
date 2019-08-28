package com.stock.util;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@Repository
public class RediusUtil {
    @Resource(name = "redisTemplate2")
    RedisTemplate redisTemplate;

    public boolean set(String key, String value, long time) {
        redisTemplate.opsForValue().set(key, value, time, TimeUnit.SECONDS);
        return true;
    }

    public Object get(String key) {
        return redisTemplate.opsForValue().get(key);
    }


}
