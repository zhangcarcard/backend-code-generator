package cn.tpson.mybatis.generator.domain.logistics.goods;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

import java.math.BigDecimal;

@Domain(name = "物资调拨工单", comments = @Comment(value = "物资调拨工单"))
public class GoodsStockAllotOrder {
    @Property(
            columnDefinition = "bigint unsigned NOT NULL",
            comments = @Comment("调出部门ID."),
            name = "调出部门ID",
            nullable = false
    )
    Long fromDepId;

    @Property(
            columnDefinition = "bigint unsigned",
            comments = @Comment("调入部门ID."),
            name = "调入部门ID"
    )
    Long toDepId;

    @Property(
            columnDefinition = "bigint unsigned",
            comments = @Comment("使用人ID."),
            name = "使用人ID"
    )
    Long toUid;

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
}
