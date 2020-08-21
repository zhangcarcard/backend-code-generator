package cn.tpson.mybatis.generator.domain.ic.car;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

import java.util.Date;

/**
 * @author wangJiaHui
 * @date 2020/4/13 10
 */
@Domain(name = "车辆管理", comments = @Comment(value = "车辆管理"))
public class Car {
    @Property(
            columnDefinition = "bigint",
            comments = @Comment("小区ID."),
            name = "小区ID",
            nullable = false
    )
    Long communityId;
    @Property(
            columnDefinition = "bigint",
            comments = @Comment("人员ID."),
            name = "人员ID"
    )
    Long peopleId;
    @Property(
            columnDefinition = "varchar(10)",
            comments = @Comment("车牌号."),
            name = "车牌号",
            length = 10,
            nullable = false
    )
    String number;
    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("车主姓名."),
            name = "车主姓名",
            length = 20
    )
    String name;
    @Property(
            columnDefinition = "smallint",
            comments = @Comment("车辆类型(1.摩托车|2.轿车|3.货车|4.其他|5.电瓶车;6.SUV|7.越野车|8.挂载车)."),
            name = "车辆类型",
            nullable = false
    )
    Integer type;
    @Property(
            columnDefinition = "varchar(11)",
            comments = @Comment("车主联系方式."),
            name = "车主联系方式",
            length = 11
    )
    String phone;
    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("车主身份证."),
            name = "车主身份证",
            length = 20
    )
    String identityNumber;
    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("车位."),
            name = "车位",
            length = 20
    )
    String carport;
    @Property(
            columnDefinition = "smallint",
            comments = @Comment("车位类型(0.无|1.自用|2.租用)."),
            name = "车位类型",
            nullable = false
    )
    Integer carportType;
    @Property(
            columnDefinition = "boolean NOT NULL DEFAULT false",
            comments = @Comment("是否有出入证件."),
            name = "是否有出入证件"
    )
    Boolean access;
    @Property(
            columnDefinition = "varchar(30)",
            comments = @Comment("出入证件号."),
            name = "出入证件号",
            length = 30
    )
    String accessNumber;

    @Property(
            columnDefinition = "boolean NOT NULL DEFAULT false",
            comments = @Comment("车辆是否在小区内."),
            name = "车辆是否在小区内"
    )
    Boolean inCommunity;
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
            columnDefinition = "smallint NOT NULL DEFAULT 0",
            comments = @Comment("状态(0.未审核|1.审核通过|2.审核未通过)."),
            name = "状态",
            nullable = false
    )
    Integer status;
    @Property(
            columnDefinition = "bigint",
            comments = @Comment("报备人员ID."),
            name = "报备人员ID"
    )
    Long reportUserId;
    @Property(
            columnDefinition = "bigint",
            comments = @Comment("审核人员ID."),
            name = "审核人员ID"
    )
    Long reportCheckUserId;
    @Property(
            columnDefinition = "varchar(200)",
            comments = @Comment("审核备注."),
            name = "审核备注",
            length = 200
    )
    String checkRemark;
    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("品牌."),
            name = "品牌",
            length = 20
    )
    String brand;
}
