package cn.tpson.mybatis.generator.domain.ic.device;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

import java.util.Date;

@Domain(name = "门禁开门记录", comments = @Comment("门禁开门记录"))
public class AccessHistory {
    @Property(
            columnDefinition = "bigint NOT NULL",
            comments = @Comment("门禁ID."),
            name = "门禁ID",
            nullable = false
    )
    Long guardId;

    @Property(
            columnDefinition = "bigint NOT NULL",
            comments = @Comment("小区ID."),
            name = "小区ID",
            nullable = false
    )
    Long communityId;

    @Property(
            columnDefinition = "bigint NOT NULL",
            comments = @Comment("门禁卡ID."),
            name = "门禁卡ID",
            nullable = false
    )
    Long cardId;

    @Property(
            columnDefinition = "bigint",
            comments = @Comment("照片ID."),
            name = "照片ID"
    )
    Long photoId;

    @Property(
            columnDefinition = "bigint",
            comments = @Comment("视频文件ID."),
            name = "视频文件ID"
    )
    Long fileId;

    @Property(
            columnDefinition = "bigint",
            comments = @Comment("人员ID."),
            name = "人员ID"
    )
    Long peopleId;

    @Property(
            columnDefinition = "bigint",
            comments = @Comment("系统用户ID."),
            name = "系统用户ID"
    )
    Long userId;

    @Property(
            columnDefinition = "smallint",
            comments = @Comment("系统用户类型(1:管理员, 2:居民)."),
            name = "系统用户类型"
    )
    Integer userType;

    @Property(
            columnDefinition = "smallint",
            comments = @Comment("开门类型(1:门禁卡, 2:密码, 3:远程, 4:其他)."),
            name = "系统用户类型"
    )
    Integer type;

    @Property(
            columnDefinition = "timestamp without time zone",
            comments = @Comment("开门时间."),
            name = "开门时间"
    )
    Date accessTime;
}
