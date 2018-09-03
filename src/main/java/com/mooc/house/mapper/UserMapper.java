package com.mooc.house.mapper;

import com.mooc.house.common.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    List<User> selectUsers();

}
