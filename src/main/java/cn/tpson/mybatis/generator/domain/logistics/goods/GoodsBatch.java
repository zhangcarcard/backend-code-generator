package cn.tpson.mybatis.generator.domain.logistics.goods;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

import java.math.BigDecimal;

@Domain(name = "商品批次", comments = @Comment(value = "商品批次"))
public class GoodsBatch {
    @Property(
            columnDefinition = "varchar(20) NOT NULL",
            comments = @Comment("供应商名称."),
            name = "供应商名称",
            length = 20,
            nullable = false
    )
    Long goodsId;

    @Property(
            columnDefinition = "varchar(20) NOT NULL",
            comments = @Comment("批次号."),
            name = "批次号",
            length = 20,
            nullable = false
    )
    String batchNo;

    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("生产日期(年/月/日),manufactureDate."),
            name = "生产日期(年/月/日)",
            length = 20
    )
    String mfcDate;

}
