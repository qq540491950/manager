package com.tellhow.swagger.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "用户类", description = "用户")
public class User implements Serializable {

    private static final long serialVersionUID = -2599585280711038475L;
    @ApiModelProperty(value = "用户id", notes = "ID")
    private int id;
    @ApiModelProperty(value = "用户名字", notes = "姓名")
    private String name;
    @ApiModelProperty(value = "用户年龄", notes = "年龄")
    private int age;
    @ApiModelProperty(value = "用户性别", notes = "性别")
    private String gender;
    @ApiModelProperty(value = "用户地址", notes = "地址")
    private String address;
}
