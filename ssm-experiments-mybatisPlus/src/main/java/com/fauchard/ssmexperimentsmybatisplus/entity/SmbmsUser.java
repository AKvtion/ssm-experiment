package com.fauchard.ssmexperimentsmybatisplus.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * (SmbmsUser)表实体类
 *
 * @author fauchard
 * @since 2023-06-11 17:26:26
 */
@Data
@TableName("smbms_user")//@TableName中的值对应着表名
public class SmbmsUser{
    //主键ID
    @TableId(type = IdType.AUTO)
    private Long id;
    //用户编码
    private String usercode;
    //用户名称
    private String username;
    //用户密码
    private String userpassword;
    //性别（1:女、 2:男）
    private Integer gender;
    //出生日期
    private Date birthday;
    //手机
    private String phone;
    //地址
    private String address;
    //用户角色（取自角色表-角色id）
    private Long roleid;
    //创建者（userId）
    private Long createdby;
    //创建时间
    private Date creationdate;
    //更新者（userId）
    private Long modifyby;
    //更新时间
    private Date modifydate;


    }

