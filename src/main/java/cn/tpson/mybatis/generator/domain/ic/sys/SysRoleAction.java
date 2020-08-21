package cn.tpson.mybatis.generator.domain.ic.sys;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

@Domain(name = "角色权限关系", comments = @Comment(value = "角色权限关系"))
public class SysRoleAction {
    @Property(
            columnDefinition = "bigint NOT NULL",
            comments = @Comment("角色ID."),
            name = "角色ID",
            nullable = false
    )
    Long roleId;

    @Property(
            columnDefinition = "bigint NOT NULL",
            comments = @Comment("权限ID."),
            name = "权限ID",
            nullable = false
    )
    Long actionId;
}
