package cn.tpson.mybatis.generator.domain.logistics.goods;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

import java.util.List;

@Domain(name = "物资盘点标签列表", comments = @Comment(value = "物资盘点标签列表"))
public class GoodsStocktakingDetailTags {
    @Property(
            columnDefinition = "bigint unsigned NOT NULL",
            comments = @Comment("盘点记录ID."),
            name = "盘点记录ID",
            nullable = false
    )
    Long stId;

    @Property(
            columnDefinition = "bigint unsigned NOT NULL",
            comments = @Comment("盘点明细ID."),
            name = "盘点明细ID",
            nullable = false
    )
    Long stDetailId;

    @Property(
            columnDefinition = "json",
            comments = @Comment("盘点RFID列表."),
            name = "盘点RFID列表"
    )
    List<String> stList;

    @Property(
            columnDefinition = "json",
            comments = @Comment("异常RFID列表."),
            name = "异常RFID列表"
    )
    List<String> abList;
}
