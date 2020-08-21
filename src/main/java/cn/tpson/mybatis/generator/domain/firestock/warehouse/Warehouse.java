package cn.tpson.mybatis.generator.domain.firestock.warehouse;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

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
            columnDefinition = "smallint unsigned",
            comments = @Comment("库房面积."),
            name = "库房面积"
    )
    Integer whArea;

    @Property(
            columnDefinition = "tinyint unsigned",
            comments = @Comment("库房类型(1:固定/2:流动)."),
            name = "库房类型(1:固定/2:流动)"
    )
    Integer type;

    @Property(
            columnDefinition = "varchar(200)",
            comments = @Comment("负责人信息(姓名1/电话1;姓名2/电话2)."),
            name = "负责人信息(姓名1/电话1;姓名2/电话2)",
            length = 200
    )
    String managerInfo;

    @Property(
            columnDefinition = "varchar(5)",
            comments = @Comment("巡检周期."),
            name = "巡检周期",
            length = 5
    )
    String stocktakingCycle;

    @Property(
            columnDefinition = "bigint unsigned",
            comments = @Comment("最新盘点时间(毫秒)."),
            name = "最新盘点时间(毫秒)"
    )
    Long gmtLatestStocktaking;

    @Property(
            columnDefinition = "bigint unsigned",
            comments = @Comment("下次盘点时间(毫秒)."),
            name = "下次盘点时间(毫秒)"
    )
    Long gmtNextStocktaking;

    @Property(
            columnDefinition = "varchar(200)",
            comments = @Comment("备注."),
            name = "备注",
            length = 50
    )
    String remarks;
}
