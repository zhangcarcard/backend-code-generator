package cn.tpson.mybatis.generator.domain.logistics.goods;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

@Domain(name = "物资库存明细", comments = @Comment(value = "物资库存明细"))
public class GoodsStockDetail {
    @Property(
            columnDefinition = "bigint unsigned NOT NULL",
            comments = @Comment("商品ID."),
            name = "商品ID",
            nullable = false
    )
    Long goodsId;

    @Property(
            columnDefinition = "varchar(30)",
            comments = @Comment("商品名称."),
            name = "商品名称",
            length = 30,
            nullable = false
    )
    String goodsName;

    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("品牌."),
            name = "品牌",
            length = 20,
            nullable = false
    )
    String brand;

    @Property(
            columnDefinition = "bigint unsigned NOT NULL",
            comments = @Comment("库房ID."),
            name = "库房ID",
            nullable = false
    )
    Long whId;

    @Property(
            columnDefinition = "bigint unsigned",
            comments = @Comment("库房区域ID."),
            name = "库房区域ID"
    )
    Long whRegionId;

    @Property(
            columnDefinition = "varchar(50) NOT NULL",
            comments = @Comment("rfId."),
            name = "rfId",
            nullable = false,
            length = 50
    )
    String rfId;

    @Property(
            columnDefinition = "varchar(50) NOT NULL",
            comments = @Comment("nfcId."),
            name = "nfcId",
            nullable = false,
            length = 30
    )
    String nfcId;

    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("生产日期(年/月/日)."),
            name = "生产日期(年/月/日)",
            length = 20
    )
    String mfcDate;

    @Property(
            columnDefinition = "bit(1)",
            comments = @Comment("是否出库(true|false)."),
            name = "是否出库(true|false)."
    )
    Boolean outStock;

    @Property(
            columnDefinition = "bit(1)",
            comments = @Comment("入库确认(true|false)."),
            name = "入库确认(true|false)."
    )
    Boolean ack;
}
