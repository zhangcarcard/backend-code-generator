package ${domain.voPackageName};

import ${domain.dtoPackageName}.${domain.className}DTO;

/**
 * Created by ${domain.user} in ${domain.date}
<#list domain.comments as comment>
 * ${comment}.
</#list>
 */
public class ${domain.className}VO extends ${domain.className}DTO {

}
