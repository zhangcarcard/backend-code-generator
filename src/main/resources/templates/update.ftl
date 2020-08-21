package ${domain.updatePackageName};

import ${domain.basePackageName}.commons.pojo.BaseUPDATE;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.hibernate.validator.constraints.Length;

/**
 * Created by ${domain.user} in ${domain.date}
<#list domain.comments as comment>
 * ${comment}.
</#list>
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class ${domain.className}UPDATE extends BaseUPDATE {
<#list domain.ps as p>
    /**
    <#list p.comments as comment>
     * ${comment}
    </#list>
     */
    @ApiModelProperty(value = "<#list p.comments as comment>${comment}</#list>", example = "1")
<#if p.propertyType == "String" && p.length &gt; 0>
    @Length(max = ${(p.length)!}, message = "[${(p.name)!}]长度不能超过${(p.length)!}")
</#if>
    private ${p.propertyType} ${p.property};

</#list>
}
