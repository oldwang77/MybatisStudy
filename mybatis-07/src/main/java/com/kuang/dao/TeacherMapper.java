package com.kuang.dao;

import com.kuang.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface TeacherMapper {

    // 获取指定老师下的所有学生
    Teacher getTeacher(@Param("id") int id);
    Teacher getTeacher2(@Param("id") int id);
}
