package cn.tpson.mybatis.generator.domain.logistics.goods;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

import java.util.List;

@Domain(name = "维修工单维修详情", comments = @Comment(value = "维修工单维修详情"))
public class GoodsStockRepairDetail {
    @Property(
            columnDefinition = "bigint unsigned NOT NULL",
            comments = @Comment("维修工单ID."),
            name = "维修工单ID",
            nullable = false
    )
    Long repairOrderId;

    @Property(
            columnDefinition = "varchar(200)",
            comments = @Comment("照片列表,逗号隔开."),
            name = "照片列表,逗号隔开.",
            length = 200
    )
    String photoIds;

    @Property(
            columnDefinition = "varchar(200)",
            comments = @Comment("发票照片列表,逗号隔开."),
            name = "发票照片列表,逗号隔开.",
            length = 200
    )
    String receiptPhotoIds;

    @Property(
            columnDefinition = "json",
            comments = @Comment("配件更新."),
            name = "配件更新"
    )
    List updateItems;

    @Property(
            columnDefinition = "varchar(200)",
            comments = @Comment("备注."),
            name = "备注",
            length = 200
    )
    String remarks;

    @Property(
            columnDefinition = "bigint unsigned",
            comments = @Comment("负责人ID."),
            name = "负责人ID"
    )
    Long managerId;

    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("负责人姓名."),
            name = "负责人姓名"
    )
    String managerName;
}
