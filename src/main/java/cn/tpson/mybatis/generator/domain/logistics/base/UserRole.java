package cn.tpson.mybatis.generator.domain.logistics.base;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

@Domain(name = "用户-角色关联表", comments = @Comment(value = "用户-角色关联表"))
public class UserRole {
    @Property(
            columnDefinition = "bigint unsigned NOT NULL",
            comments = @Comment("用户ID."),
            name = "用户ID",
            nullable = false
    )
    Long userId;

    @Property(
            columnDefinition = "bigint unsigned NOT NULL",
            comments = @Comment("角色ID."),
            name = "角色ID",
            nullable = false
    )
    Long roleId;
}
