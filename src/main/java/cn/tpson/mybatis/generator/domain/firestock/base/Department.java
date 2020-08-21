package cn.tpson.mybatis.generator.domain.firestock.base;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

@Domain(name = "部门管理", comments = @Comment(value = "部门管理"))
public class Department {
    @Property(
            columnDefinition = "varchar(30) NOT NULL",
            comments = @Comment("部门名称."),
            name = "部门名称",
            length = 30,
            nullable = false
    )
    String depName;

    @Property(
            columnDefinition = "bigint unsigned",
            comments = @Comment("父部门ID."),
            name = "父部门ID"
    )
    Long pid;
}
