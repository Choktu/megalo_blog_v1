package com.cn.megalo.base.pojo.dto;

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
public class AddArticleDTO implements Serializable {

    @TableField("article_title")
    private String articleTitle;
    @TableField("article_content_md")
    private String articleContent;
    @TableField("article_abstract")
    private String articleAbstract;
}
