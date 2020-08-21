package ${domain.mapperPackageName};

import ${domain.basePackageName}.commons.mapper.BaseMapper;
<#--import ${domain.queryPackageName}.${domain.className}QUERY;-->
import ${domain.doPackageName}.${domain.className}DO;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by ${domain.user} in ${domain.date}
 *
 */
@Mapper
public interface ${domain.className}Mapper
        extends BaseMapper<${domain.className}DO> {
}