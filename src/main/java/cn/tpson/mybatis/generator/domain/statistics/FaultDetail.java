package cn.tpson.mybatis.generator.domain.statistics;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

@Domain(name = "故障详情", comments = @Comment(value = "故障详情"))
public class FaultDetail {
    @Property(
            columnDefinition = "bigint",
            comments = @Comment("企业ID."),
            name = "企业ID"
    )
    Long enterpriseId;

    @Property(
            columnDefinition = "bigint",
            comments = @Comment("会员ID."),
            name = "会员ID"
    )
    Long memberId;

    @Property(
            columnDefinition = "bigint",
            comments = @Comment("部门ID."),
            name = "部门ID"
    )
    Long departmentId;

    @Property(
            columnDefinition = "bigint NOT NULL",
            comments = @Comment("故障ID."),
            name = "故障ID"
    )
    Long alarmId;

    @Property(
            columnDefinition = "varchar(50)",
            comments = @Comment("设备编号."),
            name = "设备编号",
            length = 50
    )
    String deviceCode;

    @Property(
            columnDefinition = "varchar(50)",
            comments = @Comment("传感器名称."),
            name = "传感器名称",
            length = 50
    )
    String sensorName;

    @Property(
            columnDefinition = "bigint",
            comments = @Comment("行政区划ID."),
            name = "行政区划ID"
    )
    Long geographicId;

    @Property(
            columnDefinition = "varchar(100)",
            comments = @Comment("行政区划名称."),
            name = "行政区划名称",
            length = 100
    )
    String geographicName;

    @Property(
            columnDefinition = "varchar(100)",
            comments = @Comment("'详细位置信息'."),
            name = "'详细位置信息'",
            length = 100
    )
    String position;

    @Property(
            columnDefinition = "bigint",
            comments = @Comment("楼层ID."),
            name = "楼层ID"
    )
    Long floorId;

    @Property(
            columnDefinition = "varchar(50)",
            comments = @Comment("楼层名称(楼栋名称+楼层名称)."),
            name = "楼层名称(楼栋名称+楼层名称)",
            length = 50
    )
    String floorName;

    @Property(
            columnDefinition = "varchar(100)",
            comments = @Comment("监测点名称."),
            name = "监测点名称",
            length = 100
    )
    String siteName;

    @Property(
            columnDefinition = "text",
            comments = @Comment("故障详情."),
            name = "故障详情"
    )
    String detail;
}
