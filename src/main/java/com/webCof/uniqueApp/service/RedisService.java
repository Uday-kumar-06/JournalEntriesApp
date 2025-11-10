package com.webCof.uniqueApp.service;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class RedisService {

    @Autowired
    private RedisTemplate redisTemplate;

    public <T> T get(String key, Class<T> entityClass) {
        try {
            Object obj = redisTemplate.opsForValue().get(key);
            if (obj == null) {
                System.out.println("Redis: No value found for key -> " + key);
                return null;  // safely return null
            }

            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(obj.toString(), entityClass);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    public void set(String key, Object o, Long ttl) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(o);
            redisTemplate.opsForValue().set(key, json, ttl, TimeUnit.SECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
