package cn.tpson.mybatis.generator.domain.logistics.goods;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

@Domain(name = "物资盘点异常明细", comments = @Comment(value = "物资盘点异常明细"))
public class GoodsStocktakingAbnormal {
    @Property(
            columnDefinition = "bigint unsigned NOT NULL",
            comments = @Comment("盘点ID."),
            name = "盘点ID",
            nullable = false
    )
    Long stId;

    @Property(
            columnDefinition = "varchar(50) NOT NULL",
            comments = @Comment("rfId."),
            name = "rfId",
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
            columnDefinition = "varchar(30)",
            comments = @Comment("商品名称."),
            name = "商品名称",
            length = 30
    )
    String goodsName;

    @Property(
            columnDefinition = "varchar(200)",
            comments = @Comment("异常描述."),
            name = "异常描述",
            length = 200
    )
    String remarks;

    @Property(
            columnDefinition = "varchar(200)",
            comments = @Comment("照片列表,逗号隔开."),
            name = "照片列表,逗号隔开.",
            length = 200
    )
    String photoIds;
}
