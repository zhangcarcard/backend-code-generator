package cn.tpson.mybatis.generator.domain.ic.base;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

@Domain(name = "统计数据", comments = @Comment(value = "统计数据"))
public class TypeCount {
    @Property(
            columnDefinition = "smallint NOT NULL",
            comments = @Comment("统计类型(1:人员迁入;2:人员迁出)."),
            name = "统计类型",
            nullable = false
    )
    Integer type;
}
