package cn.tpson.mybatis.generator.domain.ic.sys;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

@Domain(name = "系统菜单-组织", comments = @Comment(value = "系统菜单-组织"))
public class SysMenuOrg {
    @Property(
            columnDefinition = "bigint",
            comments = @Comment("菜单ID."),
            name = "菜单ID"
    )
    Long menuId;

    @Property(
            columnDefinition = "bigint",
            comments = @Comment("组织ID."),
            name = "组织ID"
    )
    Long orgId;

    @Property(
            columnDefinition = "integer",
            comments = @Comment("组织类型."),
            name = "组织类型"
    )
    Integer orgType;
}
