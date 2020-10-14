package cn.tpson.mybatis.generator.domain.logistics.goods;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

import java.util.Date;
import java.util.List;

@Domain(name = "验收记录", comments = @Comment(value = "验收记录"))
public class GoodsPurchaseOrderCheckHistory {
    @Property(
            columnDefinition = "varchar(30) NOT NULL",
            comments = @Comment("订单号."),
            name = "订单号",
            length = 30,
            nullable = false
    )
    String orderNo;

    @Property(
            columnDefinition = "int unsigned",
            comments = @Comment("数量."),
            name = "数量"
    )
    Integer qty;

    @Property(
            columnDefinition = "bigint unsigned",
            comments = @Comment("验收负责人ID."),
            name = "验收负责人ID"
    )
    Long leaderId;

    @Property(
            columnDefinition = "varchar(50)",
            comments = @Comment("验收参与人ID列表,逗号隔开."),
            name = "验收参与人ID列表,逗号隔开",
            length = 50
    )
    String userIds;

    @Property(
            columnDefinition = "varchar(200)",
            comments = @Comment("不通过原因."),
            name = "不通过原因"
    )
    String msg;

    @Property(
            columnDefinition = "tinyint unsigned",
            comments = @Comment("状态(2,3,4|审核不通过,审核部分通过,审核通过)."),
            name = "状态(0,1,2|审核不通过,审核部分通过,审核通过)"
    )
    Integer status;

    @Property(
            columnDefinition = "varchar(50)",
            comments = @Comment("照片ID列表,逗号隔开."),
            name = "照片ID列表,逗号隔开",
            length = 50
    )
    String photoIds;

    @Property(
            columnDefinition = "json",
            comments = @Comment("不合格物资列表."),
            name = "不合格物资列表."
    )
    List abnormalList;
}
