package com.cn.megalo.base.pojo.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("jotter_article")
public class Article implements Serializable {
    private Integer id;
    @TableField("article_title")
    private String articleTitle;
    @TableField("article_content_md")
    private String articleContent;
    @TableField("article_abstract")
    private String articleAbstract;
    @TableField("article_cover")
    private String articleCover;
    @TableField("article_date")
    private Integer articleDate;
    @TableField("article_author")
    private String articleAuthor;
}
