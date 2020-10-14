package cn.tpson.mybatis.generator.domain.logistics.goods;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

import java.math.BigDecimal;

@Domain(name = "维修工单", comments = @Comment(value = "维修工单"))
public class GoodsStockRepairOrder {
    @Property(
            columnDefinition = "varchar(50) NOT NULL",
            comments = @Comment("rfId."),
            name = "rfId",
            length = 50,
            nullable = false
    )
    String rfId;

    @Property(
            columnDefinition = "bigint unsigned",
            comments = @Comment("商品ID."),
            name = "商品ID"
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
            columnDefinition = "varchar(30)",
            comments = @Comment("库房名称."),
            name = "库房名称",
            length = 30
    )
    String whName;

    @Property(
            columnDefinition = "tinyint",
            comments = @Comment("委托类型(1,2,3,4|自行维修,委外(厂家维修),委外(战保维修),无法维修)."),
            name = "委托类型(1,2,3,4|自行维修,委外(厂家维修),委外(战保维修),无法维修)"
    )
    Integer type;

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

    @Property(
            columnDefinition = "tinyint unsigned",
            comments = @Comment("状态(0,1,2,3,4|待审核,审核中,审核通过,审核不通过,未提交)."),
            name = "状态(0,1,2,3,4|待审核,审核中,审核通过,审核不通过,未提交)"
    )
    Integer status;
}
