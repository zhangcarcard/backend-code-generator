package ${domain.doPackageName};

import ${domain.basePackageName}.commons.annotation.Table;
import ${domain.basePackageName}.commons.pojo.BaseDO;
import lombok.*;

/**
 * Created by ${domain.user} in ${domain.date}
<#list domain.comments as comment>
 * ${comment}
</#list>
 * tableName:${domain.tableName}
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Table(name = "${domain.subModelName}_${domain.tableName}", schema = "${domain.dbSchema}")
public class ${domain.className}DO extends BaseDO {
<#list domain.ps as p>
    /**
    <#list p.comments as comment>
     * ${comment}
    </#list>
     * <#if !(p.nullable)>非空.</#if>
     */<#if p.columnDefinition=='jsonb'>
    @Jsonb</#if>
    private ${p.propertyType} ${p.property};

</#list>
}
