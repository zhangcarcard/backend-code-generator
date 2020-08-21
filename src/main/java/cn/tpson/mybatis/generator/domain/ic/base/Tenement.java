package cn.tpson.mybatis.generator.domain.ic.base;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

/**
 *
 */
@Domain(name = "物业公司", comments = @Comment(value = "物业公司"))
public class Tenement {
    @Property(
            columnDefinition = "varchar(50) NOT NULL",
            comments = @Comment("名称."),
            name = "名称",
            length = 50,
            nullable = false
    )
    String name;

    @Property(
            columnDefinition = "varchar(10) NOT NULL",
            comments = @Comment("编号."),
            name = "编号",
            length = 10,
            nullable = false
    )
    String code;

    @Property(
            columnDefinition = "varchar(20) NOT NULL",
            comments = @Comment("法人."),
            name = "法人",
            length = 20,
            nullable = false
    )
    String man;

    @Property(
            columnDefinition = "varchar(20) NOT NULL",
            comments = @Comment("联系方式."),
            name = "联系方式",
            length = 20,
            nullable = false
    )
    String phone;

    @Property(
            columnDefinition = "varchar(20) NOT NULL",
            comments = @Comment("安保负责人."),
            name = "安保负责人",
            length = 20,
            nullable = false
    )
    String securityManager;

    @Property(
            columnDefinition = "varchar(20) NOT NULL",
            comments = @Comment("安保负责人电话."),
            name = "安保负责人电话",
            length = 20,
            nullable = false
    )
    String securityPhone;

    @Property(
            columnDefinition = "varchar(20) NOT NULL",
            comments = @Comment("财务负责人."),
            name = "财务负责人",
            length = 20,
            nullable = false
    )
    String financeManager;

    @Property(
            columnDefinition = "varchar(20) NOT NULL",
            comments = @Comment("财务负责人电话."),
            name = "财务负责人电话",
            length = 20,
            nullable = false
    )
    String financePhone;

    @Property(
            columnDefinition = "varchar(50) NOT NULL",
            comments = @Comment("银行账号."),
            name = "银行账号",
            length = 50,
            nullable = false
    )
    String account;

    @Property(
            columnDefinition = "varchar(200) NOT NULL",
            comments = @Comment("附件(公司营业执照等)列表."),
            name = "附件列表",
            length = 200,
            nullable = false
    )
    String fileIds;

    @Property(
            columnDefinition = "varchar(200)",
            comments = @Comment("社区列表."),
            name = "社区列表",
            length = 200
    )
    String communityIds;

    @Property(
            columnDefinition = "boolean NOT NULL DEFAULT false",
            comments = @Comment("是否末级."),
            name = "是否末级",
            nullable = false
    )
    Boolean last;

    @Property(
            columnDefinition = "bigint",
            comments = @Comment("LOGO文件ID."),
            name = "LOGO ID"
    )
    Long logoId;
}
