package cn.tpson.mybatis.generator.domain.ic.sys;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

@Domain(name = "系统菜单", comments = @Comment(value = "系统菜单"))
public class SysMenu {
    @Property(
            columnDefinition = "varchar(50)",
            comments = @Comment("菜单名称."),
            name = "菜单名称",
            length = 50
    )
    String name;

    @Property(
            columnDefinition = "varchar(200)",
            comments = @Comment("菜单描述."),
            name = "菜单描述",
            length = 200
    )
    String description;

    @Property(
            columnDefinition = "bigint",
            comments = @Comment("父ID."),
            name = "父ID"
    )
    Long pid;

    @Property(
            columnDefinition = "varchar(50)",
            comments = @Comment("路径."),
            name = "路径",
            length = 50
    )
    String path;

    @Property(
            columnDefinition = "integer",
            comments = @Comment("序号."),
            name = "序号"
    )
    Integer sort;

    @Property(
            columnDefinition = "integer",
            comments = @Comment("小区序号."),
            name = "小区序号"
    )
    Integer communitySort;

    @Property(
            columnDefinition = "integer",
            comments = @Comment("公安,行政,物业序号."),
            name = "公安,行政,物业序号"
    )
    Integer policeSort;

    @Property(
            columnDefinition = "boolean NOT NULL DEFAULT true",
            comments = @Comment("是否显示."),
            name = "是否显示"
    )
    Boolean show;

    @Property(
            columnDefinition = "integer",
            comments = @Comment("类型(小区网页端/1,保安手机版/2)."),
            name = "类型"
    )
    Integer type;
}
