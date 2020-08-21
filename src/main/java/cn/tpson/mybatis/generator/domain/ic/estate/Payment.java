package cn.tpson.mybatis.generator.domain.ic.estate;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

import java.util.Date;

/**
 * @author wangJiaHui
 * @date 2020/4/10 14
 */
@Domain(name = "缴费登记", comments = @Comment(value = "缴费登记"))
public class Payment {

    @Property(
            columnDefinition = "bigint",
            comments = @Comment("小区ID."),
            name = "小区ID"
    )
    Long communityId;
    @Property(
            columnDefinition = "bigint",
            comments = @Comment("根据缴费类型ID."),
            name = "根据缴费类型ID"
    )
    Long paymentId;
    @Property(
            columnDefinition = "smallint",
            comments = @Comment("缴费类型(1.商用|2.住宅|3.车辆)."),
            name = "缴费类型"
    )
    Integer paymentType;
    @Property(
            columnDefinition = "timestamp without time zone",
            comments = @Comment("缴费时间段开始节点."),
            name = "缴费时间段开始节点"
    )
    Date startTime;
    @Property(
            columnDefinition = "timestamp without time zone",
            comments = @Comment("缴费时间的末节点."),
            name = "缴费时间的末节点"
    )
    Date endTime;
    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("房屋名称."),
            name = "房屋名称",
            length = 20
    )
    String houseName;
    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("人员名称."),
            name = "人员名称",
            length = 20
    )
    String peopleName;
    @Property(
            columnDefinition = "bigint",
            comments = @Comment("人员ID."),
            name = "人员ID"
    )
    Long peopleId;
    @Property(
            columnDefinition = "bigint",
            comments = @Comment("用户ID."),
            name = "用户ID"
    )
    Long userId;
    @Property(
            columnDefinition = "boolean NOT NULL DEFAULT false",
            comments = @Comment("是否已删除."),
            name = "是否已删除"
    )
    Boolean delete;

    @Property(
            columnDefinition = "timestamp without time zone",
            comments = @Comment("删除时间."),
            name = "删除时间"
    )
    Date deleteTime;

    @Property(
            columnDefinition = "boolean NOT NULL DEFAULT false",
            comments = @Comment("是否已经缴费."),
            name = "是否已经缴费"
    )
    Boolean payed;

    @Property(
            columnDefinition = "float8",
            comments = @Comment("缴费金额"),
            name = "缴费金额"
    )
    Double amount;
    @Property(
            columnDefinition = "timestamp without time zone",
            comments = @Comment("缴费时间."),
            name = "缴费时间"
    )
    Date payTime;
    @Property(
            columnDefinition = "timestamp without time zone",
            comments = @Comment("预期缴费时间."),
            name = "预期缴费时间"
    )
    Date plannedPayTime;
    @Property(
            columnDefinition = "varchar(40)",
            comments = @Comment("订单号类型字母 + 时间 + 小区id后4位 + 用户id后4位 + 随机数1000 - 9999."),
            name = "订单号类型字母 + 时间 + 小区id后4位 + 用户id后4位 + 随机数1000 - 9999",
            length = 40
    )
    String code;
    @Property(
            columnDefinition = "varchar(200)",
            comments = @Comment("主题."),
            name = "主题",
            length = 200
    )
    String theme;
    @Property(
            columnDefinition = "varchar(50)",
            comments = @Comment("支付宝订单号."),
            name = "支付宝订单号",
            length = 50
    )
    String alipayCode;
    @Property(
            columnDefinition = "smallint NOT NULL DEFAULT 0",
            comments = @Comment("支付状态(1.支付成功|2.交易完成|3.交易关闭|4.支付金额异常)."),
            name = "支付状态"
    )
    Integer status;
    @Property(
            columnDefinition = "smallint NOT NULL DEFAULT 0",
            comments = @Comment("缴费方式(1.现金|2.支付宝-人工|3.微信-人工|4.银行转账-人工|5.支付宝-手机自助|6.微信-手机自助|7.银行转账-手机自助)."),
            name = "缴费方式"
    )
    Integer payWay;
    @Property(
            columnDefinition = "varchar(500)",
            comments = @Comment("备注当用户将缴费状态从已缴费更改为未缴费时填写."),
            name = "备注当用户将缴费状态从已缴费更改为未缴费时填写",
            length = 500
    )
    String remark;

}
