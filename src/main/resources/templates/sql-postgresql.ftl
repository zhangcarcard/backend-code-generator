-- Table: public.${domain.tableName}

DROP TABLE IF EXISTS public.${domain.tableName};
DROP SEQUENCE IF EXISTS ${domain.tableName}_id_seq;
CREATE SEQUENCE ${domain.tableName}_id_seq;
CREATE TABLE public.${domain.tableName}
(
    id bigint NOT NULL DEFAULT nextval('${domain.tableName}_id_seq'::regclass),
    org_id bigint NOT NULL,
    dep_id bigint NOT NULL,
    gmt_create TIMESTAMP WITH ZONE DEFAULT NULL,
    gmt_modified TIMESTAMP WITH ZONE DEFAULT NULL,
<#list domain.ps as p>
    <#if p.columnDefinition?contains('boolean')>is_</#if>${p.column} ${p.columnDefinition},
</#list>
    CONSTRAINT pk_${domain.tableName}_id PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER SEQUENCE ${domain.tableName}_id_seq OWNED BY public.${domain.tableName}.id;
ALTER TABLE public.${domain.tableName}
    OWNER to postgres;

<#list domain.ps as p>
COMMENT ON COLUMN public.${domain.tableName}.<#if p.columnDefinition?contains('boolean')>is_</#if>${p.column} IS '<#list p.comments as comment>${comment}</#list>';
</#list>

