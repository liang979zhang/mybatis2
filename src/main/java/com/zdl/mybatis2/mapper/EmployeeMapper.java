package com.zdl.mybatis2.mapper;

import com.zdl.mybatis2.model.Employee;

import java.util.List;

/**
 * 配置版
 */
public interface EmployeeMapper {

    public Employee getById(Integer id);

    public void insertEmp(Employee employee);


    public List<Employee> getAllemp();

}
