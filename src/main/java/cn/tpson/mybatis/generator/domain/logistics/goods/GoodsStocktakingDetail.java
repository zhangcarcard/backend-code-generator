package cn.tpson.mybatis.generator.domain.logistics.goods;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

import java.util.List;

@Domain(name = "物资盘点明细", comments = @Comment(value = "物资盘点明细"))
public class GoodsStocktakingDetail {
    @Property(
            columnDefinition = "bigint unsigned NOT NULL",
            comments = @Comment("盘点记录ID."),
            name = "盘点记录ID",
            nullable = false
    )
    Long stId;

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
            columnDefinition = "varchar(5) NOT NULL",
            comments = @Comment("计数单位."),
            name = "计数单位",
            length = 5,
            nullable = false
    )
    String unit;

    @Property(
            columnDefinition = "int unsigned NOT NULL",
            comments = @Comment("统计总数."),
            name = "统计总数",
            nullable = false
    )
    Integer total;

    @Property(
            columnDefinition = "int unsigned NOT NULL",
            comments = @Comment("盘点总数."),
            name = "盘点总数",
            nullable = false
    )
    Integer stTotal;

    @Property(
            columnDefinition = "int unsigned NOT NULL",
            comments = @Comment("异常总数."),
            name = "异常总数",
            nullable = false
    )
    Integer abTotal;

    @Property(
            columnDefinition = "bit(1)",
            comments = @Comment("是否正常."),
            name = "是否正常"
    )
    Boolean ok;
}
