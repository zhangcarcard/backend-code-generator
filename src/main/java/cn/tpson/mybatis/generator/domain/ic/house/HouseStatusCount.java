package cn.tpson.mybatis.generator.domain.ic.house;

import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.annotation.Domain;
import cn.tpson.mybatis.generator.annotation.Property;

/**
 * @author wangJiaHui
 * @date 2020/4/13 18
 */
@Domain(name = "房屋统计", comments = @Comment(value = "房屋统计"))
public class HouseStatusCount {
    @Property(
            columnDefinition = "bigint",
            comments = @Comment("小区ID."),
            name = "小区ID",
            nullable = false
    )
    Long communityId;

    @Property(
            columnDefinition = "bigint",
            comments = @Comment("自主状态房屋数量."),
            name = "自主状态房屋数量"
    )
    Long freedomNumber;
    @Property(
            columnDefinition = "bigint",
            comments = @Comment("租住状态房屋数量."),
            name = "租住状态房屋数量"
    )
    Long rentNumber;
    @Property(
            columnDefinition = "bigint",
            comments = @Comment("租住状态房屋数量."),
            name = "租住状态房屋数量"
    )
    Long unusedNumber;
}
