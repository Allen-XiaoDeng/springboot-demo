package com.example.demo.entity;

public class User {
    private String studentNo;
    private String   studentName;
    private String   studentGender;
    private Integer studentAge;

    public User() {
        this.studentNo = studentNo;
        this.studentName = studentName;
        this.studentGender = studentGender;
        this.studentAge = studentAge;
    }

    public User(String studentNo, String studentName, String studentGender, Integer studentAge) {
        this.studentNo = studentNo;
        this.studentName = studentName;
        this.studentGender = studentGender;
        this.studentAge = studentAge;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentGender() {
        return studentGender;
    }

    public void setStudentGender(String studentGender) {
        this.studentGender = studentGender;
    }

    public Integer getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(Integer studentAge) {
        this.studentAge = studentAge;
    }

    @Override
    public String toString() {
        return "User{" +
                "studentNo='" + studentNo + '\'' +
                ", studentName='" + studentName + '\'' +
                ", studentGender='" + studentGender + '\'' +
                ", studentAge=" + studentAge +
                '}';
    }
}
