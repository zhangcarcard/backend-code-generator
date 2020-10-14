package cn.tpson.mybatis.generator.domain.logistics.goods;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

import java.math.BigDecimal;

@Domain(name = "核销工单明细", comments = @Comment(value = "核销工单明细"))
public class GoodsStockVerDetail {
    @Property(
            columnDefinition = "bigint unsigned NOT NULL",
            comments = @Comment("核销工单ID."),
            name = "核销工单ID",
            nullable = false
    )
    Long verOrderId;

    @Property(
            columnDefinition = "varchar(50) NOT NULL",
            comments = @Comment("RFID."),
            name = "RFID",
            nullable = false,
            length = 50
    )
    String rfId;

    @Property(
            columnDefinition = "bigint unsigned NOT NULL",
            comments = @Comment("商品ID."),
            name = "商品ID",
            nullable = false
    )
    Long goodsId;


    @Property(
            columnDefinition = "decimal(12,2) unsigned",
            comments = @Comment("装备总金额."),
            name = "装备总金额"
    )
    BigDecimal amount;

    @Property(
            columnDefinition = "varchar(30)",
            comments = @Comment("商品名称."),
            name = "商品名称.",
            length = 30
    )
    String goodsName;
}
