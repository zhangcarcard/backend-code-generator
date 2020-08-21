package cn.tpson.mybatis.generator.domain.ic.base;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

@Domain(name = "地址管理", comments = @Comment(value = "地址管理"))
public class Address {
    @Property(
            columnDefinition = "varchar(50) NOT NULL",
            comments = @Comment("地址名称."),
            name = "地址名称",
            length = 50,
            nullable = false
    )
    String name;

    @Property(
            columnDefinition = "bigint NOT NULL",
            comments = @Comment("父地址ID."),
            name = "父地址ID",
            nullable = false
    )
    Long pid;

    @Property(
            columnDefinition = "smallint",
            comments = @Comment("等级(1,省;2,市;3.区;4.路;5.街道门牌号.)"),
            name = "等级"
    )
    Integer level;

    @Property(
            columnDefinition = "bigint",
            comments = @Comment("创建者ID."),
            name = "创建者ID"
    )
    Long creator;
}
