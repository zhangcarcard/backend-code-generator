package cn.tpson.mybatis.generator.domain.firestock.base;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

@Domain(name = "组织管理", comments = @Comment(value = "组织管理"))
public class Organization {
    @Property(
            columnDefinition = "varchar(30) NOT NULL",
            comments = @Comment("组织名称."),
            name = "组织名称",
            length = 30,
            nullable = false
    )
    String orgName;

    @Property(
            columnDefinition = "bigint unsigned",
            comments = @Comment("父组织ID."),
            name = "父组织ID"
    )
    Long pid;
}
