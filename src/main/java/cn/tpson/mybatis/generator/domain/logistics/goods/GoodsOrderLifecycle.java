package cn.tpson.mybatis.generator.domain.logistics.goods;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

@Domain(name = "工单流转记录", comments = @Comment(value = "工单流转记录"))
public class GoodsOrderLifecycle {
    @Property(
            columnDefinition = "bigint unsigned NOT NULL",
            comments = @Comment("工单ID."),
            name = "工单ID",
            nullable = false
    )
    Long orderId;

    @Property(
            columnDefinition = "tinyint unsigned",
            comments = @Comment("工单类型(1,2,3,4,5|验收,出库,调拨,报废报损,维修)."),
            name = "工单类型(1,2,3,4,5|验收,出库,调拨,报废报损,维修)."
    )
    Integer type;

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
