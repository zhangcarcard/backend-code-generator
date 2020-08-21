package cn.tpson.mybatis.generator.domain.ic.base;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

@Domain(name = "公告", comments = @Comment(value = "公告"))
public class Notice {
    @Property(
            columnDefinition = "varchar(50) NOT NULL",
            comments = @Comment("'标题'."),
            name = "区域代码",
            length = 50,
            nullable = false
    )
    String title;

    @Property(
            columnDefinition = "varchar(200) NOT NULL",
            comments = @Comment("内容."),
            name = "内容",
            length = 200,
            nullable = false
    )
    String content;

    @Property(
            columnDefinition = "varchar(500) NOT NULL",
            comments = @Comment("接收者ID列表."),
            name = "接收者ID列表",
            length = 500,
            nullable = false
    )
    String receiverIds;

    @Property(
            columnDefinition = "smallint NOT NULL",
            comments = @Comment("公告等级(1低,2中,3高)."),
            name = "公告等级",
            nullable = false
    )
    Integer level;

    @Property(
            columnDefinition = "boolean NOT NULL",
            comments = @Comment("是否全部."),
            name = "是否全部",
            nullable = false
    )
    Boolean all;

    @Property(
            columnDefinition = "smallint NOT NULL",
            comments = @Comment("目标对象(1：内部人员，2：下一级部门，3：小区公告)."),
            name = "目标对象",
            nullable = false
    )
    Integer targetType;

    @Property(
            columnDefinition = "varchar(500) NOT NULL",
            comments = @Comment("附件ID列表."),
            name = "附件ID列表",
            length = 500,
            nullable = false
    )
    String fileIds;

    @Property(
            columnDefinition = "bigint",
            comments = @Comment("发布组织ID."),
            name = "发布组织ID"
    )
    Long orgId;

    @Property(
            columnDefinition = "integer",
            comments = @Comment("发布组织类型."),
            name = "发布告组织类型"
    )
    Integer orgType;

    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("发布组织名称."),
            name = "发布组织名称"
    )
    String orgName;

    @Property(
            columnDefinition = "bigint",
            comments = @Comment("发布人ID."),
            name = "发布人ID"
    )
    Long userId;

    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("发布人姓名."),
            name = "发布人姓名"
    )
    String username;

}
