package com.csx.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.models.auth.In;
import lombok.Data;

@Data
@TableName("t_user")
public class User {

    @TableId
    private Long id;

    @TableField
    private String username;

    @TableField
    private String password;

}
