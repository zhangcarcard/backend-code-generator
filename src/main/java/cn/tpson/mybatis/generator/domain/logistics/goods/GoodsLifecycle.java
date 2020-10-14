package cn.tpson.mybatis.generator.domain.logistics.goods;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

@Domain(name = "物资流转记录", comments = @Comment(value = "物资流转记录"))
public class GoodsLifecycle {
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
            name = "商品名称"
    )
    String goodsName;

    @Property(
            columnDefinition = "varchar(50)",
            comments = @Comment("rfId."),
            name = "rfId"
    )
    String rfId;

    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("事件名称."),
            name = "事件名称"
    )
    String eventName;

    @Property(
            columnDefinition = "bigint unsigned NOT NULL",
            comments = @Comment("操作人ID."),
            name = "操作人ID",
            nullable = false
    )
    Long userId;

    @Property(
            columnDefinition = "varchar(30)",
            comments = @Comment("操作人姓名."),
            name = "操作人姓名"
    )
    String username;

    @Property(
            columnDefinition = "varchar(200)",
            comments = @Comment("备注."),
            name = "备注"
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
