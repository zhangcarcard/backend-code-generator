package cn.tpson.mybatis.generator.domain.ic.sys;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

@Domain(name = "字典名称", comments = @Comment("字典名称"))
public class SysDicItem {
    @Property(
            columnDefinition = "bigint NOT NULL",
            comments = @Comment("字典ID."),
            name = "字典ID",
            nullable = false
    )
    Long dicId;

    @Property(
            columnDefinition = "varchar(20) NOT NULL",
            comments = @Comment("字典项名称."),
            name = "字典项名称",
            length = 20,
            nullable = false
    )
    String itemName;

    @Property(
            columnDefinition = "varchar(50) NOT NULL",
            comments = @Comment("字典项值."),
            name = "字典项值",
            length = 50,
            nullable = false
    )
    String itemValue;

}
