package com.cn.megalo.base.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cn.megalo.blog.pojo.model.Article;
import com.cn.megalo.blog.pojo.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ArticleMapper extends BaseMapper<Article> {
}
