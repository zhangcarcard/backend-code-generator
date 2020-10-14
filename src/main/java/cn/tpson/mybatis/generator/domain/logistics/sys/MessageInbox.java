package cn.tpson.mybatis.generator.domain.logistics.sys;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

@Domain(name = "消息收件箱", comments = @Comment(value = "消息收件箱"))
public class MessageInbox {
    @Property(
            columnDefinition = "bigint unsigned NOT NULL",
            comments = @Comment("消息ID."),
            name = "消息ID",
            nullable = false
    )
    Long messageId;

    @Property(
            columnDefinition = "varchar(50) NOT NULL",
            comments = @Comment("标题."),
            name = "标题",
            length = 50,
            nullable = false
    )
    String title;

    @Property(
            columnDefinition = "bigint unsigned NOT NULL",
            comments = @Comment("发件人ID."),
            name = "发件人ID",
            nullable = false
    )
    Long senderId;

    @Property(
            columnDefinition = "varchar(20) NOT NULL",
            comments = @Comment("发件人名称."),
            name = "发件人名称",
            nullable = false
    )
    String senderName;

    @Property(
            columnDefinition = "bigint unsigned NOT NULL",
            comments = @Comment("收件人ID."),
            name = "收件人ID",
            nullable = false
    )
    Long receiverId;

    @Property(
            columnDefinition = "varchar(20) NOT NULL",
            comments = @Comment("收件人名称."),
            name = "收件人名称",
            nullable = false
    )
    String receiverName;

    @Property(
            columnDefinition = "bit(1) NOT NULL",
            comments = @Comment("是否已读."),
            name = "是否已读",
            nullable = false
    )
    Boolean read;
}
