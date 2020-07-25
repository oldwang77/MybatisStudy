package com.kuang.pojo;

import java.util.List;

public class Teacher {
    private int id;
    private String name;

    // 一个老师拥有多个学生
    private List<Student> studentList;

    public Teacher() {
    }

    public Teacher(int id, String name, List<Student> students) {
        this.id = id;
        this.name = name;
        this.studentList = students;
    }

    public List<Student> getStudents() {
        return studentList;
    }

    public void setStudents(List<Student> students) {
        this.studentList = students;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", students=" + studentList +
                '}';
    }
}
