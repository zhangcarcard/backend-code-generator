package cn.tpson.mybatis.generator.domain.logistics.base;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

@Domain(name = "角色-功能关联表", comments = @Comment(value = "角色-功能关联表"))
public class RoleAction {
    @Property(
            columnDefinition = "bigint unsigned NOT NULL",
            comments = @Comment("角色ID."),
            name = "角色ID",
            nullable = false
    )
    Long roleId;

    @Property(
            columnDefinition = "bigint unsigned NOT NULL",
            comments = @Comment("功能ID."),
            name = "功能ID",
            nullable = false
    )
    Long actionId;
}
