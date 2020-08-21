package cn.tpson.mybatis.generator.domain.ic.device;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

@Domain(name = "门禁心跳记录", comments = @Comment("门禁心跳记录"))
public class AccessHeartHistory {
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
            columnDefinition = "boolean NOT NULL DEFAULT true",
            comments = @Comment("是否在线."),
            name = "是否在线"
    )
    Boolean online;
}
