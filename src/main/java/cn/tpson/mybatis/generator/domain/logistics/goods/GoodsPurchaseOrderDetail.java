package cn.tpson.mybatis.generator.domain.logistics.goods;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

@Domain(name = "物资采购单详情", comments = @Comment(value = "物资采购单详情"))
public class GoodsPurchaseOrderDetail {
    @Property(
            columnDefinition = "varchar(30) NOT NULL",
            comments = @Comment("采购单号."),
            name = "采购单号",
            length = 30,
            nullable = false
    )
    String orderNo;

    @Property(
            columnDefinition = "bigint unsigned NOT NULL",
            comments = @Comment("商品ID."),
            name = "商品ID",
            nullable = false
    )
    Long goodsId;

    @Property(
            columnDefinition = "varchar(30)",
            comments = @Comment("商品名称."),
            name = "商品名称",
            length = 30,
            nullable = false
    )
    String goodsName;

    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("品牌."),
            name = "品牌",
            length = 20,
            nullable = false
    )
    String brand;

    @Property(
            columnDefinition = "bigint unsigned",
            comments = @Comment("库房ID."),
            name = "库房ID"
    )
    Long whId;

    @Property(
            columnDefinition = "bigint unsigned",
            comments = @Comment("库房区域ID."),
            name = "库房区域ID"
    )
    Long whRegionId;

    @Property(
            columnDefinition = "varchar(50)",
            comments = @Comment("rfId."),
            name = "rfId",
            length = 50
    )
    String rfId;

    @Property(
            columnDefinition = "varchar(50)",
            comments = @Comment("nfcId."),
            name = "nfcId",
            length = 50
    )
    String nfcId;

    @Property(
            columnDefinition = "bit(1)",
            comments = @Comment("是否绑定."),
            name = "是否绑定"
    )
    Boolean binding;

    @Property(
            columnDefinition = "bit(1)",
            comments = @Comment("是否验收成功."),
            name = "是否验收成功"
    )
    Boolean success;

    @Property(
            columnDefinition = "varchar(50)",
            comments = @Comment("照片ID列表,逗号隔开."),
            name = "照片ID列表,逗号隔开"
    )
    String photoIds;

    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("生产日期(年/月/日)."),
            name = "生产日期(年/月/日)",
            length = 20
    )
    String mfcDate;
}
