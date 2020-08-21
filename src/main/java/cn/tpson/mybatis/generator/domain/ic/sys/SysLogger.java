package cn.tpson.mybatis.generator.domain.ic.sys;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

@Domain(name = "系统日志", comments = @Comment(value = "系统日志"))
public class SysLogger {
    @Property(
            columnDefinition = "bigint",
            comments = @Comment("操作者ID."),
            name = "操作者ID"
    )
    Long userId;

    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("操作中IP."),
            name = "操作中IP"
    )
    String ip;

    @Property(
            columnDefinition = "varchar(50)",
            comments = @Comment("操作名称."),
            name = "操作名称"
    )
    String operator;

    @Property(
            columnDefinition = "smallint",
            comments = @Comment("日志类型(1.登录日志|2.操作日志)."),
            name = "日志类型"
    )
    Integer type;

    @Property(
            columnDefinition = "smallint",
            comments = @Comment("日志组别(1.web客户端|2.桌面客户端|3.app客户端)."),
            name = "日志组别"
    )
    Integer groupId;

    @Property(
            columnDefinition = "boolean NOT NULL DEFAULT true",
            comments = @Comment("是否成功."),
            name = "是否成功"
    )
    Boolean status;

    @Property(
            columnDefinition = "bigint",
            comments = @Comment("组织ID."),
            name = "组织ID"
    )
    Long organizationId;

    @Property(
            columnDefinition = "varchar(50)",
            comments = @Comment("描述."),
            name = "描述"
    )
    String remark;

    @Property(
            columnDefinition = "smallint",
            comments = @Comment("组织类型."),
            name = "组织类型"
    )
    Integer organizationType;

    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("登录用户."),
            name = "登录用户"
    )
    String username;

    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("真实姓名."),
            name = "真实姓名"
    )
    String realname;
}
