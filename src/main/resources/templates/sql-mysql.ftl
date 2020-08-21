
-- ----------------------------
-- Table structure for ${domain.subModelName}_${domain.tableName}
-- ----------------------------
DROP TABLE IF EXISTS ${domain.subModelName}_${domain.tableName};
CREATE TABLE ${domain.subModelName}_${domain.tableName} (
    id bigint unsigned NOT NULL AUTO_INCREMENT,
    gmt_create bigint unsigned DEFAULT NULL,
    gmt_modified bigint unsigned DEFAULT NULL,
<#list domain.ps as p>
    <#if p.columnDefinition?contains('boolean')>is_</#if>${p.column} ${p.columnDefinition} COMMENT '<#list p.comments as comment>${comment}</#list>',
</#list>
CONSTRAINT pk_${domain.subModelName}_${domain.tableName}_id PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
