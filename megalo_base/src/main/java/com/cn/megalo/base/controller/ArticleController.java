package com.cn.megalo.base.controller;

import com.cn.megalo.blog.pojo.dto.AddArticleDTO;
import com.cn.megalo.blog.service.impl.ArticleServiceImpl;
import com.cn.megalo.blog.utils.RedisOperator;
import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Api(tags = "文章模块")
@RestController
@RequestMapping("/article")
public class ArticleController {

    @Resource
    ArticleServiceImpl service;


    @PostMapping("/add")
    @ApiOperation(value = "写博客")
    public ResponseEntity<String>add(AddArticleDTO addArticleDTO){
        return service.addNewArticle(addArticleDTO);
    }



}
