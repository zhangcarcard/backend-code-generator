package cn.tpson.mybatis.generator.domain.logistics.goods;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

import java.math.BigDecimal;

@Domain(name = "装备台账表头", comments = @Comment(value = "装备台账表头"))
public class GoodsTableHeader {
    @Property(
            columnDefinition = "bigint unsigned NOT NULL",
            comments = @Comment("商品ID."),
            name = "商品ID",
            nullable = false
    )
    Long goodsId;

    @Property(
            columnDefinition = "varchar(30) NOT NULL",
            comments = @Comment("商品名称."),
            name = "商品名称",
            length = 30,
            nullable = false
    )
    String goodsName;

    @Property(
            columnDefinition = "tinyint unsigned NOT NULL",
            comments = @Comment("排序号."),
            name = "排序号",
            nullable = false
    )
    Integer idx;
}
