package com.qilinxx.springboot.service;

import com.qilinxx.springboot.bean.Employee;
import com.qilinxx.springboot.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.*;
import org.springframework.stereotype.Service;

@CacheConfig(cacheNames = "emp", cacheManager = "employeeCacheManager")  //抽取缓存的公共配置，类里面无需写cacheNames或value
@Service
public class EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;

    /**
     * 将方法结果进行缓存，以后要相同的数据，直接从缓存中获取，不用调用方法
     * 每个缓存组件都有自己的名字
     * cacheNames/value:指定缓存组件的名字,将方法的返回结果放在缓存中。是数组的方式，可以指定多个缓存。
     * key:缓存数据使用的key：可以使用它来指定。默认是使用参数的值
     * 编写SpEL：#id；参数id的值  #root.args[0]    #a0     #p0
     *
     * @param id
     * @return
     */
    @Cacheable(cacheNames = {"emp"})
    public Employee getEmp(Integer id) {
        System.out.println("查询" + id + "号员工");
        Employee employee = employeeMapper.getEmployeeById(id);
        return employee;
    }

    /**
     * @param employee
     * @return
     * @CachePut 既更新缓存，又执行方法(先调用方法，再存入缓存)
     * 可以使用#result
     */
    @CachePut(value = "emp", key = "#result.id")
    public Employee updateEmp(Employee employee) {
        employeeMapper.updateEmployee(employee);
        return employee;
    }


    /**
     * @CacheEvict 清除缓存
     * allEntries = false   清除当前emp的所有缓存！
     * beforeInvocation = false    默认在调用方法之后清除缓存
     */
    @CacheEvict(value = "emp", key = "#id")
    public void deleteEmp(Integer id) {
        System.out.println("删除第" + id + "号员工");
        //employeeMapper.deleteEmployeeById(id);
    }

    /**
     * 只有有put注解就一定会调用方法
     *
     * @Caching 组合注解 定义繁杂的缓存规则
     */
    @Caching(
            cacheable = {
                    @Cacheable(value = "emp", key = "#lastName")
            },
            put = {
                    @CachePut(value = "emp", key = "#result.id"),
                    @CachePut(value = "emp", key = "#result.email")
            }
    )
    public Employee getEmpByLastName(String lastName) {
        return employeeMapper.selectEmployeeByLastName(lastName);
    }
}
