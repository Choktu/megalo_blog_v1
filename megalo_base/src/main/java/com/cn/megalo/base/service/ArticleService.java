package com.cn.megalo.base.service;

import com.cn.megalo.blog.pojo.dto.AddArticleDTO;
import org.springframework.http.ResponseEntity;

public interface ArticleService {
    ResponseEntity addNewArticle(AddArticleDTO articleDTO);

    ResponseEntity ListArticle();
}
