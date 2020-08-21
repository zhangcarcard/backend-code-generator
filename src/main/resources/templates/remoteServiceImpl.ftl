package ${domain.remoteServiceImplPackageName};

import ${domain.basePackageName}.commons.remoteservice.BaseRemoteServiceImpl;
import ${domain.basePackageName}.commons.service.BaseService;
import ${domain.dtoPackageName}.${domain.className}DTO;
<#--import ${domain.queryPackageName}.${domain.className}QUERY;-->
import ${domain.remoteServicePackageName}.${domain.className}RemoteService;
import ${domain.servicePackageName}.${domain.className}Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.apache.dubbo.config.annotation.Service;

/**
 * Created by ${domain.user} in ${domain.date}
 */
@Service
public class ${domain.className}RemoteServiceImpl
        extends BaseRemoteServiceImpl<${domain.className}DTO>
        implements ${domain.className}RemoteService {
    @Autowired
    private ${domain.className}Service ${(domain.className)?uncap_first}Service;

    @Override
    protected BaseService<${domain.className}DTO> service() {
        return ${(domain.className)?uncap_first}Service;
    }
}
