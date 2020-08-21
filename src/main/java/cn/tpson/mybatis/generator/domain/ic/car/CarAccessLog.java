package cn.tpson.mybatis.generator.domain.ic.car;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

import java.util.Date;

/**
 * @author wangJiaHui
 * @date 2020/4/13 11
 */
@Domain(name = "车辆管理", comments = @Comment(value = "车辆管理"))
public class CarAccessLog {

    @Property(
            columnDefinition = "bigint",
            comments = @Comment("小区ID."),
            name = "小区ID",
            nullable = false
    )
    Long communityId;
    @Property(
            columnDefinition = "varchar(10)",
            comments = @Comment("车牌号."),
            name = "车牌号",
            length = 10,
            nullable = false
    )
    String number;
    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("通过的闸机名称."),
            name = "通过的闸机名称",
            length = 20
    )
    String accessGateName;
    @Property(
            columnDefinition = "timestamp without time zone",
            comments = @Comment("通过闸机的时间."),
            name = "通过闸机的时间"
    )
    Date accessTime;
    @Property(
            columnDefinition = "boolean NOT NULL DEFAULT true",
            comments = @Comment("进出标志位(true.进|false.出)."),
            name = "进出标志位"
    )
    Boolean markBit;
    @Property(
            columnDefinition = "bigint",
            comments = @Comment("照片ID."),
            name = "照片ID",
            nullable = false
    )
    Long photoId;
    @Property(
            columnDefinition = "boolean NOT NULL DEFAULT true",
            comments = @Comment("是否已录入."),
            name = "是否已录入"
    )
    Boolean recorded;
    @Property(
            columnDefinition = "bigint",
            comments = @Comment("车辆id."),
            name = "车辆id"
    )
    Long carId;
    @Property(
            columnDefinition = "bigint",
            comments = @Comment("设备id."),
            name = "设备id"
    )
    Long deviceId;
}
