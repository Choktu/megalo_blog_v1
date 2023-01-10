package com.cn.megalo.base.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cn.megalo.blog.mapper.ArticleMapper;
import com.cn.megalo.blog.pojo.dto.AddArticleDTO;
import com.cn.megalo.blog.pojo.model.Article;
import com.cn.megalo.blog.service.ArticleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    ArticleMapper articleMapper;
//    写博客
    @Override
    public ResponseEntity addNewArticle(AddArticleDTO articleDTO) {
        Article article=new Article();
        BeanUtils.copyProperties(articleDTO,article);
        Integer code=articleMapper.insert(article);
        if (code==1){
            return ResponseEntity.ok("OK");
        }
        return null;
    }

    @Override
    public ResponseEntity ListArticle() {
        QueryWrapper<Article> queryWrapper = new QueryWrapper();
        List<Article> list = articleMapper.selectList(queryWrapper );
        return ResponseEntity.ok(list);
    }
}
