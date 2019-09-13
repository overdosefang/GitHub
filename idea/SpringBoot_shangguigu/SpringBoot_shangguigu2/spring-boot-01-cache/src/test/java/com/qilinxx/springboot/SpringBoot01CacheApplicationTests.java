package com.qilinxx.springboot;

import com.qilinxx.springboot.bean.Employee;
import com.qilinxx.springboot.mapper.EmployeeMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest

public class SpringBoot01CacheApplicationTests {
    @Autowired
    EmployeeMapper employeeMapper;
    @Autowired
    StringRedisTemplate stringRedisTemplate;//操作k-v都是字符串
    @Autowired
    RedisTemplate redisTemplate;//操作k-v都是对象
    @Autowired
    RedisTemplate<Object, Employee> employeeRedisTemplate;

    //保存字符串
    @Test
    public void test01() {
        //保存数据
        //stringRedisTemplate.opsForValue().append("msg","hello");
        //String msg = stringRedisTemplate.opsForValue().get("msg");
        //System.out.println(msg);

        //保存list
        stringRedisTemplate.opsForList().leftPush("mylist", "1");
        stringRedisTemplate.opsForList().leftPush("mylist", "2");
    }

    //保存对象
    @Test
    public void test02() {
        //如果默认保存对象，使用jdk序列化机制，序列化后的数据保存到redis中
        Employee employee = employeeMapper.getEmployeeById(1);
        //redisTemplate.opsForValue().set("emp-01",employee);

        //改变默认的序列化规则
        employeeRedisTemplate.opsForValue().set("emp-01", employee);
    }

    @Test
    public void contextLoads() {
        Employee employee = employeeMapper.getEmployeeById(1);
        System.out.println(employee);

    }

}
