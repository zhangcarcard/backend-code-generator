package cn.tpson.mybatis.generator.domain.ic.device;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

import java.util.Date;

@Domain(name = "门禁卡管理", comments = @Comment("门禁卡管理"))
public class AccessCard {
    @Property(
            columnDefinition = "varchar(20) NOT NULL",
            comments = @Comment("门禁卡号."),
            name = "门禁卡号",
            nullable = false
    )
    String cardCode;

    @Property(
            columnDefinition = "varchar(20) NOT NULL",
            comments = @Comment("门禁卡编号."),
            name = "门禁卡编号",
            nullable = false
    )
    String cardNumber;

    @Property(
            columnDefinition = "smallint NOT NULL",
            comments = @Comment("门禁卡用途类型."),
            name = "门禁卡用途类型",
            nullable = false
    )
    Integer type;

    @Property(
            columnDefinition = "smallint NOT NULL",
            comments = @Comment("门禁卡介质类型((1/2/3)IC/ID/其他)."),
            name = "门禁卡介质类型",
            nullable = false
    )
    Integer mediaType;

    @Property(
            columnDefinition = "bigint NOT NULL",
            comments = @Comment("人员ID."),
            name = "人员ID",
            nullable = false
    )
    Long peopleId;

    @Property(
            columnDefinition = "bigint NOT NULL",
            comments = @Comment("系统用户ID."),
            name = "系统用户ID",
            nullable = false
    )
    Long userId;

    @Property(
            columnDefinition = "bigint NOT NULL",
            comments = @Comment("小区ID."),
            name = "小区ID",
            nullable = false
    )
    Long communityId;

    @Property(
            columnDefinition = "smallint NOT NULL DEFAULT 1",
            comments = @Comment("状态(1:正常, 2:挂失, 3:失效)."),
            name = "状态",
            nullable = false
    )
    Integer status;

    @Property(
            columnDefinition = "timestamp without time zone",
            comments = @Comment("过期时间."),
            name = "过期时间"
    )
    Date expireTime;

    @Property(
            columnDefinition = "varchar(200)",
            comments = @Comment("门禁列表."),
            name = "门禁列表"
    )
    String devNo;
}
