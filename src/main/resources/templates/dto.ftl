package ${domain.dtoPackageName};

import ${domain.basePackageName}.commons.pojo.BaseDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.hibernate.validator.constraints.Length;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

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
public class ${domain.className}DTO extends BaseDTO {
<#list domain.ps as p>
    /**
    <#list p.comments as comment>
     * ${comment}
    </#list>
     * <#if !(p.nullable)>非空.</#if>
     */
    @ApiModelProperty(value = "<#list p.comments as comment>${comment}</#list>"<#if !(p.nullable)>, required = true</#if>, example = "1")
<#if !(p.nullable)>
    <#if p.propertyType == "String">
    @NotBlank(message = "[${(p.name)!}]不能为空")
    <#else>
    @NotNull(message = "[${(p.name)!}]不能为空")
    </#if>
</#if>
<#if p.propertyType == "String" && p.length &gt; 0>
    @Length(max = ${(p.length)!}, message = "[${(p.name)!}]长度不能超过${(p.length)!}")
</#if>
<#if p.propertyType == "Double">
    @JsonSerialize(using = DoubleSerializer.class)
</#if>
    private ${p.propertyType} ${p.property};

</#list>
}
