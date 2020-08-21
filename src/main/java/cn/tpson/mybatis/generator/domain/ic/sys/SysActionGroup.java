package cn.tpson.mybatis.generator.domain.ic.sys;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

@Domain(name = "角色权限关系", comments = @Comment(value = "角色权限关系"))
public class SysActionGroup {
    @Property(
            columnDefinition = "varchar(20) NOT NULL",
            comments = @Comment("组标识名称."),
            name = "组标识名称",
            length = 20,
            nullable = false
    )
    String name;

    @Property(
            columnDefinition = "varchar(20) NOT NULL",
            comments = @Comment("组显示名称."),
            name = "组显示名称",
            length = 20,
            nullable = false
    )
    String title;
}
