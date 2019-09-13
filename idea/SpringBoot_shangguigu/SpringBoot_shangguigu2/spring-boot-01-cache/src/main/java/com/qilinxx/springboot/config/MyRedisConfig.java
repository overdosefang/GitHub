package com.qilinxx.springboot.config;

import com.qilinxx.springboot.bean.Department;
import com.qilinxx.springboot.bean.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;

@Configuration
public class MyRedisConfig {
    @Bean
    public RedisTemplate<Object, Employee> employeeRedisTemplate(RedisConnectionFactory redisConnectionFactory) {
        RedisTemplate<Object, Employee> redisTemplate = new RedisTemplate<Object, Employee>();
        redisTemplate.setConnectionFactory(redisConnectionFactory);
        Jackson2JsonRedisSerializer<Employee> serializer = new Jackson2JsonRedisSerializer<Employee>(Employee.class);
        redisTemplate.setDefaultSerializer(serializer);
        return redisTemplate;
    }

    @Bean
    public RedisTemplate<Object, Department> deptRedisTemplate(RedisConnectionFactory redisConnectionFactory) {
        RedisTemplate<Object, Department> redisTemplate = new RedisTemplate<Object, Department>();
        redisTemplate.setConnectionFactory(redisConnectionFactory);
        Jackson2JsonRedisSerializer<Department> serializer = new Jackson2JsonRedisSerializer<Department>(Department.class);
        redisTemplate.setDefaultSerializer(serializer);
        return redisTemplate;
    }

    @Primary
    @Bean
    public RedisCacheManager employeeCacheManager(RedisTemplate<Object, Employee> redisTemplate) {
        RedisCacheManager redisCacheManager = new RedisCacheManager(redisTemplate);

        //key会多一个前缀
        //默认将cacheName作为key的前缀
        redisCacheManager.setUsePrefix(true);
        return redisCacheManager;
    }

    @Bean
    public RedisCacheManager deptCacheManager(RedisTemplate<Object, Department> redisTemplate) {
        RedisCacheManager redisCacheManager = new RedisCacheManager(redisTemplate);

        //key会多一个前缀
        //默认将cacheName作为key的前缀
        redisCacheManager.setUsePrefix(true);
        return redisCacheManager;
    }
}
