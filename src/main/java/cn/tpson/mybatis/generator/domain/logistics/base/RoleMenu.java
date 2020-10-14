package cn.tpson.mybatis.generator.domain.logistics.base;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

@Domain(name = "角色-菜单关联表", comments = @Comment(value = "角色-菜单关联表"))
public class RoleMenu {
    @Property(
            columnDefinition = "bigint unsigned NOT NULL",
            comments = @Comment("角色ID."),
            name = "角色ID",
            nullable = false
    )
    Long roleId;

    @Property(
            columnDefinition = "bigint unsigned NOT NULL",
            comments = @Comment("菜单ID."),
            name = "菜单ID",
            nullable = false
    )
    Long menuId;
}
