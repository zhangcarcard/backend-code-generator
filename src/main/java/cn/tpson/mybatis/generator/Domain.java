package cn.tpson.mybatis.generator;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * Created by zk in 2018/11/05
 */
@Slf4j
@Getter
@Setter
public class Domain {
    private String basePackageName;
    private String doPackageName;
    private String dtoPackageName;
    private String queryPackageName;
    private String updatePackageName;
    private String voPackageName;
    private String mapperPackageName;
    private String remoteServicePackageName;
    private String remoteServiceImplPackageName;
    private String servicePackageName;
    private String controllerPackageName;
    private String date;
    private List<String> comments;
    private String tableName;
    private String className;
    private List<Property> ps;
    private String name;
    private String uri;
    private String user;
    private String dbSchema;
    private String subModelName;
}
