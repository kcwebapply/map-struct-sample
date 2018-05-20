package com.example.mapstructsample.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class UserDataResponseResource {

    public String userName;

    public int age;

    public  String address;

    public int myNumber;

    public UserDataResponseResource(){

    }
    public UserDataResponseResource(String userName, int i, String japan, int myNumber) {
        this.userName = userName;
        this.age = age;
        this.address = address;
        this.myNumber = myNumber;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMyNumber(int myNumber){
        this.myNumber = myNumber;
    }
}
