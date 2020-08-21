package cn.tpson.mybatis.generator.domain.ic.house;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

import java.util.Date;

/**
 * @author wangJiaHui
 * @date 2020/4/13 17
 */
@Domain(name = "房屋租用", comments = @Comment(value = "房屋租用"))
public class HouseRent {
    @Property(
            columnDefinition = "bigint",
            comments = @Comment("房屋ID."),
            name = "房屋ID"
    )
    Long houseId;
    @Property(
            columnDefinition = "bigint",
            comments = @Comment("人员ID."),
            name = "人员ID"
    )
    Long peopleId;
    @Property(
            columnDefinition = "bigint",
            comments = @Comment("文件ID."),
            name = "文件ID"
    )
    Long fileId;
    @Property(
            columnDefinition = "bigint",
            comments = @Comment("小区ID."),
            name = "小区ID",
            nullable = false
    )
    Long communityId;
    @Property(
            columnDefinition = "timestamp without time zone",
            comments = @Comment("租用开始时间."),
            name = "租用开始时间"
    )
    Date rentStartTime;
    @Property(
            columnDefinition = "timestamp without time zone",
            comments = @Comment("租用结束时间."),
            name = "租用结束时间"
    )
    Date rentEndTime;
}
