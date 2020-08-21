package cn.tpson.mybatis.generator.domain.statistics;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

@Domain(name = "故障处理记录", comments = @Comment(value = "故障处理记录"))
public class FaultProcess {
    @Property(
            columnDefinition = "bigint NOT NULL",
            comments = @Comment("故障ID."),
            name = "故障ID",
            nullable = false
    )
    Long alarmId;

    @Property(
            columnDefinition = "varchar(100)",
            comments = @Comment("处理备注."),
            name = "处理备注"
    )
    String dealDetail;

    @Property(
            columnDefinition = "bigint",
            comments = @Comment("处理人ID."),
            name = "处理人ID"
    )
    Long dealUserId;

    @Property(
            columnDefinition = "varchar(100)",
            comments = @Comment("图片ID列表,用逗号隔开."),
            name = "图片ID列表,用逗号隔开"
    )
    String dealPhoto;
}
