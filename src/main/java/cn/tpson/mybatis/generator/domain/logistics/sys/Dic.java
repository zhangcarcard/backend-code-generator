package cn.tpson.mybatis.generator.domain.logistics.sys;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

@Domain(name = "字典名称", comments = @Comment("字典名称"))
public class Dic {
    @Property(
            columnDefinition = "varchar(20) NOT NULL",
            comments = @Comment("字典显示名称."),
            name = "字典显示名称",
            length = 20,
            nullable = false
    )
    String dicLabel;

    @Property(
            columnDefinition = "varchar(20) NOT NULL",
            comments = @Comment("字典名称."),
            name = "字典名称",
            length = 20,
            nullable = false
    )
    String dicName;
}
