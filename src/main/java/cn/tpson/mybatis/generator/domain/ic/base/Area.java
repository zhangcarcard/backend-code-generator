package cn.tpson.mybatis.generator.domain.ic.base;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

@Domain(name = "行政区划", comments = @Comment(value = "行政区划"))
public class Area {
    @Property(
            columnDefinition = "varchar(10)",
            comments = @Comment("区域代码."),
            name = "区域代码",
            length = 10
    )
    String areaCode;

    @Property(
            columnDefinition = "varchar(50)",
            comments = @Comment("区域名称."),
            name = "区域名称",
            length = 50
    )
    String areaName;

    @Property(
            columnDefinition = "varchar(10)",
            comments = @Comment("父区域代码."),
            name = "父区域代码",
            length = 10
    )
    String parentCode;

    @Property(
            columnDefinition = "smallint",
            comments = @Comment("层级."),
            name = "层级"
    )
    Integer level;

    @Property(
            columnDefinition = "varchar(200)",
            comments = @Comment("区域全名."),
            name = "区域全名",
            length = 200
    )
    String fullName;

    @Property(
            columnDefinition = "varchar(10)",
            comments = @Comment("经度."),
            name = "经度",
            length = 10
    )
    String lng;

    @Property(
            columnDefinition = "varchar(10)",
            comments = @Comment("纬度."),
            name = "纬度",
            length = 10
    )
    String lat;
}
