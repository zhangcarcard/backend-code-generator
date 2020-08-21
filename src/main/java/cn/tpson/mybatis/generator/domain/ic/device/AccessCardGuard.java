package cn.tpson.mybatis.generator.domain.ic.device;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

@Domain(name = "门禁卡关联关系", comments = @Comment("门禁卡关联关系"))
public class AccessCardGuard {
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
            columnDefinition = "bigint NOT NULL",
            comments = @Comment("门禁卡ID."),
            name = "门禁卡ID",
            nullable = false
    )
    Long cardId;

    @Property(
            columnDefinition = "varchar(20) NOT NULL",
            comments = @Comment("门禁卡号."),
            name = "门禁卡号",
            nullable = false
    )
    Long cardCode;
}
