package cn.tpson.mybatis.generator.domain.ic.base;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

import java.util.Date;

@Domain(name = "公告收件箱", comments = @Comment(value = "公告收件箱"))
public class NoticeReceiver {
    @Property(
            columnDefinition = "bigint NOT NULL",
            comments = @Comment("公告ID."),
            name = "公告ID",
            nullable = false
    )
    Long noticeId;

    @Property(
            columnDefinition = "boolean NOT NULL DEFAULT false",
            comments = @Comment("是否阅读."),
            name = "是否阅读",
            nullable = false
    )
    Boolean read;

    @Property(
            columnDefinition = "bigint",
            comments = @Comment("阅读时间."),
            name = "阅读时间"
    )
    Date readTime;

    @Property(
            columnDefinition = "bigint NOT NULL",
            comments = @Comment("接收者ID."),
            name = "接收者ID",
            nullable = false
    )
    Long receiverId;

    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("接收者姓名."),
            name = "接收者姓名"
    )
    String receiverName;
}
