package cn.tpson.mybatis.generator.domain.logistics.warehouse;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

import java.util.Date;

@Domain(name = "库房管理", comments = @Comment(value = "库房管理"))
public class Warehouse {
    @Property(
            columnDefinition = "varchar(30) NOT NULL",
            comments = @Comment("库房名称."),
            name = "库房名称",
            length = 30,
            nullable = false
    )
    String whName;

    @Property(
            columnDefinition = "varchar(50)",
            comments = @Comment("库房位置."),
            name = "库房位置",
            length = 50
    )
    String whLocation;

    @Property(
            columnDefinition = "int unsigned",
            comments = @Comment("库房面积."),
            name = "库房面积"
    )
    String whArea;

    @Property(
            columnDefinition = "tinyint unsigned",
            comments = @Comment("库房类型(1:固定/2:移动)."),
            name = "库房类型(1:固定/2:移动)"
    )
    Integer type;

    @Property(
            columnDefinition = "json",
            comments = @Comment("负责人信息(JSON数组, 字段:name, tel)."),
            name = "负责人信息(JSON数组, 字段:name, tel)"
    )
    String managerInfo;

    @Property(
            columnDefinition = "varchar(200)",
            comments = @Comment("备注."),
            name = "备注",
            length = 200
    )
    String remarks;

    @Property(
            columnDefinition = "json",
            comments = @Comment("库房区域(JSON串,[A, B])."),
            name = "库房区域(JSON串,[A, B])"
    )
    String regions;

    @Property(
            columnDefinition = "datetime",
            comments = @Comment("盘点时间."),
            name = "盘点时间"
    )
    Date gmtStocktaking;

    @Property(
            columnDefinition = "varchar(40)",
            comments = @Comment("车辆ID(移动库房)."),
            name = "车辆ID(移动库房)",
            length = 40
    )
    String vehicleId;
}
