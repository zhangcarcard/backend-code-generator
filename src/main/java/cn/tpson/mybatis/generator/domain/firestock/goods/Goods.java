package cn.tpson.mybatis.generator.domain.firestock.goods;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

@Domain(name = "物品管理", comments = @Comment(value = "物品管理"))
public class Goods {
    @Property(
            columnDefinition = "varchar(30) NOT NULL",
            comments = @Comment("物品名称."),
            name = "物品名称",
            length = 30,
            nullable = false
    )
    String goodsName;

    @Property(
            columnDefinition = "varchar(20) NOT NULL",
            comments = @Comment("物品条码."),
            name = "物品条码",
            length = 20,
            nullable = false
    )
    String barcode;

    @Property(
            columnDefinition = "varchar(30)",
            comments = @Comment("厂商名称."),
            name = "厂商名称",
            length = 30
    )
    String vendorName;

    @Property(
            columnDefinition = "char(1)",
            comments = @Comment("单位名称."),
            name = "单位名称",
            length = 1
    )
    String units;

    @Property(
            columnDefinition = "tinyint unsigned ",
            comments = @Comment("物品类别."),
            name = "物品类别"
    )
    Integer goodsType;

    @Property(
            columnDefinition = "tinyint unsigned ",
            comments = @Comment("预警天数."),
            name = "预警天数"
    )
    Integer alarmDays;

    @Property(
            columnDefinition = "smallint unsigned ",
            comments = @Comment("低限数量."),
            name = "低限数量"
    )
    Integer lowLimitAmount;

    @Property(
            columnDefinition = "varchar(200)",
            comments = @Comment("检查项目(项目1/项目2/项目3,用'/'隔开)."),
            name = "检查项目(项目1/项目2/项目3,用/隔开)",
            length = 200
    )
    String checkItems;
}
