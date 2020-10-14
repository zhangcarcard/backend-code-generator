package cn.tpson.mybatis.generator.domain.logistics.sys;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

@Domain(name = "附件管理", comments = @Comment(value = "附件管理"))
public class Attach {
    @Property(
            columnDefinition = "varchar(200) NOT NULL",
            comments = @Comment("url."),
            name = "url",
            length = 200,
            nullable = false
    )
    String url;

    @Property(
            columnDefinition = "varchar(32) NOT NULL",
            comments = @Comment("md5."),
            name = "md5",
            length = 32,
            nullable = false
    )
    String md5;

    @Property(
            columnDefinition = "bit(1)",
            comments = @Comment("是否图片."),
            name = "是否图片"
    )
    Boolean picture;
}
