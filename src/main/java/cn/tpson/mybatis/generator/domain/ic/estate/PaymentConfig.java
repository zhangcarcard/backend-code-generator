package cn.tpson.mybatis.generator.domain.ic.estate;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

/**
 * @author wangJiaHui
 * @date 2020/4/10 14
 */
@Domain(name = "缴费配置", comments = @Comment(value = "缴费配置"))
public class PaymentConfig {

    @Property(
            columnDefinition = "bigint",
            comments = @Comment("小区ID."),
            name = "小区ID"
    )
    Long communityId;
    @Property(
            columnDefinition = "smallint",
            comments = @Comment("缴费周期(1.按月|2.按季|3.半年|4.年)."),
            name = "缴费周期"
    )
    Integer paymentPeriod;
    @Property(
            columnDefinition = "varchar(4)",
            comments = @Comment("默认缴费日期1-31可以用L表示每月的最后一天."),
            name = "默认缴费日期",
            length = 4
    )
    String payDay;
    @Property(
            columnDefinition = "float8",
            comments = @Comment("商用类型每日费用"),
            name = "商用类型每日费用"
    )
    Double commercialAmount;
    @Property(
            columnDefinition = "varchar(100)",
            comments = @Comment("房屋每日费用按类型."),
            name = "房屋每日费用",
            length = 100
    )
    String houseAmount;
    @Property(
            columnDefinition = "float8",
            comments = @Comment("车位自用类型每日费用"),
            name = "车位自用类型每日费用"
    )
    Double carportSelfAmount;
    @Property(
            columnDefinition = "float8",
            comments = @Comment("车位租用类型每日费用"),
            name = "车位租用类型每日费用"
    )
    Double carportRentAmount;


    @Property(
            columnDefinition = "varchar(50)",
            comments = @Comment("缴费月份."),
            name = "缴费月份",
            length = 10
    )
    String payMonth;
    @Property(
            columnDefinition = "smallint",
            comments = @Comment("预计缴费日期-n天之后缴费."),
            name = "预计缴费日期"
    )
    Integer estimatePayTime;
}
