package com.example.demo.entity;

import java.util.List;

public class Teacher {


    private String teacherNo;
    private String teacherName;
    private String managerNo;
    private List courses;

    public Teacher() {
        this.teacherNo = teacherNo;
        this.teacherName = teacherName;
        this.managerNo = managerNo;
        this.courses = courses;
    }
    public Teacher(String teacherNo, String teacherName, String managerNo, List courses) {
        this.teacherNo = teacherNo;
        this.teacherName = teacherName;
        this.managerNo = managerNo;
        this.courses = courses;
    }

    public String getTeacherNo() {
        return teacherNo;
    }

    public void setTeacherNo(String teacherNo) {
        this.teacherNo = teacherNo;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getManagerNo() {
        return managerNo;
    }

    public void setManagerNo(String managerNo) {
        this.managerNo = managerNo;
    }

    public List getCourses() {
        return courses;
    }

    public void setCourses(List courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherNo='" + teacherNo + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", managerNo='" + managerNo + '\'' +
                ", courses=" + courses +
                '}';
    }
}
