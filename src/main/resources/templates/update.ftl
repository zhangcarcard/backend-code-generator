package ${domain.updatePackageName};

import ${domain.basePackageName}.commons.pojo.BaseUPDATE;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by ${domain.user} in ${domain.date}
<#list domain.comments as comment>
 * ${comment}.
</#list>
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ${domain.className}UPDATE extends BaseUPDATE {
<#list domain.ps as p>
    /**
    <#list p.comments as comment>
     * ${comment}
    </#list>
     */
    @ApiModelProperty(value = "<#list p.comments as comment>${comment}</#list>")
<#if p.propertyType == "String" && p.length &gt; 0>
    @Length(max = ${(p.length)!}, message = "[${(p.name)!}]长度不能超过${(p.length)!}")
</#if>
    private ${p.propertyType} ${p.property};

</#list>
}
