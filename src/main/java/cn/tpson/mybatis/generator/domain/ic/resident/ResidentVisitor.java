package cn.tpson.mybatis.generator.domain.ic.resident;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

import java.util.Date;

@Domain(name = "住户访客", comments = @Comment(value = "住户访客"))
public class ResidentVisitor {
    @Property(
            columnDefinition = "bigint NOT NULL",
            comments = @Comment("小区ID."),
            name = "小区ID",
            nullable = false
    )
    Long communityId;

    @Property(
            columnDefinition = "varchar(20) NOT NULL",
            comments = @Comment("拜访人姓名."),
            name = "拜访人姓名",
            length = 20,
            nullable = false
    )
    String visitPeopleName;

    @Property(
            columnDefinition = "varchar(20) NOT NULL",
            comments = @Comment("拜访人电话."),
            name = "拜访人电话",
            length = 20,
            nullable = false
    )
    String visitPeoplePhone;

    @Property(
            columnDefinition = "smallint NOT NULL",
            comments = @Comment("拜访人数."),
            name = "拜访人数",
            nullable = false
    )
    Integer visitNumber;

    @Property(
            columnDefinition = "varchar(20) NOT NULL",
            comments = @Comment("主人姓名."),
            name = "主人姓名",
            length = 20,
            nullable = false
    )
    String name;

    @Property(
            columnDefinition = "varchar(20) NOT NULL",
            comments = @Comment("主人电话."),
            name = "主人电话",
            length = 20,
            nullable = false
    )
    String phone;

    @Property(
            columnDefinition = "bigint NOT NULL",
            comments = @Comment("照片ID."),
            name = "照片ID",
            nullable = false
    )
    Long photoId;

    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("证件号码."),
            name = "证件号码",
            length = 20
    )
    String identityNumber;

    @Property(
            columnDefinition = "varchar(200)",
            comments = @Comment("来访理由."),
            name = "来访理由",
            length = 200
    )
    String visitReason;

    @Property(
            columnDefinition = "bigint",
            comments = @Comment("访客ID."),
            name = "访客ID"
    )
    Long visitPeopleId;

    @Property(
            columnDefinition = "boolean",
            comments = @Comment("是否允许进入."),
            name = "是否允许进入"
    )
    Boolean allowedIn;

    @Property(
            columnDefinition = "timestamp without time zone",
            comments = @Comment("进入时间."),
            name = "进入时间"
    )
    Date inTime;

    @Property(
            columnDefinition = "timestamp without time zone",
            comments = @Comment("出去时间."),
            name = "出去时间"
    )
    Date outTime;

    @Property(
            columnDefinition = "bigint",
            comments = @Comment("门禁ID."),
            name = "门禁ID"
    )
    Long accessGuardId;
}
