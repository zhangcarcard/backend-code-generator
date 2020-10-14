package cn.tpson.mybatis.generator.domain.logistics.goods;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

import java.math.BigDecimal;

@Domain(name = "物资库", comments = @Comment(value = "物资库"))
public class Goods {
    /*订单编号、供应商、品牌、商品编号、名称、规格型号、计数单位、数量、重量、尺寸、进口/国产、价格、生产厂家、生产日期(年/月/日)、
    有效使用期限(*年)、建议保养周期(*月)、售后单位、售后服务电话、其他*/
    @Property(
            columnDefinition = "varchar(20) NOT NULL",
            comments = @Comment("供应商名称."),
            name = "供应商名称",
            length = 20,
            nullable = false
    )
    String supplierName;

    @Property(
            columnDefinition = "varchar(20) NOT NULL",
            comments = @Comment("品牌."),
            name = "品牌",
            length = 20,
            nullable = false
    )
    String brand;

    @Property(
            columnDefinition = "varchar(30)",
            comments = @Comment("商品编号."),
            name = "商品编号",
            length = 30
    )
    String goodsNo;

    @Property(
            columnDefinition = "varchar(30) NOT NULL",
            comments = @Comment("商品名称."),
            name = "商品名称",
            length = 30,
            nullable = false
    )
    String goodsName;

    @Property(
            columnDefinition = "varchar(30) NOT NULL",
            comments = @Comment("规格型号."),
            name = "规格型号",
            length = 30,
            nullable = false
    )
    String specModel;

    @Property(
            columnDefinition = "varchar(5) NOT NULL",
            comments = @Comment("计数单位."),
            name = "计数单位",
            length = 5,
            nullable = false
    )
    String unit;

    @Property(
            columnDefinition = "decimal(10,4) unsigned",
            comments = @Comment("重量(千克)."),
            name = "(千克)"
    )
    BigDecimal weight;

    @Property(
            columnDefinition = "varchar(30)",
            comments = @Comment("尺寸."),
            name = "尺寸",
            length = 30
    )
    String size;

    @Property(
            columnDefinition = "varchar(5)",
            comments = @Comment("进口/国产."),
            name = "进口/国产",
            length = 5
    )
    String im;

    @Property(
            columnDefinition = "decimal(12,2) unsigned",
            comments = @Comment("价格."),
            name = "价格"
    )
    BigDecimal price;

    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("生产厂家,manufacturerName."),
            name = "生产厂家",
            length = 20
    )
    String mfcName;

    @Property(
            columnDefinition = "tinyint unsigned",
            comments = @Comment("有效期限(年),validityPeriod."),
            name = "有效期限(年)"
    )
    Integer vtyPeriod;

    @Property(
            columnDefinition = "tinyint unsigned",
            comments = @Comment("建议保养周期(月),maintenancePeriod."),
            name = "建议保养周期(月)"
    )
    Integer matPeriod;

    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("售后单位.afterSalesName"),
            name = "售后单位",
            length = 20
    )
    String afsName;

    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("售后单位电话.afterSalesTel"),
            name = "售后单位电话",
            length = 20
    )
    String afsTel;

    @Property(
            columnDefinition = "json",
            comments = @Comment("其他项(JSON, 字段:k,v)."),
            name = "其他项"
    )
    String items;

    @Property(
            columnDefinition = "bigint unsigned",
            comments = @Comment("分类ID."),
            name = "分类ID"
    )
    Long cryId;

    @Property(
            columnDefinition = "varchar(30)",
            comments = @Comment("分类名称."),
            name = "分类名称",
            length = 30
    )
    String cryName;

    @Property(
            columnDefinition = "int unsigned",
            comments = @Comment("预警天数"),
            name = "预警天数"
    )
    Integer alarmDays;

    @Property(
            columnDefinition = "int unsigned",
            comments = @Comment("低限数量"),
            name = "低限数量"
    )
    Integer limitQty;
}
