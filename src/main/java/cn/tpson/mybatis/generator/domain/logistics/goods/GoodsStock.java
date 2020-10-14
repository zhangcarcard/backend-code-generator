package cn.tpson.mybatis.generator.domain.logistics.goods;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

@Domain(name = "物资库存", comments = @Comment(value = "物资库存"))
public class GoodsStock {
    @Property(
            columnDefinition = "bigint unsigned NOT NULL",
            comments = @Comment("商品ID."),
            name = "商品ID",
            nullable = false
    )
    Long goodsId;

    @Property(
            columnDefinition = "bigint unsigned NOT NULL",
            comments = @Comment("库房ID."),
            name = "库房ID",
            nullable = false
    )
    Long whId;

    @Property(
            columnDefinition = "int unsigned NOT NULL",
            comments = @Comment("数量."),
            name = "数量",
            nullable = false
    )
    Integer qty;
}
