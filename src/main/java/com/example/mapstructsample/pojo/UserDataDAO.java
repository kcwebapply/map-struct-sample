package com.example.mapstructsample.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class UserDataDAO {

    public String userName;

    public int age;

    public String address;

    public  int myNumber;

    public UserDataDAO(String userName, int age, String address, int myNumber) {
        this.userName = userName;
        this.age = age;
        this.address = address;
        this.myNumber = myNumber;
    }

    public String getUserName(){
        return  userName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress(){
        return address;
    }

    public int getMyNumber() {
        return myNumber;
    }
}
