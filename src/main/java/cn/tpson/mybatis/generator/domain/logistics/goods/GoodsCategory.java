package cn.tpson.mybatis.generator.domain.logistics.goods;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

@Domain(name = "商品类目", comments = @Comment(value = "商品类目"))
public class GoodsCategory {
    @Property(
            columnDefinition = "bigint unsigned",
            comments = @Comment("父类目ID."),
            name = "父类目ID"
    )
    Long pid;

    @Property(
            columnDefinition = "varchar(30) NOT NULL",
            comments = @Comment("类目名称."),
            name = "类目名称",
            length = 30,
            nullable = false
    )
    String cryName;

    @Property(
            columnDefinition = "int2 unsigned",
            comments = @Comment("层级."),
            name = "层级"
    )
    Integer level;
}
