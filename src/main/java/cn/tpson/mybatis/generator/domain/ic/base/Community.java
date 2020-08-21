package cn.tpson.mybatis.generator.domain.ic.base;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

@Domain(name = "小区详情", comments = @Comment(value = "小区详情"))
public class Community {

    @Property(
            columnDefinition = "bigint NOT NULL",
            comments = @Comment("行政区划ID(administrationId)."),
            name = "行政区划ID",
            nullable = false
    )
    Long adminRegionId;

    @Property(
            columnDefinition = "bigint NOT NULL",
            comments = @Comment("物业单位ID."),
            name = "物业单位ID",
            nullable = false
    )
    Long tenementId;

    @Property(
            columnDefinition = "bigint NOT NULL",
            comments = @Comment("公安区划ID(policeId)."),
            name = "公安区划ID",
            nullable = false
    )
    Long policeRegionId;

    @Property(
            columnDefinition = "smallint NOT NULL",
            comments = @Comment("小区类型:1混合式,2开放式,3封闭式."),
            name = "小区类型",
            nullable = false
    )
    Integer communityType;

    @Property(
            columnDefinition = "varchar(50) NOT NULL",
            comments = @Comment("小区名称."),
            name = "小区名称",
            length = 50,
            nullable = false
    )
    String name;

    @Property(
            columnDefinition = "varchar(10) NOT NULL",
            comments = @Comment("小区编号."),
            name = "小区编号",
            length = 10,
            nullable = false
    )
    String code;

    @Property(
            columnDefinition = "varchar(10) NOT NULL",
            comments = @Comment("小区地址."),
            name = "小区地址",
            length = 10,
            nullable = false
    )
    String address;

    @Property(
            columnDefinition = "integer NOT NULL",
            comments = @Comment("小区总面积."),
            name = "小区总面积",
            nullable = false
    )
    Integer areaTotal;

    @Property(
            columnDefinition = "integer NOT NULL",
            comments = @Comment("小区总车位."),
            name = "小区总车位",
            nullable = false
    )
    Integer areaParking;

    @Property(
            columnDefinition = "varchar(50) NOT NULL",
            comments = @Comment("银行账号."),
            name = "银行账号",
            length = 50,
            nullable = false
    )
    String account;

    //////
    @Property(
            columnDefinition = "integer",
            comments = @Comment("公摊面积."),
            name = "公摊面积"
    )
    Integer areaShare;

    @Property(
            columnDefinition = "integer",
            comments = @Comment("建筑面积."),
            name = "建筑面积"
    )
    Integer areaBuilding;

    @Property(
            columnDefinition = "varchar(50)",
            comments = @Comment("建筑单位."),
            name = "建筑单位",
            length = 50
    )
    String buildingUnit;

    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("建筑单位联系方式."),
            name = "建筑单位联系方式",
            length = 20
    )
    String buildingUnitPhone;

    @Property(
            columnDefinition = "varchar(50)",
            comments = @Comment("开发单位."),
            name = "开发单位",
            length = 50
    )
    String developUnit;

    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("开发单位联系方式."),
            name = "开发单位联系方式",
            length = 20
    )
    String developUnitPhone;

    @Property(
            columnDefinition = "varchar(50)",
            comments = @Comment("施工单位."),
            name = "施工单位",
            length = 50
    )
    String constructionUnit;

    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("施工单位联系方式."),
            name = "施工单位联系方式",
            length = 20
    )
    String constructionUnitPhone;

    @Property(
            columnDefinition = "varchar(50)",
            comments = @Comment("消防维保单位."),
            name = "消防维保单位",
            length = 50
    )
    String fireMaintenanceUnit;

    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("消防维保单位负责人."),
            name = "消防维保单位负责人",
            length = 20
    )
    String fireMaintenanceUnitManager;

    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("消防维保单位联系方式."),
            name = "消防维保单位联系方式",
            length = 20
    )
    String fireMaintenanceUnitPhone;


    @Property(
            columnDefinition = "varchar(50)",
            comments = @Comment("电梯维保单位."),
            name = "电梯维保单位",
            length = 50
    )
    String elevatorMaintenanceUnit;

    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("电梯维保单位负责人."),
            name = "电梯维保单位负责人",
            length = 20
    )
    String elevatorMaintenanceUnitManager;

    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("电梯维保单位联系方式."),
            name = "电梯维保单位联系方式",
            length = 20
    )
    String elevatorMaintenanceUnitPhone;

    @Property(
            columnDefinition = "varchar(50)",
            comments = @Comment("安防维保单位."),
            name = "安防维保单位",
            length = 50
    )
    String securityMaintenanceUnit;

    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("安防维保单位负责人."),
            name = "安防维保单位负责人",
            length = 20
    )
    String securityMaintenanceUnitManager;

    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("安防维保单位联系方式."),
            name = "安防维保单位联系方式",
            length = 20
    )
    String securityMaintenanceUnitPhone;

    @Property(
            columnDefinition = "varchar(50)",
            comments = @Comment("其它维保单位(elseMaintenanceUnit)."),
            name = "其它维保单位",
            length = 50
    )
    String otherMaintenanceUnit;

    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("其它维保单位负责人(elseMaintenanceUnitManager)."),
            name = "其它维保单位负责人",
            length = 20
    )
    String otherMaintenanceUnitManager;

    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("其它维保单位联系方式(elseMaintenanceUnitPhone)."),
            name = "其它维保单位联系方式",
            length = 20
    )
    String otherMaintenanceUnitPhone;

    @Property(
            columnDefinition = "varchar(50)",
            comments = @Comment("消防责任人."),
            name = "消防责任人",
            length = 50
    )
    String fireManager;

    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("消防责任人座机."),
            name = "消防责任人座机",
            length = 20
    )
    String fireManagerPhone;

    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("消防责任人联系方式."),
            name = "消防责任人联系方式",
            length = 20
    )
    String fireManagerTelephone;

    @Property(
            columnDefinition = "integer",
            comments = @Comment("小区安全指数."),
            name = "小区安全指数"
    )
    Integer communitySafeNum;

    @Property(
            columnDefinition = "varchar(10)",
            comments = @Comment("经度(pos_x)."),
            name = "经度",
            length = 10
    )
    String lng;

    @Property(
            columnDefinition = "varchar(10)",
            comments = @Comment("纬度(pos_y)."),
            name = "纬度",
            length = 10
    )
    String lat;

    @Property(
            columnDefinition = "bigint",
            comments = @Comment("LOGO文件ID."),
            name = "LOGO ID"
    )
    Long logoId;
}
