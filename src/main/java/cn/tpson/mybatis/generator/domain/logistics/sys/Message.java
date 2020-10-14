package cn.tpson.mybatis.generator.domain.logistics.sys;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

@Domain(name = "站内消息", comments = @Comment(value = "站内消息"))
public class Message {
    @Property(
            columnDefinition = "varchar(50) NOT NULL",
            comments = @Comment("标题."),
            name = "标题",
            length = 50,
            nullable = false
    )
    String title;

    @Property(
            columnDefinition = "text NOT NULL",
            comments = @Comment("正文."),
            name = "正文",
            length = 200,
            nullable = false
    )
    String content;
}
