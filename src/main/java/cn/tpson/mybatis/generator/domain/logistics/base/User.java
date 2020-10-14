package cn.tpson.mybatis.generator.domain.logistics.base;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

import java.util.Date;

@Domain(name = "用户管理", comments = @Comment(value = "用户管理"))
public class User {
    @Property(
            columnDefinition = "varchar(20) NOT NULL",
            comments = @Comment("真实姓名."),
            name = "真实姓名",
            length = 20,
            nullable = false
    )
    String username;

    @Property(
            columnDefinition = "varchar(20) NOT NULL",
            comments = @Comment("登录账号."),
            name = "登录账号",
            length = 20,
            nullable = false
    )
    String account;

    @Property(
            columnDefinition = "varchar(32) NOT NULL",
            comments = @Comment("密码(MD5)."),
            name = "密码",
            length = 32,
            nullable = false
    )
    String password;

    @Property(
            columnDefinition = "varchar(20) NOT NULL",
            comments = @Comment("人员编号."),
            name = "人员编号",
            length = 20,
            nullable = false
    )
    String empNo;

    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("部门名称."),
            name = "部门名称",
            length = 20
    )
    String depName;

    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("职位."),
            name = "职位",
            length = 20
    )
    String jobTitle;


    @Property(
            columnDefinition = "varchar(20) NOT NULL",
            comments = @Comment("联系电话."),
            name = "联系电话",
            length = 20,
            nullable = false
    )
    String phone;

    @Property(
            columnDefinition = "char(1)",
            comments = @Comment("性别(男|女)."),
            name = "性别"
    )
    String sex;

    @Property(
            columnDefinition = "tinyint unsigned",
            comments = @Comment("年龄."),
            name = "年龄"
    )
    Integer age;

    @Property(
            columnDefinition = "datetime",
            comments = @Comment("出生日期."),
            name = "出生日期"
    )
    Date birthday;

    @Property(
            columnDefinition = "bigint unsigned",
            comments = @Comment("照片ID."),
            name = "照片ID"
    )
    Long photoId;

    @Property(
            columnDefinition = "tinyint unsigned",
            comments = @Comment("状态(0,1|正常,禁用)."),
            name = "状态"
    )
    Integer status;
}
