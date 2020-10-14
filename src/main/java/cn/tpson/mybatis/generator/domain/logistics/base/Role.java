package cn.tpson.mybatis.generator.domain.logistics.base;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

@Domain(name = "角色管理", comments = @Comment(value = "角色管理"))
public class Role {
    @Property(
            columnDefinition = "varchar(30)",
            comments = @Comment("所属部门名称."),
            name = "所属部门名称",
            length = 30
    )
    String depName;

    @Property(
            columnDefinition = "varchar(20) NOT NULL",
            comments = @Comment("角色名称."),
            name = "角色名称",
            length = 20,
            nullable = false
    )
    String roleName;

    @Property(
            columnDefinition = "tinyint unsigned",
            comments = @Comment("状态(0,1|正常,禁用)."),
            name = "状态"
    )
    Integer status;
}
