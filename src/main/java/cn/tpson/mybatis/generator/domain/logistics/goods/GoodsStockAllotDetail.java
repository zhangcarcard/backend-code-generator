package cn.tpson.mybatis.generator.domain.logistics.goods;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

@Domain(name = "物资调拨", comments = @Comment(value = "物资调拨"))
public class GoodsStockAllotDetail {
    @Property(
            columnDefinition = "bigint unsigned NOT NULL",
            comments = @Comment("调拨单ID."),
            name = "调拨单ID",
            nullable = false
    )
    Long allotOrderId;

    @Property(
            columnDefinition = "bigint unsigned NOT NULL",
            comments = @Comment("商品ID."),
            name = "商品ID",
            nullable = false
    )
    Long goodsId;

    @Property(
            columnDefinition = "varchar(50) NOT NULL",
            comments = @Comment("RFID."),
            name = "RFID",
            nullable = false,
            length = 50
    )
    String rfId;
}
