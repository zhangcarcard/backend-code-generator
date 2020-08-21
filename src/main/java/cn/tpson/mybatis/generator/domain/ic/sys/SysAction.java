package cn.tpson.mybatis.generator.domain.ic.sys;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

@Domain(name = "系统权限", comments = @Comment(value = "系统权限"))
public class SysAction {
    @Property(
            columnDefinition = "bigint",
            comments = @Comment("父ID."),
            name = "父ID"
    )
    Long pid;

    @Property(
            columnDefinition = "bigint",
            comments = @Comment("操作组ID."),
            name = "操作组ID"
    )
    Long groupId;

    @Property(
            columnDefinition = "bigint",
            comments = @Comment("所属模块ID."),
            name = "所属模块ID"
    )
    Long systemId;

    @Property(
            columnDefinition = "varchar(500)",
            comments = @Comment("URI."),
            name = "URI",
            length = 500
    )
    String uri;

    @Property(
            columnDefinition = "varchar(100)",
            comments = @Comment("权限名称."),
            name = "权限名称",
            length = 100
    )
    String title;

    @Property(
            columnDefinition = "varchar(100)",
            comments = @Comment("权限备注."),
            name = "权限备注",
            length = 100
    )
    String remark;

    @Property(
            columnDefinition = "boolean",
            comments = @Comment("是否叶子节点."),
            name = "是否叶子节点"
    )
    Boolean last;

    @Property(
            columnDefinition = "boolean",
            comments = @Comment("是否显示."),
            name = "是否显示"
    )
    Boolean show;

    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("HTTP方法(GET/POST/PUT/DELETE)."),
            name = "HTTP方法",
            length = 20
    )
    String method;
}
