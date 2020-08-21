package cn.tpson.mybatis.generator.domain.ic.estate;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

import java.util.Date;

/**
 * @author wangJiaHui
 * @date 2020/4/10 14
 */
@Domain(name = "投诉登记", comments = @Comment(value = "投诉登记"))
public class Complaint {

    @Property(
            columnDefinition = "bigint",
            comments = @Comment("小区ID."),
            name = "小区ID"
    )
    Long communityId;
    @Property(
            columnDefinition = "varchar(50)",
            comments = @Comment("标题."),
            name = "标题",
            length = 50
    )
    String title;
    @Property(
            columnDefinition = "smallint",
            comments = @Comment("投诉类型."),
            name = "投诉类型"
    )
    Integer type;
    @Property(
            columnDefinition = "bigint",
            comments = @Comment("楼层id."),
            name = "楼层id"
    )
    Long floorId;
    @Property(
            columnDefinition = "varchar(500)",
            comments = @Comment("内容."),
            name = "内容",
            length = 500
    )
    String content;
    @Property(
            columnDefinition = "varchar(200)",
            comments = @Comment("投诉图片列表."),
            name = "投诉图片列表",
            length = 200
    )
    String photoIds;
    @Property(
            columnDefinition = "varchar(200)",
            comments = @Comment("投诉文件列表."),
            name = "投诉文件列表",
            length = 200
    )
    String fileIds;

    @Property(
            columnDefinition = "bigint",
            comments = @Comment("投诉人员id."),
            name = "投诉人员id"
    )
    Long addManId;
    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("投诉人员."),
            name = "投诉人员",
            length = 20
    )
    String addMan;
    @Property(
            columnDefinition = "boolean NOT NULL DEFAULT true",
            comments = @Comment("添加状态(true.公开|false.匿名)."),
            name = "添加状态"
    )
    Boolean addStatus;
    @Property(
            columnDefinition = "varchar(50)",
            comments = @Comment("投诉地址."),
            name = "投诉地址",
            length = 50
    )
    String addAddress;
    @Property(
            columnDefinition = "varchar(11)",
            comments = @Comment("投诉人员电话."),
            name = "投诉人员电话",
            length = 11
    )
    String addManPhone;
    @Property(
            columnDefinition = "timestamp without time zone",
            comments = @Comment("处理时间."),
            name = "处理时间"
    )
    Date dealTime;
    @Property(
            columnDefinition = "bigint",
            comments = @Comment("处理人员id."),
            name = "处理人员id"
    )
    Long dealManId;
    @Property(
            columnDefinition = "varchar(20)",
            comments = @Comment("处理人员."),
            name = "处理人员",
            length = 20
    )
    String dealMan;
    @Property(
            columnDefinition = "varchar(500)",
            comments = @Comment("处理内容."),
            name = "处理内容",
            length = 500
    )
    String dealContent;
    @Property(
            columnDefinition = "varchar(11)",
            comments = @Comment("处理人员电话."),
            name = "处理人员电话",
            length = 11
    )
    String dealManPhone;
    @Property(
            columnDefinition = "smallint NOT NULL DEFAULT 0",
            comments = @Comment("处理状态(0.未处理|1.已处理)."),
            name = "处理状态"
    )
    Integer status;
    @Property(
            columnDefinition = "bigint",
            comments = @Comment("处理后照片."),
            name = "处理后照片"
    )
    Long dealPhotoId;
}
