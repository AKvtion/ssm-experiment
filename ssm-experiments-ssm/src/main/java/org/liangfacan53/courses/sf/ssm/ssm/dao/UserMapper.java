package org.liangfacan53.courses.sf.ssm.ssm.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.liangfacan53.courses.sf.ssm.ssm.pojo.User;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> findAllUsers();

    User findUserById(@Param("id") int id);
}
