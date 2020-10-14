package cn.tpson.mybatis.generator.domain.logistics.base;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

@Domain(name = "菜单", comments = @Comment(value = "菜单"))
public class Menu {
    @Property(
            columnDefinition = "bigint unsigned",
            comments = @Comment("父ID."),
            name = "父ID"
    )
    Long pid;

    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("菜单名称."),
            name = "菜单名称",
            length = 20
    )
    String title;

    @Property(
            columnDefinition = "tinyint unsigned",
            comments = @Comment("菜单类型(1,2|WEB,APP)."),
            name = "菜单类型"
    )
    Integer type;
}
