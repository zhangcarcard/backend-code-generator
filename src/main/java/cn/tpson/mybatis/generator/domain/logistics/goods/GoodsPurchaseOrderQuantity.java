package cn.tpson.mybatis.generator.domain.logistics.goods;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

import java.util.Date;

@Domain(name = "物资采购单商品数量", comments = @Comment(value = "物资采购单商品数量"))
public class GoodsPurchaseOrderQuantity {
    @Property(
            columnDefinition = "varchar(30) NOT NULL",
            comments = @Comment("采购单号."),
            name = "采购单号",
            length = 30,
            nullable = false
    )
    String orderNo;

    @Property(
            columnDefinition = "bigint unsigned NOT NULL",
            comments = @Comment("商品ID."),
            name = "商品ID",
            nullable = false
    )
    Long goodsId;

    @Property(
            columnDefinition = "int unsigned",
            comments = @Comment("商品数量."),
            name = "商品数量"
    )
    Integer qty;

    @Property(
            columnDefinition = "int unsigned",
            comments = @Comment("绑定数量."),
            name = "绑定数量"
    )
    Integer boundQty;
}
