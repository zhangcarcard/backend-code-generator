package cn.tpson.mybatis.generator.domain.logistics.goods;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

import java.math.BigDecimal;

@Domain(name = "核销工单", comments = @Comment(value = "核销工单"))
public class GoodsStockVerOrder {
    @Property(
            columnDefinition = "bigint unsigned NOT NULL",
            comments = @Comment("库房ID."),
            name = "库房ID",
            nullable = false
    )
    Long whId;

    @Property(
            columnDefinition = "varchar(30)",
            comments = @Comment("库房名称."),
            name = "库房名称"
    )
    String whName;

    @Property(
            columnDefinition = "int unsigned",
            comments = @Comment("装备数量."),
            name = "装备数量"
    )
    Integer qty;

    @Property(
            columnDefinition = "decimal(12,2) unsigned",
            comments = @Comment("装备总金额."),
            name = "装备总金额"
    )
    BigDecimal amount;

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

    @Property(
            columnDefinition = "varchar(200)",
            comments = @Comment("备注."),
            name = "备注."
    )
    String remarks;

    @Property(
            columnDefinition = "integer unsigned",
            comments = @Comment("处理用时(秒)."),
            name = "处理用时(秒)"
    )
    Integer timeSpent;
}
