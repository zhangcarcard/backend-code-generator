package cn.tpson.mybatis.generator.domain.logistics.base;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

@Domain(name = "操作功能", comments = @Comment(value = "操作功能"))
public class Action {
    @Property(
            columnDefinition = "bigint unsigned",
            comments = @Comment("父ID."),
            name = "父ID"
    )
    Long pid;

    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("功能名称."),
            name = "功能名称",
            length = 20
    )
    String title;

    @Property(
            columnDefinition = "varchar(10)",
            comments = @Comment("HTTP方法(GET/POST/PUT/DELETE)."),
            name = "HTTP方法",
            length = 10
    )
    String method;

    @Property(
            columnDefinition = "varchar(500)",
            comments = @Comment("URI."),
            name = "URI",
            length = 500
    )
    String uri;
}
