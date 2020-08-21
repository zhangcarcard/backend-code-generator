package cn.tpson.mybatis.generator.domain.ic.base;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

@Domain(name = "楼层管理", comments = @Comment(value = "楼层管理"))
public class Floor {
    @Property(
            columnDefinition = "bigint NOT NULL",
            comments = @Comment("所属楼栋ID."),
            name = "所属楼栋ID",
            nullable = false
    )
    Long buildingId;

    @Property(
            columnDefinition = "bigint NOT NULL",
            comments = @Comment("所属小区ID."),
            name = "所属小区ID",
            nullable = false
    )
    Long communityId;

    @Property(
            columnDefinition = "varchar(20) NOT NULL",
            comments = @Comment("楼层名称."),
            name = "楼层名称",
            length = 20,
            nullable = false
    )
    String name;

    @Property(
            columnDefinition = "varchar(10)",
            comments = @Comment("经度(pos_x)."),
            name = "经度",
            length = 10,
            nullable = false
    )
    String lng;

    @Property(
            columnDefinition = "varchar(10)",
            comments = @Comment("纬度(pos_y)."),
            name = "纬度",
            length = 10,
            nullable = false
    )
    String lat;

    @Property(
            columnDefinition = "bigint",
            comments = @Comment("图片ID."),
            name = "图片ID"
    )
    Long photoId;

    @Property(
            columnDefinition = "smallint",
            comments = @Comment("排序号."),
            name = "排序号"
    )
    Integer sort;
}
