package cn.tpson.mybatis.generator.domain.logistics.goods;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

@Domain(name = "物资盘点记录", comments = @Comment(value = "物资盘点记录"))
public class GoodsStocktaking {
    @Property(
            columnDefinition = "bigint unsigned NOT NULL",
            comments = @Comment("库房ID."),
            name = "库房ID",
            nullable = false
    )
    Long whId;

    @Property(
            columnDefinition = "varchar(30)",
            comments = @Comment("库房名称."),
            name = "库房名称"
    )
    String whName;

    @Property(
            columnDefinition = "varchar(20) NOT NULL",
            comments = @Comment("盘点名称."),
            name = "盘点名称",
            nullable = false
    )
    String stName;

    @Property(
            columnDefinition = "int unsigned NOT NULL",
            comments = @Comment("统计总数."),
            name = "统计总数",
            nullable = false
    )
    Integer total;

    @Property(
            columnDefinition = "int unsigned NOT NULL",
            comments = @Comment("盘点总数."),
            name = "盘点总数",
            nullable = false
    )
    Integer stTotal;

    @Property(
            columnDefinition = "int unsigned NOT NULL",
            comments = @Comment("异常总数."),
            name = "异常总数",
            nullable = false
    )
    Integer abTotal;

    @Property(
            columnDefinition = "bit(1)",
            comments = @Comment("是否正常."),
            name = "是否正常"
    )
    Boolean ok;

    @Property(
            columnDefinition = "bit(1)",
            comments = @Comment("是否提交."),
            name = "是否提交"
    )
    Boolean submitted;
}
