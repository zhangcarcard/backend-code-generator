package cn.tpson.mybatis.generator.domain.ic.house;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

/**
 * @author wangJiaHui
 * @date 2020/4/13 16
 */
@Domain(name = "房屋", comments = @Comment(value = "房屋"))
public class House {
    @Property(
            columnDefinition = "bigint",
            comments = @Comment("楼栋ID."),
            name = "楼栋ID",
            nullable = false
    )
    Long buildingId;
    @Property(
            columnDefinition = "bigint",
            comments = @Comment("楼层id."),
            name = "楼层id"
    )
    Long floorId;
    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("房屋名称."),
            name = "房屋名称",
            length = 20,
            nullable = false
    )
    String name;
    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("门牌号."),
            name = "门牌号",
            length = 20,
            nullable = false
    )
    String code;
    @Property(
            columnDefinition = "smallint NOT NULL DEFAULT 0",
            comments = @Comment("户型（几室）."),
            name = "户型（几室）"
    )
    Integer sizeRoom;
    @Property(
            columnDefinition = "smallint NOT NULL DEFAULT 0",
            comments = @Comment("户型（几室）."),
            name = "户型（几厅）"
    )
    Integer sizeLivingRoom;
    @Property(
            columnDefinition = "smallint NOT NULL DEFAULT 0",
            comments = @Comment("户型（几卫）."),
            name = "户型（几卫）"
    )
    Integer sizeToilet;
    @Property(
            columnDefinition = "float8",
            comments = @Comment("面积"),
            name = "面积"
    )
    Double area;
    @Property(
            columnDefinition = "smallint NOT NULL DEFAULT 0",
            comments = @Comment("房屋类型(1.商用|2.居住)."),
            name = "房屋类型"
    )
    Integer type;
    @Property(
            columnDefinition = "smallint NOT NULL DEFAULT 0",
            comments = @Comment("房屋状态(1.自主|2.出租|3.闲置)."),
            name = "房屋状态"
    )
    Integer status;
    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("产权人名称."),
            name = "产权人名称",
            length = 20
    )
    String ower;
    @Property(
            columnDefinition = "varchar(15)",
            comments = @Comment("产权人联系方式."),
            name = "产权人联系方式",
            length = 15
    )
    String owerPhone;
    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("产权人身份证号."),
            name = "产权人身份证号",
            length = 20,
            nullable = false
    )
    String owerNumber;
    @Property(
            columnDefinition = "varchar(30)",
            comments = @Comment("产权证号."),
            name = "产权证号",
            length = 30,
            nullable = false
    )
    String propertyNumber;
    @Property(
            columnDefinition = "varchar(50)",
            comments = @Comment("产权证件附件."),
            name = "产权证件附件",
            length = 50,
            nullable = false
    )
    String propertyFileIds;
    @Property(
            columnDefinition = "varchar(30)",
            comments = @Comment("物业缴费账号."),
            name = "物业缴费账号",
            length = 30,
            nullable = false
    )
    String account;
}
