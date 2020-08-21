package cn.tpson.mybatis.generator.domain.firestock.base;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

@Domain(name = "用户管理", comments = @Comment(value = "用户管理"))
public class User {
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
            comments = @Comment("真实姓名."),
            name = "真实姓名",
            length = 20,
            nullable = false
    )
    String username;

    @Property(
            columnDefinition = "varchar(20) NOT NULL",
            comments = @Comment("联系电话."),
            name = "联系电话",
            length = 11,
            nullable = false
    )
    String tel;

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
}
