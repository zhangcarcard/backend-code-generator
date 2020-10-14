package cn.tpson.mybatis.generator;


import cn.tpson.mybatis.generator.annotation.Comment;
import cn.tpson.mybatis.generator.commons.CamelCaseUtils;
import cn.tpson.mybatis.generator.commons.DateUtils;
import cn.tpson.mybatis.generator.commons.ReflectUtils;
import cn.tpson.mybatis.generator.domain.logistics.goods.GoodsStockInDetail;
import cn.tpson.mybatis.generator.domain.logistics.goods.GoodsStockOutDetail;
import cn.tpson.mybatis.generator.domain.logistics.goods.GoodsTableHeader;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;
import freemarker.template.utility.SecurityUtilities;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/**
 * Created by zk in 2018/11/05
 */
public class Bootstrap {
    private final String user = "zk";
    private static final String DB = "mysql";
    private static final String DB_SCHEMA = "fire_logistics";
    private static final String prefixPackageName = "cn.tpson.fire.logistics";
    private static final String packagePath = prefixPackageName.replaceAll("\\.", "/");
    private static final String basePath = "/Users/zhangka/projects/IdeaProjects/tpson/fire_logistics_support_backend/fire-logistics-support-backend/";
    private static final String modelName = "fire-logistics-support";
    private static final String subModelName = "goods";
    private static final String prefixApiPath = basePath + modelName + "-api/src/main/java/" + packagePath + "/api/" + subModelName + "/";
    private static final String prefixBizPath = basePath + modelName + "-biz/src/main/java/" + packagePath + "/service/biz/" + subModelName + "/";
    private static final String prefixCtrPath = basePath + modelName + "-rest/src/main/java/" + packagePath + "/rest/web/" + subModelName + "/";
    private static final String bizResources = basePath + modelName + "-biz/src/main/resources/mapper/" + subModelName + "/";

    private static final String dtoPath = prefixApiPath + "dto/";
    private static final String queryPath = prefixApiPath + "query/";
    private static final String remoteServicePath = prefixApiPath + "remoteservice/";
    private static final String domainPath = prefixBizPath + "domain/";
    private static final String mapperPath = prefixBizPath + "mapper/";
    private static final String mapperXmlPath = bizResources + "/sql/";
    private static final String remoteServiceImplPath = prefixBizPath + "remoteservice/";
    private static final String servicePath = prefixBizPath + "service/";
    private static final String serviceImplPath = prefixBizPath + "service/impl/";
    private static final String cacheServiceImplPath = prefixBizPath + "service/impl/cache/";
    private static final String ctrPath = prefixCtrPath + "controller/";
    private static final String updatePath = prefixCtrPath + "dto/update/";
    private static final String voPath = prefixCtrPath + "dto/vo/";

    private Configuration cfg;
    private final boolean onlyEntity = false;//true:仅字段更新（仅更新实体类，不更新逻辑类）；false:全部重新生成；

    public static void main(String[] args) throws IOException, TemplateException, ClassNotFoundException {
        Bootstrap bootstrap = new Bootstrap();
        String scanPackage = "cn.tpson.mybatis.generator.domain.logistics." + subModelName;
        //TruckBoxVideo  VideoTermType Manufacturer Toilet ToiletBox Trashcan TrashcanBox ToiletProcessData ToiletRunData AlarmRules AlarmRelation
//        Domain domain = bootstrap.parseDomain(TestMessage.class.getName());

        Files.createDirectories(Paths.get(domainPath));
        Files.createDirectories(Paths.get(dtoPath));
        Files.createDirectories(Paths.get(queryPath));
        Files.createDirectories(Paths.get(mapperPath));
        Files.createDirectories(Paths.get(mapperXmlPath));
        Files.createDirectories(Paths.get(remoteServicePath));
        Files.createDirectories(Paths.get(remoteServiceImplPath));
        Files.createDirectories(Paths.get(servicePath));
        Files.createDirectories(Paths.get(serviceImplPath));
//        Files.createDirectories(Paths.get(cacheServiceImplPath));
        Files.createDirectories(Paths.get(ctrPath));
        Files.createDirectories(Paths.get(updatePath));
        Files.createDirectories(Paths.get(voPath));

        /*List<Domain> domainList = bootstrap.parseDomain(scanPackage, "");
        for (Domain domain : domainList) {
            bootstrap.write(domain);
        }*/


        List<Domain> domainList = bootstrap.parseDomain(Arrays.asList(
//                GoodsStockInOrder.class,
//                GoodsStockInDetail.class,
//                GoodsStockOutOrder.class,
                GoodsTableHeader.class
        ));
        for (Domain domain : domainList) {
            bootstrap.write(domain);
        }

        System.out.println(bootstrap.basePath + "生成成功.");
    }


    public Bootstrap() {
        init();
    }

    public void init() {
        this.cfg = new Configuration(Configuration.VERSION_2_3_28);
        this.cfg.setDefaultEncoding("UTF-8");
        this.cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
        this.cfg.setLogTemplateExceptions(false);
        this.cfg.setWrapUncheckedExceptions(true);
        this.cfg.setNumberFormat("#");
        try {
            String templatePath = SecurityUtilities.getSystemProperty("user.dir") + "/src/main/resources/templates";
            this.cfg.setDirectoryForTemplateLoading(new File(templatePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void write(Domain domain) throws IOException, TemplateException {
        if (domain == null) {
            System.out.println("domain is null.");
            return;
        }

        Map root = new HashMap();
        root.put("domain", domain);
//
        Template doTemp = cfg.getTemplate("do.ftl");
        doTemp.process(root, new OutputStreamWriter(new FileOutputStream(domainPath + domain.getClassName() + "DO.java")));

        Template dtoTemp = cfg.getTemplate("dto.ftl");
        dtoTemp.process(root, new OutputStreamWriter(new FileOutputStream(dtoPath + domain.getClassName() + "DTO.java")));

        Template queryTemp = cfg.getTemplate("query.ftl");
        queryTemp.process(root, new OutputStreamWriter(new FileOutputStream(queryPath + domain.getClassName() + "QUERY.java")));

        //仅更新实体字段时跳过
        if (!onlyEntity) {
            Template mapperTemp = cfg.getTemplate("mapper.ftl");
            mapperTemp.process(root, new OutputStreamWriter(new FileOutputStream(mapperPath + domain.getClassName() + "Mapper.java")));

            Template remoteServiceTemp = cfg.getTemplate("remoteService.ftl");
            remoteServiceTemp.process(root, new OutputStreamWriter(new FileOutputStream(remoteServicePath + domain.getClassName() + "RemoteService.java")));
            Template remoteServiceImplTemp = cfg.getTemplate("remoteServiceImpl.ftl");
            remoteServiceImplTemp.process(root, new OutputStreamWriter(new FileOutputStream(remoteServiceImplPath + domain.getClassName() + "RemoteServiceImpl.java")));

            Template serviceTemp = cfg.getTemplate("service.ftl");
            serviceTemp.process(root, new OutputStreamWriter(new FileOutputStream(servicePath + domain.getClassName() + "Service.java")));

            Template serviceImplTemp = cfg.getTemplate("serviceImpl.ftl");
            serviceImplTemp.process(root, new OutputStreamWriter(new FileOutputStream(serviceImplPath + domain.getClassName() + "ServiceImpl.java")));

            Template ctrTemp = cfg.getTemplate("controller.ftl");
            ctrTemp.process(root, new OutputStreamWriter(new FileOutputStream(ctrPath + domain.getClassName() + "Controller.java")));

            Template voTemp = cfg.getTemplate("vo.ftl");
            voTemp.process(root, new OutputStreamWriter(new FileOutputStream(voPath + domain.getClassName() + "VO.java")));
        }
        Template updateTemp = cfg.getTemplate("update.ftl");
        updateTemp.process(root, new OutputStreamWriter(new FileOutputStream(updatePath + domain.getClassName() + "UPDATE.java")));

        Template sqlTemp = cfg.getTemplate("sql-" + DB + ".ftl");
        sqlTemp.process(root, new OutputStreamWriter(new FileOutputStream(mapperXmlPath + domain.getTableName() + ".sql")));

        System.out.println(domain.getClassName() + "已完成.");
    }

    public List<Property> parseProperty(Class<?> clazz) {
        List<Field> fields = ReflectUtils.getFields(clazz);
        List<Property> ps = new ArrayList<>(fields.size());

        for (Field field : fields) {
            cn.tpson.mybatis.generator.annotation.Property p = field.getAnnotation(cn.tpson.mybatis.generator.annotation.Property.class);

            String property = field.getName();
            String column = CamelCaseUtils.toUnderScoreCase(property);
            String propertyType = field.getType().getSimpleName();
            String capitalizePropertyType = CamelCaseUtils.toCapitalizeCamelCase(column);
            String columnDefinition = p.columnDefinition();
            String name = p.name();
            int length = p.length();
            boolean nullable = p.nullable();

            List<String> pComments = new ArrayList<>();
            if (p != null && p.comments() != null) {
                for (Comment comment : p.comments()) {
                    pComments.add(comment.value());
                }
            }
            Property pros = new Property(pComments, propertyType, capitalizePropertyType, property, column, columnDefinition, nullable, name, length);
            ps.add(pros);
        }

        return ps;
    }

    public List<Domain> parseDomain(String scanPackage, String... exclude) throws ClassNotFoundException {
        List<Domain> domains = new ArrayList<>();
        Set<String> classNames = PackageUtils.findPackageClass(scanPackage);
        List<String> excludes = Arrays.asList(exclude);
        for (String className : classNames) {
            if (className.contains("$") || excludes.contains(className)) {
                continue;
            }

            Class<?> clazz = Class.forName(className);
            Domain domain = parseDomain(clazz);
            domains.add(domain);
        }

        return domains;
    }

    public List<Domain> parseDomain(List<Class<?>> clazzList) throws ClassNotFoundException {
        List<Domain> list = new ArrayList<>();
        for (Class<?> clazz : clazzList) {
            Domain domain = parseDomain(clazz);
            list.add(domain);
        }

        return list;
    }

    public Domain parseDomain(Class<?> clazz) throws ClassNotFoundException {
        String date = DateUtils.getFormatDateTime(DateUtils.now(), "yyyy/MM/dd");
        String clazzSimpleName = clazz.getSimpleName();
        String tableName = CamelCaseUtils.toUnderScoreCase(clazzSimpleName);
        List<Property> ps = parseProperty(clazz);
        List<String> dComments = new ArrayList<>();

        cn.tpson.mybatis.generator.annotation.Domain d = clazz.getAnnotation(cn.tpson.mybatis.generator.annotation.Domain.class);
        if (d != null && d.comments() != null) {
            for (Comment comment : d.comments()) {
                dComments.add(comment.value());
            }
        }
        Domain domain = new Domain();
        domain.setName(d.name());
        domain.setDate(date);
        domain.setComments(dComments);
        domain.setTableName(tableName.startsWith(subModelName) ? tableName : subModelName + "_" + tableName);
        domain.setClassName(clazzSimpleName);

        String uri = CamelCaseUtils.toUnderScoreCase(clazzSimpleName).replaceAll("_", "/");
        uri = uri.startsWith(subModelName) ? uri : subModelName + "/" + uri;
        domain.setUri(uri);
        domain.setPs(ps);

        domain.setBasePackageName(prefixPackageName);
        domain.setDtoPackageName(prefixPackageName + ".api." + subModelName + ".dto");
        domain.setQueryPackageName(prefixPackageName + ".api." + subModelName + ".query");
        domain.setRemoteServicePackageName(prefixPackageName + ".api." + subModelName + ".remoteservice");
        domain.setDoPackageName(prefixPackageName + ".service.biz." + subModelName + ".domain");
        domain.setMapperPackageName(prefixPackageName + ".service.biz." + subModelName + ".mapper");
        domain.setRemoteServiceImplPackageName(prefixPackageName + ".service.biz." + subModelName + ".remoteservice");
        domain.setServicePackageName(prefixPackageName + ".service.biz." + subModelName + ".service");
        domain.setControllerPackageName(prefixPackageName + ".rest.web." + subModelName + ".controller");
        domain.setUpdatePackageName(prefixPackageName + ".rest.web." + subModelName + ".dto.update");
        domain.setVoPackageName(prefixPackageName + ".rest.web." + subModelName + ".dto.vo");
        domain.setUser(user);
        domain.setDbSchema(DB_SCHEMA);
        domain.setSubModelName(subModelName);
        return domain;
    }
}
