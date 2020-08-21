<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="${domain.mapperPackageName}.${domain.className}Mapper" xmlns="http://java.sun.com/jsf/facelets">
    <resultMap id="BaseResultMap" type="${domain.doPackageName}.${domain.className}DO">
        <id property="id" column="id"/>
        <result property="deleted" column="is_deleted"/>
        <result property="gmtCreate" column="gmt_create"/>
        <result property="gmtModified" column="gmt_modified"/>
        <result property="entId" column="ent_id"/>
        <result property="enable" column="is_enable"/>
    <#list domain.ps as p>
        <result property="${p.property}" column="${p.column}"/>
    </#list>
    </resultMap>

    <select id="findById" parameterType="java.lang.Integer" resultMap="BaseResultMap">
        <include refid="template.findById" />
    </select>

    <select id="findByIds" parameterType="java.util.List" resultMap="BaseResultMap">
        <include refid="template.findByIds" />
    </select>

    <select id="findAll" resultMap="BaseResultMap">
        <include refid="template.findAll" />
    </select>

    <select id="findOne" parameterType="${domain.queryPackageName}.${domain.className}QUERY"
            resultMap="BaseResultMap">
        <include refid="template.findOne" />
    </select>

    <select id="findOneSimilar" parameterType="${domain.queryPackageName}.${domain.className}QUERY"
            resultMap="BaseResultMap">
        <include refid="template.findOneSimilar" />
    </select>

    <select id="countAll" resultType="java.lang.Integer">
        <include refid="template.countAll" />
    </select>

    <select id="findByExample" parameterType="${domain.queryPackageName}.${domain.className}QUERY"
            resultMap="BaseResultMap">
        <include refid="template.findByExample" />
    </select>

    <select id="findIdByExample" parameterType="${domain.queryPackageName}.${domain.className}QUERY"
            resultType="java.lang.Integer">
        <include refid="template.findIdByExample" />
    </select>

    <select id="countByExample" parameterType="${domain.queryPackageName}.${domain.className}QUERY"
            resultType="java.lang.Integer">
        <include refid="template.countByExample" />
    </select>

    <select id="pageByExample" parameterType="${domain.queryPackageName}.${domain.className}QUERY"
            resultMap="BaseResultMap">
        <include refid="template.pageByExample" />
    </select>

    <select id="countBySimilar" parameterType="${domain.queryPackageName}.${domain.className}QUERY"
            resultType="java.lang.Integer">
        <include refid="template.countBySimilar" />
    </select>

    <select id="pageBySimilar" parameterType="${domain.queryPackageName}.${domain.className}QUERY"
            resultMap="BaseResultMap">
        <include refid="template.pageBySimilar" />
    </select>

    <select id="pageIdByExample" parameterType="${domain.queryPackageName}.${domain.className}QUERY"
            resultType="java.lang.Integer">
        <include refid="template.pageIdByExample" />
    </select>

    <update id="deleteById" parameterType="java.lang.Integer">
        <include refid="template.deleteById" />
    </update>

    <update id="deleteByIds" parameterType="java.util.List">
        <include refid="template.deleteByIds" />
    </update>

    <update id="deleteByExample" parameterType="${domain.dtoPackageName}.${domain.className}DTO">
        <include refid="template.deleteByExample" />
    </update>

    <select id="countBySearch" parameterType="${domain.queryPackageName}.${domain.className}QUERY"
            resultType="java.lang.Integer">
        <include refid="template.countBySearch" />
    </select>

    <select id="pageBySearch" parameterType="${domain.queryPackageName}.${domain.className}QUERY"
            resultMap="BaseResultMap">
        <include refid="template.pageBySearch" />
    </select>

    <update id="enable">
        <include refid="template.enable" />
    </update>

    <select id="latest" parameterType="${domain.queryPackageName}.${domain.className}QUERY"
            resultMap="BaseResultMap">
        <include refid="template.latest" />
    </select>

    <update id="update" parameterType="${domain.doPackageName}.${domain.className}DO">
        UPDATE
        ${domain.tableName}
        <set>
            <if test="enable != null">
                is_enable = ${r'#{'}enable${r'}'},
            </if>
            <if test="gmtModified != null">
                gmt_modified = ${r'#{'}gmtModified${r'}'},
            </if>
            <#list domain.ps as p>
                <#if p.propertyType == 'String'>
                    <if test="${p.property} != null and ${p.property} != ''">
                        ${p.column} = ${r'#{'}${p.property}${r'}'},
                    </if>
                <#else>
                    <if test="${p.property} != null">
                        ${p.column} = ${r'#{'}${p.property}${r'}'},
                    </if>
                </#if>
            </#list>
        </set>
        WHERE id = ${r'#{'}id${r'}'} AND is_deleted = false
    </update>

    <insert id="insert" useGeneratedKeys="true" keyProperty="id"
            parameterType="${domain.doPackageName}.${domain.className}DO">
        INSERT INTO
        ${domain.tableName}
        (is_deleted, gmt_create, gmt_modified, ent_id, is_enable<#list domain.ps as p>, ${p.column}</#list>)
        VALUES (${r'#{'}deleted${r'}'}, ${r'#{'}gmtCreate${r'}'}, ${r'#{'}gmtModified${r'}'}, ${r'#{'}entId${r'}'}, ${r'#{'}enable${r'}'}
        <#list domain.ps as p>, ${r'#{'}${p.property}${r'}'}</#list>)
    </insert>

    <!--################################################################################################-->
    <sql id="where">
        <where>
            (
            t.is_deleted = false
            <if test="entId != null">
                AND t.ent_id = ${r'#{'}entId${r'}'}
            </if>
            <if test="enable != null">
                AND t.is_enable = ${r'#{'}enable${r'}'}
            </if>
            <#list domain.ps as p>
                <#if p.propertyType == 'String'>
                    <if test="${p.property} != null and ${p.property} != ''">
                        AND t.${p.column} = ${r'#{'}${p.property}${r'}'}
                    </if>
                <#else>
                    <if test="${p.property} != null">
                        AND t.${p.column} = ${r'#{'}${p.property}${r'}'}
                    </if>
                </#if>
            </#list>
            <if test="startTime != null">
                AND t.gmt_create <![CDATA[>=]]> ${r'#{'}startTime${r'}'}
            </if>
            <if test="endTime != null">
                AND t.gmt_create <![CDATA[<=]]> ${r'#{'}endTime${r'}'}
            </if>
            )
            <if test="wd != null and wd != ''">
                <#assign isFirst=true>
                AND (
                <#list domain.ps as p>
                    <#if p.propertyType == 'String'>
                        <#if !isFirst>OR </#if>t.${p.column} LIKE '%'||${r'#{'}wd${r'}'}||'%'
                        <#assign isFirst=false>
                    </#if>
                </#list>
                )
            </if>
        </where>
    </sql>

    <sql id="whereSimilar">
        <where>
            t.is_deleted = false
            <if test="entId != null">
                AND t.ent_id = ${r'#{'}entId${r'}'}
            </if>
            AND (
            1=0
            <if test="enable != null">
                OR t.is_enable = ${r'#{'}enable${r'}'}
            </if>
            <#list domain.ps as p>
                <#if p.propertyType == 'String'>
                    <if test="${p.property} != null and ${p.property} != ''">
                        OR t.${p.column} = ${r'#{'}${p.property}${r'}'}
                    </if>
                <#else>
                    <if test="${p.property} != null">
                        OR t.${p.column} = ${r'#{'}${p.property}${r'}'}
                    </if>
                </#if>
            </#list>
            <if test="startTime != null">
                OR t.gmt_create <![CDATA[>=]]> ${r'#{'}startTime${r'}'}
            </if>
            <if test="endTime != null">
                OR t.gmt_create <![CDATA[<=]]> ${r'#{'}endTime${r'}'}
            </if>
            )
        </where>
    </sql>

    <sql id="columns">
        t.id, t.is_deleted, t.gmt_create, t.gmt_modified, t.ent_id, t.is_enable<#list domain.ps as p>, t.${p.column}</#list>
    </sql>

    <sql id="tableName">
        ${domain.tableName} t
    </sql>
</mapper>
