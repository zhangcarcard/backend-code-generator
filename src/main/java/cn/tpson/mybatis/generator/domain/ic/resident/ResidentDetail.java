package cn.tpson.mybatis.generator.domain.ic.resident;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

import java.util.Date;

@Domain(name = "住户管理(人员)", comments = @Comment(value = "住户管理(人员)"))
public class ResidentDetail {
    @Property(
            columnDefinition = "bigint NOT NULL",
            comments = @Comment("房号ID."),
            name = "房号ID",
            nullable = false
    )
    Long houseId;

    @Property(
            columnDefinition = "boolean NOT NULL DEFAULT true",
            comments = @Comment("是否户主."),
            name = "是否户主",
            nullable = false
    )
    Boolean master;

    @Property(
            columnDefinition = "smallint NOT NULL DEFAULT 1",
            comments = @Comment("居住类型(自用1/租用2)."),
            name = "居住类型(自用1/租用2)",
            nullable = false
    )
    Integer type;

    @Property(
            columnDefinition = "varchar(20) NOT NULL",
            comments = @Comment("姓名."),
            name = "姓名",
            length = 20,
            nullable = false
    )
    String name;

    @Property(
            columnDefinition = "boolean NOT NULL DEFAULT true",
            comments = @Comment("性别."),
            name = "性别",
            nullable = false
    )
    Boolean sex;

    @Property(
            columnDefinition = "varchar(20) NOT NULL",
            comments = @Comment("国家."),
            name = "国家",
            length = 20,
            nullable = false
    )
    String country;

    @Property(
            columnDefinition = "varchar(20) NOT NULL",
            comments = @Comment("民族."),
            name = "民族",
            length = 20,
            nullable = false
    )
    String nation;

    @Property(
            columnDefinition = "timestamp without time zone NOT NULL",
            comments = @Comment("生日."),
            name = "生日",
            nullable = false
    )
    Date birthday;

    @Property(
            columnDefinition = "varchar(20) NOT NULL",
            comments = @Comment("联系方式."),
            name = "联系方式",
            length = 20,
            nullable = false
    )
    String phone;

    @Property(
            columnDefinition = "varchar(10) NOT NULL",
            comments = @Comment("政治面貌."),
            name = "政治面貌",
            length = 10,
            nullable = false
    )
    String politics;

    @Property(
            columnDefinition = "smallint NOT NULL",
            comments = @Comment("人员属性(字典选项)."),
            name = "人员属性",
            nullable = false
    )
    Integer natureType;

    @Property(
            columnDefinition = "smallint NOT NULL DEFAULT 2",
            comments = @Comment("户口性质(农业1/非农2)."),
            name = "户口性质",
            nullable = false
    )
    Integer accountsNature;

    @Property(
            columnDefinition = "varchar(100) NOT NULL",
            comments = @Comment("政治面貌."),
            name = "户口地址",
            length = 100,
            nullable = false
    )
    String address;

    @Property(
            columnDefinition = "smallint NOT NULL DEFAULT 1",
            comments = @Comment("证件类型(身份证1/其他2)."),
            name = "证件类型",
            nullable = false
    )
    Integer identityType;

    @Property(
            columnDefinition = "varchar(20) NOT NULL",
            comments = @Comment("证件号码."),
            name = "证件号码",
            length = 20,
            nullable = false
    )
    String identityNumber;

    @Property(
            columnDefinition = "timestamp without time zone NOT NULL",
            comments = @Comment("证件有效开始日期."),
            name = "证件有效开始日期",
            length = 10,
            nullable = false
    )
    Date enableTime;

    @Property(
            columnDefinition = "timestamp without time zone NOT NULL",
            comments = @Comment("证件有效截止日期."),
            name = "证件有效截止日期",
            length = 10,
            nullable = false
    )
    Date enableEndTime;

    @Property(
            columnDefinition = "varchar(20) NOT NULL",
            comments = @Comment("发证机关."),
            name = "发证机关",
            length = 20,
            nullable = false
    )
    String issue;

    @Property(
            columnDefinition = "boolean NOT NULL DEFAULT false",
            comments = @Comment("服兵役情况(未服0/已服1)."),
            name = "服兵役情况",
            nullable = false
    )
    Boolean military;

    @Property(
            columnDefinition = "boolean NOT NULL DEFAULT true",
            comments = @Comment("开门权限(无0/有1)."),
            name = "开门权限",
            nullable = false
    )
    Boolean openAuthority;

    @Property(
            columnDefinition = "bigint NOT NULL",
            comments = @Comment("证件照ID."),
            name = "证件照ID",
            nullable = false
    )
    Long photoId;

    @Property(
            columnDefinition = "varchar(50)",
            comments = @Comment("工作单位."),
            name = "工作单位",
            length = 50
    )
    String workUnits;

    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("职业."),
            name = "职业",
            length = 20
    )
    String profession;

    @Property(
            columnDefinition = "varchar(10)",
            comments = @Comment("文化程度."),
            name = "文化程度",
            length = 10
    )
    String education;

    @Property(
            columnDefinition = "varchar(10)",
            comments = @Comment("宗教信仰."),
            name = "宗教信仰",
            length = 10
    )
    String religion;

    @Property(
            columnDefinition = "bigint",
            comments = @Comment("门禁卡表ID."),
            name = "门禁卡表ID"
    )
    Long accessCardId;

    @Property(
            columnDefinition = "bigint",
            comments = @Comment("小区ID."),
            name = "小区ID"
    )
    Long communityId;

    @Property(
            columnDefinition = "integer",
            comments = @Comment("状态(0未审核/1审核通过/2审核未通过)."),
            name = "状态"
    )
    Integer status;

    @Property(
            columnDefinition = "bigint",
            comments = @Comment("系统用户ID."),
            name = "系统用户ID"
    )
    Long userId;

    @Property(
            columnDefinition = "bigint",
            comments = @Comment("录入用户ID."),
            name = "录入用户ID"
    )
    Long reportUserId;

    @Property(
            columnDefinition = "bigint",
            comments = @Comment("审核用户ID."),
            name = "审核用户ID"
    )
    Long reportCheckUserId;

    @Property(
            columnDefinition = "varchar(200)",
            comments = @Comment("审核备注."),
            name = "审核备注"
    )
    String checkRemark;

    @Property(
            columnDefinition = "smallint",
            comments = @Comment("年龄."),
            name = "年龄"

    )
    Integer age;

    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("提交人真实姓名."),
            name = "提交人真实姓名"
    )
    String reportRealname;

    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("审核人真实姓名."),
            name = "审核人真实姓名"
    )
    String reportCheckRealname;
}
