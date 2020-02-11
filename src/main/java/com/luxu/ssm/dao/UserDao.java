package com.luxu.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.luxu.ssm.pojo.User;

@Mapper
@Repository
public interface UserDao {
    List<User> selectUserByUsername(String username);
}
