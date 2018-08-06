package com.zdl.mybatis2.mapper;

import com.zdl.mybatis2.model.Department;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 注解版
 */
//@Mapper
public interface DepartmentMapper {
    //查询
    @Select("select * from  department where id=#{id} ")
    public Department getById(Integer id);

    //查询全部
    @Select("select * from  department")
    public List<Department> getByAll();


    //删除
    @Delete("delete from department where  id= #{id}")
    public int delById(Integer id);


    //插入
    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into department(department_name) value (#{departmentName}) ")
    public int InsertDept(Department department);

    //更新
    @Update("update department set department_name =#{departmentName} where id =#{id}")
    public int updateDept(Department department);

}
