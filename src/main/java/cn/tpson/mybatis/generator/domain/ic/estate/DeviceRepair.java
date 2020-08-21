package cn.tpson.mybatis.generator.domain.ic.estate;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

import java.util.Date;

/**
 * @author wangJiaHui
 * @date 2020/4/10 14
 */
@Domain(name = "物资维修", comments = @Comment(value = "物资维修"))
public class DeviceRepair {
    @Property(
            columnDefinition = "bigint",
            comments = @Comment("小区ID."),
            name = "小区ID",
            nullable = false
    )
    Long communityId;
    @Property(
            columnDefinition = "bigint",
            comments = @Comment("物资ID."),
            name = "物资ID",
            nullable = false
    )
    Long deviceId;
    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("设备名称."),
            name = "设备名称",
            length = 20,
            nullable = false
    )
    String deviceName;
    @Property(
            columnDefinition = "bigint",
            comments = @Comment("物资类型ID."),
            name = "物资类型ID",
            nullable = false
    )
    Long deviceTypeId;

    @Property(
            columnDefinition = "bigint",
            comments = @Comment("楼层id."),
            name = "楼层id"
    )
    Long floorId;

    @Property(
            columnDefinition = "varchar(500)",
            comments = @Comment("问题内容."),
            name = "问题内容",
            length = 500,
            nullable = false
    )
    String content;
    @Property(
            columnDefinition = "bigint",
            comments = @Comment("问题设备照片."),
            name = "问题设备照片",
            nullable = false
    )
    Long photoId;

    @Property(
            columnDefinition = "bigint",
            comments = @Comment("提交人员id."),
            name = "提交人员id"
    )
    Long submitManId;

    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("提交人员."),
            name = "提交人员",
            length = 20
    )
    String submitMan;

    @Property(
            columnDefinition = "boolean NOT NULL DEFAULT true",
            comments = @Comment("提交状态(true.公开|false.匿名)."),
            name = "提交状态"
    )
    Boolean submitStatus;
    @Property(
            columnDefinition = "varchar(11)",
            comments = @Comment("提交人员电话."),
            name = "提交人员电话"
    )
    String submitManPhone;
    @Property(
            columnDefinition = "timestamp without time zone",
            comments = @Comment("提交时间."),
            name = "提交时间"
    )
    Date submitTime;
    @Property(
            columnDefinition = "varchar(50)",
            comments = @Comment("提交地址."),
            name = "提交地址"
    )
    String submitAddress;
    @Property(
            columnDefinition = "bigint",
            comments = @Comment("处理人员id."),
            name = "处理人员id",
            nullable = false
    )
    Long dealManId;

    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("处理人员."),
            name = "处理人员"
    )
    String dealMan;
    @Property(
            columnDefinition = "varchar(11)",
            comments = @Comment("处理人员电话."),
            name = "处理人员电话"
    )
    String dealManPhone;
    @Property(
            columnDefinition = "varchar(500)",
            comments = @Comment("处理备注."),
            name = "处理备注"
    )
    String dealContent;
    @Property(
            columnDefinition = "bigint",
            comments = @Comment("处理后图片."),
            name = "处理后图片"
    )
    Long dealPhotoId;

    @Property(
            columnDefinition = "timestamp without time zone",
            comments = @Comment("处理时间."),
            name = "处理时间"
    )
    Date dealTime;

    @Property(
            columnDefinition = "varchar(50)",
            comments = @Comment("设备具体位置."),
            name = "设备具体位置",
            nullable = false
    )
    String position;

    @Property(
            columnDefinition = "smallint NOT NULL DEFAULT 0",
            comments = @Comment("状态(0.未处理|1.已处理)."),
            name = "状态",
            nullable = false
    )
    Integer status;


}
