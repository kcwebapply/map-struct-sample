package com.example.mapstructsample.mapper;


import com.example.mapstructsample.pojo.UserDataDAO;
import com.example.mapstructsample.pojo.UserDataResponseResource;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserDataMapper {

    UserDataMapper USER_DATA_MAPPER = Mappers.getMapper(UserDataMapper.class);
    public UserDataResponseResource generateUserDataResponseResourceFromDAO(UserDataDAO userDataResponseResource);


}
