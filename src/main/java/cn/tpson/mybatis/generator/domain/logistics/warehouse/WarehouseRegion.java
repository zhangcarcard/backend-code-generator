package cn.tpson.mybatis.generator.domain.logistics.warehouse;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

import java.util.Date;

@Domain(name = "库房分区", comments = @Comment(value = "库房分区"))
public class WarehouseRegion {
    @Property(
            columnDefinition = "bigint unsigned NOT NULL",
            comments = @Comment("库房ID."),
            name = "库房ID",
            nullable = false
    )
    Long whId;

    @Property(
            columnDefinition = "varchar(30) NOT NULL",
            comments = @Comment("分区名称."),
            name = "分区名称",
            length = 30,
            nullable = false
    )
    String regionName;

    @Property(
            columnDefinition = "varchar(200)",
            comments = @Comment("备注."),
            name = "备注",
            length = 200
    )
    String remarks;
}
