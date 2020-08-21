package ${domain.queryPackageName};

import ${domain.basePackageName}.commons.pojo.BaseQUERY;
import ${domain.basePackageName}.commons.pojo.F;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

/**
 * Created by ${domain.user} in ${domain.date}
<#list domain.comments as comment>
 * ${comment}
</#list>
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class ${domain.className}QUERY extends BaseQUERY {
<#list domain.ps as p>
    /**
    <#list p.comments as comment>
     * ${comment}
    </#list>
     */
    @ApiModelProperty(value = "<#list p.comments as comment>${comment}</#list>", example = "1")<#if p.columnDefinition=='jsonb'>
    @Jsonb</#if>
    private ${p.propertyType} ${p.property};

</#list>

    //////////////////////////////////////////////////////////////////////////////////////////////////////////
    public enum ${domain.className}Enum implements F {
<#list domain.ps as p>
        ${p.property}<#if !p_has_next>;<#else>,</#if>
</#list>
    }
}
