package ${domain.doPackageName};

import ${domain.basePackageName}.commons.annotation.Table;
import ${domain.basePackageName}.commons.pojo.BaseDO;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by ${domain.user} in ${domain.date}
<#list domain.comments as comment>
 * ${comment}
</#list>
 * tableName:${domain.tableName}
 */
@Table(name = "${domain.tableName}", schema = "${domain.dbSchema}")
@Data
@EqualsAndHashCode(callSuper = true)
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
