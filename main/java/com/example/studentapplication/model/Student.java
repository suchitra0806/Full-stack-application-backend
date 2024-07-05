package com.example.studentapplication.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table (name = "studentdetails")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String first_name;
    private String last_name;
    private String email;
    private Date dob;
    private String mobile;
    private int age;

    public Student() {}

    public Student(Integer id, String first_name, String last_name, String email, Date dob, String mobile, int age) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.dob = dob;
        this.mobile = mobile;
        this.age = age;
    }

    public Integer getId() {
        return this.id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getFirst_name() {
        return this.first_name;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public String getLast_name() {
        return this.last_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getMobile() {
        return this.mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public Date getDob() {
        return this.dob;
    }
    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String toString() {
        String var10000 = String.valueOf(this.id);
        return "Student {id = " + var10000 + ", first name = " + this.first_name + ", last name = " + this.last_name + ", email = " + this.email + ", dob = " + String.valueOf(this.dob) + ", mobile = " + this.mobile + ", age = " + this.age + "}";
    }
}
