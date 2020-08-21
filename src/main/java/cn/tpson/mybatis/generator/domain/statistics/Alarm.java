package cn.tpson.mybatis.generator.domain.statistics;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

@Domain(name = "报警记录", comments = @Comment(value = "报警记录"))
public class Alarm {
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
            comments = @Comment("设备ID."),
            name = "设备ID",
            nullable = false
    )
    Long deviceId;

    @Property(
            columnDefinition = "bigint NOT NULL",
            comments = @Comment("设备ID."),
            name = "设备ID",
            nullable = false
    )
    Long sensorId;

    @Property(
            columnDefinition = "int",
            comments = @Comment("报警类型."),
            name = "报警类型"
    )
    Integer type;

    @Property(
            columnDefinition = "int",
            comments = @Comment("报警等级(1:低,2:中,3:高)."),
            name = "报警等级(1:低,2:中,3:高)"
    )
    Integer level;

    @Property(
            columnDefinition = "int NOT NULL",
            comments = @Comment("报警次数."),
            name = "报警次数",
            nullable = false
    )
    Integer count;

    @Property(
            columnDefinition = "tinyint NOT NULL",
            comments = @Comment("处理状态(0:待接收,1:待处理,2:真实火警,3:误报,4:消防测试,5:维保检修)."),
            name = "处理状态(处理状态(0:待接收,1:待处理,2:真实火警,3:误报,4:消防测试,5:维保检修)",
            nullable = false
    )
    Integer status;
}
