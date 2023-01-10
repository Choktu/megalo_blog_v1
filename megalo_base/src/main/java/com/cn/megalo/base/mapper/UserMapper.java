package com.cn.megalo.base.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.cn.megalo.blog.pojo.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
