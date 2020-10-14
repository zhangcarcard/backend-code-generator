package cn.tpson.mybatis.generator.domain.logistics.goods;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

@Domain(name = "物资配备", comments = @Comment(value = "物资配备"))
public class GoodsPrepare {
    @Property(
            columnDefinition = "bigint unsigned",
            comments = @Comment("物资ID."),
            name = "物资ID",
            nullable = false
    )
    Long goodsId;

    @Property(
            columnDefinition = "varchar(30)",
            comments = @Comment("商品名称."),
            name = "商品名称",
            length = 30
    )
    String goodsName;

    @Property(
            columnDefinition = "int unsigned",
            comments = @Comment("配备基数."),
            name = "配备基数"
    )
    Integer number;

    @Property(
            columnDefinition = "int unsigned",
            comments = @Comment("配备总数."),
            name = "配备总数"
    )
    Integer amount;

    @Property(
            columnDefinition = "tinyint unsigned",
            comments = @Comment("类型(1,2|套/人,总数)."),
            name = "类型"
    )
    Integer type;
}
