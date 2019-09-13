package com.qilinxx.springboot.service;

import com.qilinxx.springboot.bean.Department;
import com.qilinxx.springboot.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.Cache;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.stereotype.Service;

@Service
@CacheConfig(cacheNames = "dept", cacheManager = "deptCacheManager")
public class DeptService {
    @Autowired
    DepartmentMapper departmentMapper;
    @Qualifier("deptCacheManager")
    @Autowired
    RedisCacheManager deptCacheManager;

    //@Cacheable(cacheNames = "dept")
    //public Department getDepartment(Integer id){
    //    System.out.println("查询第"+id+"部门");
    //    Department department=departmentMapper.getDepartmentById(id);
    //    return department;
    //}

    public Department getDepartment(Integer id) {
        System.out.println("查询第" + id + "部门");
        Department department = departmentMapper.getDepartmentById(id);

        //获取某个缓存
        Cache dept = deptCacheManager.getCache("dept");
        dept.put("dept:1", department);
        return department;
    }

}
