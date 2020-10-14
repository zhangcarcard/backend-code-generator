package cn.tpson.mybatis.generator.domain.logistics.goods;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

import java.math.BigDecimal;
import java.util.Date;

@Domain(name = "出库工单", comments = @Comment(value = "出库工单"))
public class GoodsStockOutOrder {
    @Property(
            columnDefinition = "bigint unsigned NOT NULL",
            comments = @Comment("出库库房ID."),
            name = "出库库房ID",
            nullable = false
    )
    Long fromWhId;

    @Property(
            columnDefinition = "bigint unsigned",
            comments = @Comment("去向库房ID."),
            name = "去向库房ID"
    )
    Long toWhId;

    @Property(
            columnDefinition = "bigint unsigned NOT NULL",
            comments = @Comment("使用人ID."),
            name = "使用人ID",
            nullable = false
    )
    Long toUid;

    @Property(
            columnDefinition = "int unsigned",
            comments = @Comment("装备数量."),
            name = "装备数量"
    )
    Integer qty;

    @Property(
            columnDefinition = "tinyint unsigned",
            comments = @Comment("出库方式(1,2,3,4,5|普通配发,紧急配发,普通自取,紧急自取,调拨)."),
            name = "出库方式(1,2,3,4,5|普通配发,紧急配发,普通自取,紧急自取,调拨)."
    )
    Integer type;

    @Property(
            columnDefinition = "varchar(200)",
            comments = @Comment("出库原因."),
            name = "出库原因."
    )
    String causeMsg;

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
            columnDefinition = "datetime",
            comments = @Comment("归还期限."),
            name = "归还期限."
    )
    Date gmtLimitTime;

    @Property(
            columnDefinition = "bit(1)",
            comments = @Comment("是否归还."),
            name = "是否归还"
    )
    Boolean back;
}
