package com.example.senddatafromeactivitytoactivity;

import java.io.Serializable;

public class Dummy implements Serializable {

    public  String name;
    public  int no,age;

    public Dummy(int no,String name,int age)
    {
        this.no=no;
        this.name=name;
        this.age=age;
    }
    public  Dummy()
    {
        this.no=0;
        this.name="0";
        this.age=0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
