package com.qilinxx.springboot.controller;


import com.qilinxx.springboot.dao.DepartmentDao;
import com.qilinxx.springboot.dao.EmployeeDao;
import com.qilinxx.springboot.entities.Department;
import com.qilinxx.springboot.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collection;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private DepartmentDao departmentDao;

    //得到所有员工,来到list页面
    @GetMapping("/emps")
    public String list(Model model) {
        Collection<Employee> employees = employeeDao.getAll();
        model.addAttribute("emps", employees);
        return "emp/list";
    }

    @GetMapping("/emp")
    public String emp(Model model) {
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("depts", departments);
        //来到添加页面
        return "emp/add";
    }

    //来到修改页面，查出当前员工，进行回显
    @GetMapping("/emp/{id}")
    public String emp(@PathVariable("id") Integer id, Model model) {
        Employee employee = employeeDao.get(id);
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("depts", departments);
        model.addAttribute("emp", employee);
        //添加修改二合一
        return "emp/add";
    }

    @PostMapping("/emp")
    public String updateEmployee(Employee employee) {
        employeeDao.save(employee);
        System.out.println(employee);
        return "redirect:/emps";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") Integer id) {
        employeeDao.delete(id);
        return "redirect:/emps";
    }

}
