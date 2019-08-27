package com.stock.util;

import org.springframework.stereotype.Repository;

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
