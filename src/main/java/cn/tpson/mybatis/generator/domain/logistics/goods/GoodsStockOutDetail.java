package cn.tpson.mybatis.generator.domain.logistics.goods;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

import java.util.Date;
import java.util.List;

@Domain(name = "出库明细", comments = @Comment(value = "出库明细"))
public class GoodsStockOutDetail {
    @Property(
            columnDefinition = "bigint unsigned NOT NULL",
            comments = @Comment("出库工单ID."),
            name = "出库工单ID",
            nullable = false
    )
    Long outOrderId;

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

    @Property(
            columnDefinition = "bit(1)",
            comments = @Comment("是否归还."),
            name = "是否归还"
    )
    Boolean back;

    @Property(
            columnDefinition = "datetime",
            comments = @Comment("归还时间."),
            name = "归还时间."
    )
    Date gmtBack;
}
