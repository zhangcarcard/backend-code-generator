package cn.tpson.mybatis.generator.domain.ic.estate;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

import java.util.Date;

/**
 * @author wangJiaHui
 * @date 2020/4/10 14
 */
@Domain(name = "物业物资", comments = @Comment(value = "物业物资"))
public class Device {
    @Property(
            columnDefinition = "bigint",
            comments = @Comment("物资类型ID."),
            name = "物资类型ID",
            nullable = false
    )
    Long deviceTypeId;

    @Property(
            columnDefinition = "bigint",
            comments = @Comment("小区ID."),
            name = "小区ID",
            nullable = false
    )
    Long communityId;

    @Property(
            columnDefinition = "bigint",
            comments = @Comment("楼栋ID."),
            name = "楼栋ID",
            nullable = false
    )
    Long buildingId;

    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("物资编码."),
            name = "物资编码",
            length = 20,
            nullable = false
    )
    String code;

    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("物资名称."),
            name = "物资名称",
            length = 20,
            nullable = false
    )
    String name;

    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("物资型号."),
            name = "物资型号",
            length = 20,
            nullable = false
    )
    String model;

    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("生产厂商."),
            name = "生产厂商",
            length = 20,
            nullable = false
    )
    String manufacturer;

    @Property(
            columnDefinition = "timestamp without time zone",
            comments = @Comment("启用时间."),
            name = "启用时间",
            nullable = false
    )
    Date activeTime;
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
            columnDefinition = "varchar(50)",
            comments = @Comment("具体位置."),
            name = "具体位置",
            length = 50,
            nullable = false
    )
    String position;

    @Property(
            columnDefinition = "boolean NOT NULL DEFAULT true",
            comments = @Comment("进出标志位(true.进|false.出)."),
            name = "进出标志位"
    )
    Boolean markBit;

}
