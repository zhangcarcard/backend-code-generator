-- Table: public.${domain.subModelName}_${domain.tableName}

DROP TABLE IF EXISTS public.${domain.subModelName}_${domain.tableName};
DROP SEQUENCE IF EXISTS ${domain.subModelName}_${domain.tableName}_id_seq;
CREATE SEQUENCE ${domain.subModelName}_${domain.tableName}_id_seq;
CREATE TABLE public.${domain.subModelName}_${domain.tableName}
(
    id bigint NOT NULL DEFAULT nextval('${domain.subModelName}_${domain.tableName}_id_seq'::regclass),
    gmt_create bigint,
    gmt_modified bigint,
<#list domain.ps as p>
    <#if p.columnDefinition?contains('boolean')>is_</#if>${p.column} ${p.columnDefinition},
</#list>
    CONSTRAINT pk_${domain.subModelName}_${domain.tableName}_id PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER SEQUENCE ${domain.subModelName}_${domain.tableName}_id_seq OWNED BY public.${domain.subModelName}_${domain.tableName}.id;
ALTER TABLE public.${domain.subModelName}_${domain.tableName}
    OWNER to postgres;

<#list domain.ps as p>
COMMENT ON COLUMN public.${domain.subModelName}_${domain.tableName}.<#if p.columnDefinition?contains('boolean')>is_</#if>${p.column} IS '<#list p.comments as comment>${comment}</#list>';
</#list>

