package cn.tpson.mybatis.generator.domain.ic.device;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

@Domain(name = "摄像头服务器", comments = @Comment("摄像头服务器"))
public class CameraServer {
    @Property(
            columnDefinition = "bigint NOT NULL",
            comments = @Comment("组织ID."),
            name = "组织ID",
            nullable = false
    )
    Long organizationId;

    @Property(
            columnDefinition = "varchar(20) NOT NULL",
            comments = @Comment("服务器名称."),
            name = "服务器名称",
            length = 20,
            nullable = false
    )
    String name;

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
            comments = @Comment("服务器类型(1:独立设备, 2:NVR, 3:流媒体服务器)."),
            name = "服务器类型",
            nullable = false
    )
    Integer serverType;

    @Property(
            columnDefinition = "varchar(20) NOT NULL",
            comments = @Comment("ip."),
            name = "ip",
            length = 20,
            nullable = false
    )
    String ip;

    @Property(
            columnDefinition = "smallint NOT NULL",
            comments = @Comment("服务器端口."),
            name = "port",
            nullable = false
    )
    Integer port;

    @Property(
            columnDefinition = "varchar(20) NOT NULL",
            comments = @Comment("账号."),
            name = "账号",
            length = 20,
            nullable = false
    )
    String account;

    @Property(
            columnDefinition = "varchar(20) NOT NULL",
            comments = @Comment("账号密码."),
            name = "账号密码",
            length = 20,
            nullable = false
    )
    String password;

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
            columnDefinition = "smallint NOT NULL DEFAULT 0",
            comments = @Comment("状态(0:正常, 1:注销, 2:删除)."),
            name = "状态"
    )
    Integer status;
}
