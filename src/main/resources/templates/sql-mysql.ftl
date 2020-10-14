
-- ----------------------------
-- Table structure for ${domain.tableName}
-- ----------------------------
DROP TABLE IF EXISTS ${domain.tableName};
CREATE TABLE ${domain.tableName} (
    id bigint unsigned NOT NULL AUTO_INCREMENT,
    org_id bigint unsigned DEFAULT NULL,
    dep_id bigint unsigned DEFAULT NULL,
    gmt_create datetime DEFAULT NULL,
    gmt_modified datetime DEFAULT NULL,
<#list domain.ps as p>
    <#if p.columnDefinition?contains('bit(1)')>is_</#if>${p.column} ${p.columnDefinition} COMMENT '<#list p.comments as comment>${comment}</#list>',
</#list>
CONSTRAINT pk_${domain.tableName}_id PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
