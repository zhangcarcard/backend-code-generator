package cn.tpson.mybatis.generator.domain.ic.estate;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

/**
 * @author wangJiaHui
 * @date 2020/4/10 14
 */
@Domain(name = "物资类型", comments = @Comment(value = "物资类型"))
public class DeviceType {
    @Property(
            columnDefinition = "bigint",
            comments = @Comment("父类id."),
            name = "父类id"
    )
    Long pid;
    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("类型名称."),
            name = "类型名称",
            length = 20,
            nullable = false
    )
    String name;
    @Property(
            columnDefinition = "smallint NOT NULL DEFAULT 1",
            comments = @Comment("物资类型等级."),
            name = "物资类型等级",
            nullable = false
    )
    Integer level;
    @Property(
            columnDefinition = "varchar(100)",
            comments = @Comment("问题处理单位."),
            name = "问题处理单位",
            length = 100,
            nullable = false
    )
    String dealUnit;
    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("处理人."),
            name = "处理人",
            length = 20,
            nullable = false
    )
    String dealMan;
    @Property(
            columnDefinition = "varchar(11)",
            comments = @Comment("处理人联系方式."),
            name = "处理人联系方式",
            length = 11,
            nullable = false
    )
    String dealPhone;
    @Property(
            columnDefinition = "bigint",
            comments = @Comment("处理人id."),
            name = "处理人id"
    )
    Long dealManId;
    @Property(
            columnDefinition = "bigint",
            comments = @Comment("小区ID."),
            name = "小区ID"
    )
    Long communityId;

    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("添加人."),
            name = "添加人"
    )
    String addMan;
    @Property(
            columnDefinition = "smallint NOT NULL DEFAULT 0",
            comments = @Comment("性质类型(0.为普通类型,|1.为闸机类型)."),
            name = "性质类型",
            nullable = false
    )
    Integer kind;
}
