package cn.tpson.mybatis.generator.domain.logistics.base;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

@Domain(name = "部门管理", comments = @Comment(value = "部门管理"))
public class Department {
    @Property(
            columnDefinition = "bigint unsigned",
            comments = @Comment("父部门ID."),
            name = "父部门ID"
    )
    Long pid;

    @Property(
            columnDefinition = "varchar(30) NOT NULL",
            comments = @Comment("部门名称."),
            name = "部门名称",
            length = 30,
            nullable = false
    )
    String depName;

    @Property(
            columnDefinition = "varchar(2) NOT NULL",
            comments = @Comment("级别(对应字典名称:DEP_LEVEL)."),
            name = "级别(对应字典名称:DEP_LEVEL)",
            nullable = false
    )
    String level;

    @Property(
            columnDefinition = "varchar(50)",
            comments = @Comment("职责."),
            name = "职责",
            length = 50
    )
    String resp;

    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("部门电话."),
            name = "部门电话",
            length = 20
    )
    String tel;

    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("负责人姓名."),
            name = "负责人姓名",
            length = 20
    )
    String managerName;

    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("负责人电话."),
            name = "负责人电话",
            length = 20
    )
    String managerPhone;

    @Property(
            columnDefinition = "bigint unsigned",
            comments = @Comment("LOGO图片ID."),
            name = "LOGO图片ID"
    )
    Long logoId;

    @Property(
            columnDefinition = "json",
            comments = @Comment("部门位置(JSON串,字段:lng,lat,addr)."),
            name = "部门位置(JSON串,字段:lng,lat,addr)",
            length = 200
    )
    String location;
}
