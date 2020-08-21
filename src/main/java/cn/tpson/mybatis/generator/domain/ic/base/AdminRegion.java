package cn.tpson.mybatis.generator.domain.ic.base;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

@Domain(name = "行政区划", comments = @Comment(value = "行政区划"))
public class AdminRegion {
    @Property(
            columnDefinition = "varchar(50) NOT NULL",
            comments = @Comment("区划名称."),
            name = "区划名称",
            length = 50,
            nullable = false
    )
    String name;

    @Property(
            columnDefinition = "bigint NOT NULL",
            comments = @Comment("父区划ID."),
            name = "父区划ID",
            nullable = false
    )
    Long pid;

    @Property(
            columnDefinition = "varchar(10) NOT NULL",
            comments = @Comment("编号."),
            name = "编号",
            length = 10,
            nullable = false
    )
    String code;

    @Property(
            columnDefinition = "varchar(20) NOT NULL",
            comments = @Comment("联系人."),
            name = "联系人",
            length = 20,
            nullable = false
    )
    String man;

    @Property(
            columnDefinition = "varchar(20) NOT NULL",
            comments = @Comment("联系方式."),
            name = "联系方式",
            length = 20,
            nullable = false
    )
    String phone;

    @Property(
            columnDefinition = "smallint",
            comments = @Comment("等级(1,省;2,市;3.区;4.路;5.街道门牌号.)"),
            name = "等级"
    )
    Integer level;

    @Property(
            columnDefinition = "varchar(200)",
            comments = @Comment("社区列表."),
            name = "社区列表",
            length = 200
    )
    String communityIds;

    @Property(
            columnDefinition = "boolean NOT NULL DEFAULT false",
            comments = @Comment("是否末级."),
            name = "是否末级",
            nullable = false
    )
    Boolean last;

    @Property(
            columnDefinition = "bigint",
            comments = @Comment("LOGO文件ID."),
            name = "LOGO ID"
    )
    Long logoId;
}
