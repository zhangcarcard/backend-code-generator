package cn.tpson.mybatis.generator.domain.logistics.goods;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

import java.util.Date;

@Domain(name = "物资采购单", comments = @Comment(value = "物资采购单"))
public class GoodsPurchaseOrder {
    @Property(
            columnDefinition = "varchar(30) NOT NULL",
            comments = @Comment("订单号."),
            name = "订单号",
            length = 30,
            nullable = false
    )
    String orderNo;

    @Property(
            columnDefinition = "varchar(20) NOT NULL",
            comments = @Comment("供应商名称."),
            name = "供应商名称",
            length = 20,
            nullable = false
    )
    String supplierName;

    @Property(
            columnDefinition = "int unsigned",
            comments = @Comment("商品总数."),
            name = "商品总数"
    )
    Integer orderQty;

    @Property(
            columnDefinition = "int unsigned",
            comments = @Comment("核验总数."),
            name = "核验总数"
    )
    Integer checkQty;

    @Property(
            columnDefinition = "int unsigned",
            comments = @Comment("标签总数."),
            name = "标签总数"
    )
    Integer barcodeQty;

    @Property(
            columnDefinition = "datetime",
            comments = @Comment("审核时间."),
            name = "审核时间"
    )
    Date gmtCheck;

    @Property(
            columnDefinition = "tinyint",
            comments = @Comment("状态(0,1,2,3,4|待提交,待审核,审核不通过,审核部分通过,审核通过)."),
            name = "状态(0,1,2,3,4|待提交,待审核,审核不通过,审核部分通过,审核通过)"
    )
    Integer status;

    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("录入人姓名."),
            name = "录入人姓名",
            length = 20
    )
    String creatorName;
}
