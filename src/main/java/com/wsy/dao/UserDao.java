package com.wsy.dao;

import com.wsy.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDao {
    @Select("select * from t_user where mobile=#{mobile}")
    public User getById(@Param("mobile") String mobile);
}
