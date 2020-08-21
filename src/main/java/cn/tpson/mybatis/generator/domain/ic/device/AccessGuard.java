package cn.tpson.mybatis.generator.domain.ic.device;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

@Domain(name = "门禁管理", comments = @Comment(value = "门禁管理"))
public class AccessGuard {
    @Property(
            columnDefinition = "varchar(20) NOT NULL",
            comments = @Comment("门禁访问账户."),
            name = "门禁访问账户",
            length = 20,
            nullable = false
    )
    String account;

    @Property(
            columnDefinition = "varchar(20) NOT NULL",
            comments = @Comment("门禁访问密码."),
            name = "门禁访问密码",
            length = 20,
            nullable = false
    )
    String password;

    @Property(
            columnDefinition = "varchar(20) NOT NULL",
            comments = @Comment("门禁通讯编码."),
            name = "门禁通讯编码",
            length = 20,
            nullable = false
    )
    String code;

    @Property(
            columnDefinition = "varchar(20) NOT NULL",
            comments = @Comment("8位开门密码."),
            name = "8位开门密码",
            length = 8,
            nullable = false
    )
    String doorPass;

    @Property(
            columnDefinition = "varchar(20) NOT NULL",
            comments = @Comment("ip地址."),
            name = "IP地址",
            length = 20,
            nullable = false
    )
    String ip;

    @Property(
            columnDefinition = "integer NOT NULL",
            comments = @Comment("port."),
            name = "port",
            nullable = false
    )
    Integer port;

    @Property(
            columnDefinition = "varchar(20) NOT NULL",
            comments = @Comment("门禁名称."),
            name = "门禁名称",
            length = 20,
            nullable = false
    )
    String name;

    @Property(
            columnDefinition = "smallint NOT NULL",
            comments = @Comment("门禁类型."),
            name = "门禁类型",
            nullable = false
    )
    Integer type;

    @Property(
            columnDefinition = "varchar(200)",
            comments = @Comment("门禁监控ID列表."),
            name = "门禁监控ID列表",
            length = 200
    )
    String monitorIds;

    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("子网掩码."),
            name = "子网掩码",
            length = 20
    )
    String subnetMask;

    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("首选DNS."),
            name = "首选DNS",
            length = 20
    )
    String dns1;

    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("备选DNS."),
            name = "备选DNS",
            length = 20
    )
    String dns2;

    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("软件版本."),
            name = "软件版本",
            length = 20
    )
    String softwareVersion;

    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("固件版本."),
            name = "固件版本",
            length = 20
    )
    String hardwareVersion;

    @Property(
            columnDefinition = "boolean",
            comments = @Comment("是否依附楼栋, 如果是坐标为楼栋坐标, 否为坐标自选."),
            name = "是否依附楼栋"
    )
    Boolean underBuilding;

    @Property(
            columnDefinition = "varchar(200)",
            comments = @Comment("备注."),
            name = "备注",
            length = 200
    )
    String remark;

    @Property(
            columnDefinition = "varchar(100)",
            comments = @Comment("位置信息."),
            name = "位置信息",
            length = 100
    )
    String position;

    @Property(
            columnDefinition = "bigint",
            comments = @Comment("所属楼栋ID."),
            name = "所属楼栋ID"
    )
    Long buildingId;

    @Property(
            columnDefinition = "bigint",
            comments = @Comment("所属小区ID."),
            name = "所属小区ID"
    )
    Long communityId;

    @Property(
            columnDefinition = "smallint",
            comments = @Comment("状态."),
            name = "状态"
    )
    Integer status;

    @Property(
            columnDefinition = "boolean NOT NULL DEFAULT false",
            comments = @Comment("是否打开."),
            name = "是否打开"
    )
    Boolean open;

    @Property(
            columnDefinition = "boolean NOT NULL DEFAULT false",
            comments = @Comment("是否在线."),
            name = "是否在线"
    )
    Boolean online;

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
}
