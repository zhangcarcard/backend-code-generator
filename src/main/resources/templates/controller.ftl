package ${domain.controllerPackageName};

import lombok.extern.slf4j.Slf4j;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ${domain.basePackageName}.commons.controller.BaseController;
import org.springframework.validation.annotation.Validated;
import org.apache.dubbo.config.annotation.Reference;

import ${domain.dtoPackageName}.${domain.className}DTO;
import ${domain.queryPackageName}.${domain.className}QUERY;
import ${domain.updatePackageName}.${domain.className}UPDATE;
import ${domain.voPackageName}.${domain.className}VO;
import ${domain.remoteServicePackageName}.${domain.className}RemoteService;
import ${domain.basePackageName}.commons.remoteservice.BaseRemoteService;

/**
 * ${domain.name}相关操作.
 *
 * @author ${domain.user}
 * @since 1.0
 */

@Slf4j
@RestController
@RequestMapping("/${domain.uri}")
@Validated
@Api(value = "${domain.name}", tags = {"${domain.name}"})
public class ${domain.className}Controller
        extends BaseController<${domain.className}DTO, ${domain.className}QUERY, ${domain.className}UPDATE, ${domain.className}VO> {
    @Reference
    private ${domain.className}RemoteService ${(domain.className)?uncap_first}RemoteService;

    ///////////////////////////////////////////////////////////////////////////////////////////////
    @Override
    protected BaseRemoteService<${domain.className}DTO> baseRemoteService() {
        return ${(domain.className)?uncap_first}RemoteService;
    }
}
