package com.example.mapstructsample.controller;


import com.example.mapstructsample.Model.UserDataRepository;
import com.example.mapstructsample.mapper.UserDataMapper;
import com.example.mapstructsample.pojo.UserDataDAO;
import com.example.mapstructsample.pojo.UserDataResponseResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class UserDataController {

    @Autowired
    UserDataRepository userDataRepository;

    @RequestMapping(value="/userDatas",method = RequestMethod.GET)
    public List<UserDataResponseResource> getUserDatas(){
        List<UserDataResponseResource> responseResourcess = userDataRepository.getUserDatas().stream().map(
                userDataDAO -> {
                    return UserDataMapper.USER_DATA_MAPPER.generateUserDataResponseResourceFromDAO(userDataDAO);
                }
        ).collect(Collectors.toList());
        return responseResourcess;

    }
}
