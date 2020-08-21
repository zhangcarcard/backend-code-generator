package cn.tpson.mybatis.generator.domain.ic.device;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

@Domain(name = "摄像头信息", comments = @Comment("摄像头信息"))
public class Camera {
    @Property(
            columnDefinition = "bigint NOT NULL",
            comments = @Comment("组织ID."),
            name = "组织ID",
            nullable = false
    )
    Long organizationId;

    @Property(
            columnDefinition = "bigint NOT NULL",
            comments = @Comment("服务器ID."),
            name = "服务器ID",
            nullable = false
    )
    Long cameraServerId;

    @Property(
            columnDefinition = "varchar(20) NOT NULL",
            comments = @Comment("摄像头名称."),
            name = "摄像头名称",
            length = 20,
            nullable = false
    )
    String name;

    @Property(
            columnDefinition = "varchar(20) NOT NULL",
            comments = @Comment("通道号."),
            name = "摄像头名称",
            length = 20,
            nullable = false
    )
    String channel;

    @Property(
            columnDefinition = "bigint NOT NULL",
            comments = @Comment("楼栋ID."),
            name = "楼栋ID",
            nullable = false
    )
    Long buildingId;

    @Property(
            columnDefinition = "bigint NOT NULL",
            comments = @Comment("楼层ID."),
            name = "楼层ID",
            nullable = false
    )
    Long floorId;

    @Property(
            columnDefinition = "integer NOT NULL",
            comments = @Comment("摄像头类型(0:直播, 1:非直播)."),
            name = "摄像头类型",
            nullable = false
    )
    Integer cameraType;

    @Property(
            columnDefinition = "integer NOT NULL",
            comments = @Comment("厂商类型."),
            name = "厂商类型",
            nullable = false
    )
    Integer mfType;

    @Property(
            columnDefinition = "varchar(500)",
            comments = @Comment("摄像头直播URL."),
            name = "摄像头直播URL",
            length = 500
    )
    String url;

    @Property(
            columnDefinition = "varchar(10)",
            comments = @Comment("经度(pos_x)."),
            name = "经度",
            length = 10
    )
    String lng;

    @Property(
            columnDefinition = "varchar(10)",
            comments = @Comment("纬度(pos_y)."),
            name = "纬度",
            length = 10
    )
    String lat;

    @Property(
            columnDefinition = "boolean",
            comments = @Comment("是否在线."),
            name = "是否在线"
    )
    Boolean online;

    @Property(
            columnDefinition = "smallint NOT NULL DEFAULT 0",
            comments = @Comment("状态(0:正常, 1:注销, 2:删除)."),
            name = "状态"
    )
    Integer status;

    @Property(
            columnDefinition = "integer NOT NULL",
            comments = @Comment("服务器类型(1:独立设备, 2:NVR, 3:流媒体服务器)."),
            name = "服务器类型",
            nullable = false
    )
    Integer serverType;
}
