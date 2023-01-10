package com.cn.megalo.base.pojo.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("user")
public class User implements Serializable {
    private Integer id;
    private String  username;
    private String password;
    private String salt;
    private String name;
    private String phone;
    private String email;
    private Integer enabled;
}
