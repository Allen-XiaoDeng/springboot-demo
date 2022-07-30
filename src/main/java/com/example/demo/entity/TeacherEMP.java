package com.example.demo.entity;

import java.util.List;

public class TeacherEMP {
    private String teacherNo;
    private String teacherName;
    private String managerNo;
    private String teacherEMP;

    public TeacherEMP() {
        this.teacherNo = teacherNo;
        this.teacherName = teacherName;
        this.managerNo = managerNo;
        this.teacherEMP = teacherEMP;
    }
    public TeacherEMP(String teacherNo, String teacherName, String managerNo, String teacherEMP) {
        this.teacherNo = teacherNo;
        this.teacherName = teacherName;
        this.managerNo = managerNo;
        this.teacherEMP = teacherEMP;
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

    public String getTeacherEMP() {
        return teacherEMP;
    }

    public void setTeacherEMP(String teacherEMP) {
        this.teacherEMP = teacherEMP;
    }

    @Override
    public String toString() {
        return "TeacherEMP{" +
                "teacherNo='" + teacherNo + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", managerNo='" + managerNo + '\'' +
                ", teacherEMP='" + teacherEMP + '\'' +
                '}';
    }
}
