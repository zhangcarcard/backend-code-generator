package cn.tpson.mybatis.generator.domain.logistics.goods;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

import java.util.Date;

@Domain(name = "出库工单", comments = @Comment(value = "出库工单"))
public class GoodsStockInOrder {
    @Property(
            columnDefinition = "bigint unsigned NOT NULL",
            comments = @Comment("入库库房ID."),
            name = "入库库房ID",
            nullable = false
    )
    Long whId;

    @Property(
            columnDefinition = "bigint unsigned",
            comments = @Comment("库房分区ID."),
            name = "库房分区ID"
    )
    Long whRegionId;

    @Property(
            columnDefinition = "int unsigned",
            comments = @Comment("入库数量."),
            name = "入库数量"
    )
    Integer qty;

    @Property(
            columnDefinition = "tinyint unsigned",
            comments = @Comment("入库方式(1,2,3|归还,验收,调拨)."),
            name = "入库方式(1,2,3|归还,验收,调拨)."
    )
    Integer type;

    @Property(
            columnDefinition = "bigint unsigned",
            comments = @Comment("负责人ID."),
            name = "负责人ID"
    )
    Long managerId;

    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("负责人姓名."),
            name = "负责人姓名"
    )
    String managerName;
}
