package com.example.mapstructsample.Model;


import com.example.mapstructsample.pojo.UserDataDAO;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class UserDataRepository {

    public List<UserDataDAO> getUserDatas(){
        return Arrays.asList(
                new UserDataDAO("kc",25,"Japan",111111111),
                new UserDataDAO("tiger",20,"America",011111110)
        );
    }
}
