package cn.tpson.mybatis.generator.domain.logistics.goods;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

@Domain(name = "维修工单维修委托", comments = @Comment(value = "维修工单维修委托"))
public class GoodsStockRepairPlan {
    @Property(
            columnDefinition = "bigint unsigned NOT NULL",
            comments = @Comment("维修工单ID."),
            name = "维修工单ID",
            nullable = false
    )
    Long repairOrderId;

    @Property(
            columnDefinition = "varchar(30)",
            comments = @Comment("维修厂家."),
            name = "维修厂家",
            length = 30
    )
    String mfcName;

    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("维修价格."),
            name = "维修价格",
            length = 20
    )
    String price;

    @Property(
            columnDefinition = "varchar(200)",
            comments = @Comment("备注."),
            name = "备注",
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
