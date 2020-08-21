package cn.tpson.mybatis.generator.domain.ic.base;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

@Domain(name = "楼栋管理", comments = @Comment(value = "楼栋管理"))
public class Building {
    @Property(
            columnDefinition = "varchar(100) NOT NULL",
            comments = @Comment("楼栋名称."),
            name = "楼栋名称",
            length = 100,
            nullable = false
    )
    String name;

    @Property(
            columnDefinition = "smallint NOT NULL",
            comments = @Comment("楼栋类型."),
            name = "楼栋类型",
            nullable = false
    )
    Integer type;

    @Property(
            columnDefinition = "varchar(20) NOT NULL",
            comments = @Comment("负责人姓名."),
            name = "负责人姓名",
            length = 20,
            nullable = false
    )
    String man;

    @Property(
            columnDefinition = "varchar(20) NOT NULL",
            comments = @Comment("负责人电话."),
            name = "负责人电话",
            length = 20,
            nullable = false
    )
    String phone;

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
            columnDefinition = "bigint NOT NULL",
            comments = @Comment("所属小区ID."),
            name = "所属小区ID",
            nullable = true
    )
    Long communityId;
}
