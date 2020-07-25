package com.kuang.dao;

import com.kuang.pojo.Student;

import java.util.List;

public interface StudentMapper {
    // 查询所有学生信息以及对应老师信息
     List<Student> getStudent();
     List<Student> getStudent2();
}
