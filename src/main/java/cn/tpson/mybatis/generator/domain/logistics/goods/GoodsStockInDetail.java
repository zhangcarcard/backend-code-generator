package cn.tpson.mybatis.generator.domain.logistics.goods;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

import java.util.List;

@Domain(name = "入库明细", comments = @Comment(value = "入库明细"))
public class GoodsStockInDetail {
    @Property(
            columnDefinition = "bigint unsigned NOT NULL",
            comments = @Comment("入库工单ID."),
            name = "入库工单ID",
            nullable = false
    )
    Long inOrderId;

    @Property(
            columnDefinition = "varchar(50) NOT NULL",
            comments = @Comment("RFID."),
            name = "RFID",
            nullable = false
    )
    String rfId;

    @Property(
            columnDefinition = "bigint unsigned NOT NULL",
            comments = @Comment("商品ID."),
            name = "商品ID",
            nullable = false
    )
    Long goodsId;
}
