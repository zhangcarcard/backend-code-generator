package ${domain.remoteServicePackageName};

import ${domain.basePackageName}.commons.remoteservice.BaseRemoteService;
import ${domain.dtoPackageName}.${domain.className}DTO;
<#--import ${domain.queryPackageName}.${domain.className}QUERY;-->
<#--import org.springframework.cloud.openfeign.FeignClient;-->

/**
 * Created by ${domain.user} ${domain.date}
 */
<#--@FeignClient(name = "${domain.serviceName}/api/${domain.uri}")-->
public interface ${domain.className}RemoteService
        extends BaseRemoteService<${domain.className}DTO> {

}