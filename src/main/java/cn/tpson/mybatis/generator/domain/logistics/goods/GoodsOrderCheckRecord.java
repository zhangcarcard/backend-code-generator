package cn.tpson.mybatis.generator.domain.logistics.goods;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

@Domain(name = "工单审批记录", comments = @Comment(value = "工单审批记录"))
public class GoodsOrderCheckRecord {
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
            columnDefinition = "varchar(200)",
            comments = @Comment("不通过原因."),
            name = "不通过原因"
    )
    String msg;

    @Property(
            columnDefinition = "bit(1) NOT NULL",
            comments = @Comment("状态(true,false|批准,不批准)."),
            name = "状态(true,false|批准,不批准).",
            nullable = false
    )
    Boolean approval;

    @Property(
            columnDefinition = "varchar(50)",
            comments = @Comment("照片ID列表,逗号隔开."),
            name = "照片ID列表,逗号隔开",
            length = 50
    )
    String photoIds;

    @Property(
            columnDefinition = "bigint unsigned",
            comments = @Comment("审批人ID."),
            name = "审批人ID"
    )
    Long checkUserId;

    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("审批人姓名."),
            name = "审批人姓名"
    )
    String checkUsername;
}
