package cn.tpson.mybatis.generator.domain.ic.device;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

import java.util.Date;

@Domain(name = "门禁开门密码", comments = @Comment("门禁开门密码"))
public class AccessGuardPass {
    @Property(
            columnDefinition = "bigint NOT NULL",
            comments = @Comment("所属小区ID."),
            name = "所属小区ID",
            nullable = false
    )
    Long communityId;

    @Property(
            columnDefinition = "bigint NOT NULL",
            comments = @Comment("人员ID."),
            name = "人员ID",
            nullable = false
    )
    Long peopleId;

    @Property(
            columnDefinition = "bigint NOT NULL",
            comments = @Comment("门禁ID."),
            name = "门禁ID",
            nullable = false
    )
    Long guardId;

    @Property(
            columnDefinition = "varchar(20) NOT NULL",
            comments = @Comment("开门密码."),
            name = "开门密码",
            nullable = false
    )
    String password;

    @Property(
            columnDefinition = "timestamp without time zone",
            comments = @Comment("过期时间."),
            name = "过期时间"
    )
    Date expireTime;

    @Property(
            columnDefinition = "smallint NOT NULL DEFAULT 1",
            comments = @Comment("状态(1:正常, 2:失效)."),
            name = "状态"
    )
    Integer status;
}
