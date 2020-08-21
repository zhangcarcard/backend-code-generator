package cn.tpson.mybatis.generator.domain.ic.sys;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

import java.util.Date;

@Domain(name = "系统用户", comments = @Comment(value = "系统用户"))
public class SysUser {
    @Property(
            columnDefinition = "varchar(20) NOT NULL",
            comments = @Comment("登录账号."),
            name = "登录账号",
            length = 20,
            nullable = false
    )
    String username;

    @Property(
            columnDefinition = "varchar(20) NOT NULL",
            comments = @Comment("真实姓名."),
            name = "真实姓名",
            length = 20,
            nullable = false
    )
    String name;

    @Property(
            columnDefinition = "varchar(32) NOT NULL",
            comments = @Comment("密码(MD5)."),
            name = "密码",
            length = 32,
            nullable = false
    )
    String password;

    @Property(
            columnDefinition = "bigint NOT NULL",
            comments = @Comment("角色ID."),
            name = "角色ID",
            nullable = false
    )
    Long roleId;

    @Property(
            columnDefinition = "varchar(11) NOT NULL",
            comments = @Comment("手机号码."),
            name = "手机号码",
            length = 11,
            nullable = false
    )
    String phone;

    @Property(
            columnDefinition = "boolean NOT NULL",
            comments = @Comment("性别(男|女/true|false)."),
            name = "性别",
            nullable = false
    )
    Boolean sex;

    @Property(
            columnDefinition = "smallint NOT NULL",
            comments = @Comment("证件类型."),
            name = "证件类型",
            nullable = false
    )
    Integer paperType;

    @Property(
            columnDefinition = "varchar(30) NOT NULL",
            comments = @Comment("证件号码."),
            name = "证件号码",
            length = 30,
            nullable = false
    )
    String paperNumber;

    @Property(
            columnDefinition = "varchar(15) NOT NULL",
            comments = @Comment("座机号码."),
            name = "座机号码",
            length = 15,
            nullable = false
    )
    String tel;

    @Property(
            columnDefinition = "varchar(50) NOT NULL",
            comments = @Comment("email."),
            name = "email",
            length = 50,
            nullable = false
    )
    String email;

    @Property(
            columnDefinition = "varchar(500)",
            comments = @Comment("角色描述."),
            name = "角色描述",
            length = 500
    )
    String remark;

    @Property(
            columnDefinition = "varchar(10)",
            comments = @Comment("用户编号."),
            name = "用户编号",
            length = 10
    )
    String code;

    @Property(
            columnDefinition = "integer",
            comments = @Comment("登录次数."),
            name = "登录次数"
    )
    Integer loginTimes;

    @Property(
            columnDefinition = "timestamp without time zone",
            comments = @Comment("最后登录时间."),
            name = "最后登录时间"
    )
    Date lastLoginTime;

    @Property(
            columnDefinition = "boolean NOT NULL DEFAULT false",
            comments = @Comment("是否禁用."),
            name = "是否禁用"
    )
    Boolean disable;

    @Property(
            columnDefinition = "bigint",
            comments = @Comment("组织ID."),
            name = "组织ID"
    )
    Long organizationId;

    @Property(
            columnDefinition = "smallint",
            comments = @Comment("组织类型."),
            name = "组织类型"
    )
    Integer organizationType;
}
