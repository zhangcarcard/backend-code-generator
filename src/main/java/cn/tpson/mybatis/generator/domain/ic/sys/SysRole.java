package cn.tpson.mybatis.generator.domain.ic.sys;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

@Domain(name = "系统角色", comments = @Comment(value = "系统角色"))
public class SysRole {
    @Property(
            columnDefinition = "varchar(50) NOT NULL",
            comments = @Comment("角色名称."),
            name = "角色名称",
            length = 50,
            nullable = false
    )
    String name;

    @Property(
            columnDefinition = "varchar(50) NOT NULL",
            comments = @Comment("角色描述."),
            name = "角色描述",
            length = 50,
            nullable = false
    )
    String remark;

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
