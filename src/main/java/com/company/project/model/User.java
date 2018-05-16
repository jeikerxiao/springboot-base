package com.company.project.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import java.util.Date;
import javax.persistence.*;

@Data
@ApiModel("用户基本信息")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ApiModelProperty("用户名")
    @NotBlank(message = "用户名不能为空")
    private String username;

    @ApiModelProperty("密码")
    @NotBlank(message = "密码不能为空")
    private String password;

    @ApiModelProperty("用户昵称")
    @NotBlank(message = "用户昵称不能为空")
    @Column(name = "nick_name")
    private String nickName;

    @ApiModelProperty("性别")
    private Integer sex;

    @ApiModelProperty("注册日期")
    @Column(name = "register_date")
    private Date registerDate;
}