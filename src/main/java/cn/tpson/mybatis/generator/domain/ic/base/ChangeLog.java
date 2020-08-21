package cn.tpson.mybatis.generator.domain.ic.base;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

/**
 * @author wangJiaHui
 * @date 2020/4/22 9
 */
@Domain(name = "变更记录", comments = @Comment(value = "变更记录"))
public class ChangeLog {

    @Property(
            columnDefinition = "bigint",
            comments = @Comment("小区ID."),
            name = "小区ID",
            nullable = false
    )
    Long communityId;

    @Property(
            columnDefinition = "bigint",
            comments = @Comment("修改记录ID."),
            name = "修改记录ID",
            nullable = false
    )
    Long changeLogId;
    @Property(
            columnDefinition = "smallint",
            comments = @Comment("记录类型(0.车辆记录|1.房屋记录|2.人员记录)."),
            name = "记录类型",
            nullable = false
    )
    Integer type;
    @Property(
            columnDefinition = "boolean NOT NULL DEFAULT true",
            comments = @Comment("是否是添加."),
            name = "是否是添加"
    )
    Boolean add;

}
