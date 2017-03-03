package com.tbs.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.tbs.entity.student;

public interface studentMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(student record);

    int insertSelective(student record);

    student selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(student record);

    int updateByPrimaryKey(student record);
    //使用命名参数(注解)的方式传入多个值。  还可以使用对象或者map来传递多个值。
    List<student> findStudnetByPage(@Param("startIndex")Integer startIndex,@Param("pageSize")Integer pageSize);
    
    int queryTotalPage();
}