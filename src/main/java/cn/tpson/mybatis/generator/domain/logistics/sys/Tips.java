package cn.tpson.mybatis.generator.domain.logistics.sys;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

@Domain(name = "提示语管理", comments = @Comment(value = "提示语管理"))
public class Tips {
    @Property(
            columnDefinition = "varchar(200) NOT NULL",
            comments = @Comment("内容."),
            name = "内容",
            length = 200,
            nullable = false
    )
    String content;

    @Property(
            columnDefinition = "tinyint unsigned",
            comments = @Comment("用途类型."),
            name = "用途类型"
    )
    Integer type;
}
