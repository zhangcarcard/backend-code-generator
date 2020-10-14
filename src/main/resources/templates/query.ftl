package ${domain.queryPackageName};

import ${domain.basePackageName}.commons.pojo.BaseQUERY;
import ${domain.basePackageName}.commons.pojo.F;
import cn.tpson.fire.logistics.commons.pojo.Col;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by ${domain.user} in ${domain.date}
<#list domain.comments as comment>
 * ${comment}
</#list>
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ${domain.className}QUERY extends BaseQUERY {
<#list domain.ps as p>
    /**
    <#list p.comments as comment>
     * ${comment}
    </#list>
     */
    @ApiModelProperty(value = "<#list p.comments as comment>${comment}</#list>")<#if p.columnDefinition=='jsonb'>
    @Jsonb</#if>
    private ${p.propertyType} ${p.property};

</#list>

    //////////////////////////////////////////////////////////////////////////////////////////////////////////
    <#--public enum ${domain.className}Enum implements F {
<#list domain.ps as p>
        ${p.property}<#if !p_has_next>;<#else>,</#if>
</#list>
    }-->
<#list domain.ps as p>
    public static final F ${(p.column)?upper_case} = Col.as("${p.property}");
</#list>
}
