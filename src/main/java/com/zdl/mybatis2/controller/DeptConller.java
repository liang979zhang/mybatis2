package com.zdl.mybatis2.controller;


import com.zdl.mybatis2.mapper.DepartmentMapper;
import com.zdl.mybatis2.mapper.EmployeeMapper;
import com.zdl.mybatis2.model.Department;
import com.zdl.mybatis2.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptConller {

    @Autowired
    DepartmentMapper departmentMapper;

    @Autowired
    EmployeeMapper employeeMapper;

    @GetMapping("/dept/insert")
    public Department insertDept(Department department) {
        departmentMapper.InsertDept(department);
        return department;
    }

    @GetMapping("/dept/sel")
    public Department selDept(Integer id) {
        return departmentMapper.getById(id);
    }

    @GetMapping("/dept/all")
    public List<Department> allDept() {
        return departmentMapper.getByAll();
    }


    @GetMapping("/emp/getdata")
    public Object getById(Integer id) {
        return employeeMapper.getById(id);
    }

    @GetMapping("/emp/getAllemp")
    public List<Employee> getAll() {
        return employeeMapper.getAllemp();

    }
}
