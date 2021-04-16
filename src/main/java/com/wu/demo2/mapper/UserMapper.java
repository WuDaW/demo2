package com.wu.demo2.mapper;

import com.wu.demo2.modals.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select * from t_user where username=#{user.username} and password=#{user.password}")
    public User userLogin(@Param("user") User user);
}
