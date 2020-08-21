package ${domain.servicePackageName}.impl;

import ${domain.basePackageName}.commons.mapper.BaseMapper;
import ${domain.dtoPackageName}.${domain.className}DTO;
<#--import ${domain.queryPackageName}.${domain.className}QUERY;-->
import ${domain.doPackageName}.${domain.className}DO;
import ${domain.mapperPackageName}.${domain.className}Mapper;
import ${domain.servicePackageName}.${domain.className}Service;
import ${domain.basePackageName}.commons.service.BaseCacheServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * Created by ${domain.user} in ${domain.date}
 */
@Service
@Transactional(readOnly = true)
public class ${domain.className}ServiceImpl
        extends BaseCacheServiceImpl<${domain.className}DTO, ${domain.className}DO>
        implements ${domain.className}Service {

    @Autowired
    private ${domain.className}Mapper ${(domain.className)?uncap_first}Mapper;

    @Override
    protected BaseMapper<${domain.className}DO> mapper() {
        return ${(domain.className)?uncap_first}Mapper;
    }
}
