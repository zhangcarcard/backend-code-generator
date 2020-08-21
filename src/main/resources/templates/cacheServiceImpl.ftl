package ${domain.servicePackageName}.impl.cache;

import ${domain.basePackageName}.commons.pojo.Page;
import ${domain.basePackageName}.commons.service.BaseServiceImpl;
import ${domain.dtoPackageName}.${domain.className}DTO;
import ${domain.queryPackageName}.${domain.className}QUERY;
import ${domain.doPackageName}.${domain.className}DO;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by ${domain.user} in ${domain.date}
 */
public abstract class Cache${domain.className}ServiceImpl
        extends BaseServiceImpl<${domain.className}DTO, ${domain.className}QUERY, ${domain.className}DO> {
    public static final String CACHE_KEY_PREFIX = "'${domain.className}Service.'+#root.methodName+";
    public static final String QUERY_KEY = CACHE_KEY_PREFIX +
            "'['+T(cn.tpson.ic.commons.util.MD5Utils).md5(#query.toString())+']'";
    public static final String CACHE_NAME = "eqpcenter::${(domain.className)?lower_case}";

    @Cacheable(cacheNames = CACHE_NAME, key = CACHE_KEY_PREFIX + "'['+#id+']'", unless = "#result == null")
    @Override
    public ${domain.className}DTO findById(Integer id) {
        return super.findById(id);
    }

    @Cacheable(cacheNames = CACHE_NAME, key = CACHE_KEY_PREFIX + "'['+#ids+']'", unless = "#result == null")
    @Override
    public List<${domain.className}DTO> findByIds(List<Integer> ids) {
        return super.findByIds(ids);
    }

    @Cacheable(cacheNames = CACHE_NAME,
            key = QUERY_KEY, cacheManager = "queryCacheManager", unless = "#result == null")
    @Override
    public ${domain.className}DTO findOne(${domain.className}QUERY query) {
        return super.findOne(query);
    }

    @Cacheable(cacheNames = CACHE_NAME,
        key = QUERY_KEY, cacheManager = "queryCacheManager", unless = "#result == null")
    @Override
    public ${domain.className}DTO findOneSimilar(${domain.className}QUERY query) {
        return super.findOneSimilar(query);
    }

    @Cacheable(cacheNames = CACHE_NAME,
            key = QUERY_KEY, cacheManager = "queryCacheManager", unless = "#result == null")
    @Override
    public ${domain.className}DTO latest(${domain.className}QUERY query) {
        return super.latest(query);
    }

    @Cacheable(cacheNames = CACHE_NAME,
            key = QUERY_KEY, cacheManager = "queryCacheManager", unless = "#result == null")
    @Override
    public List<${domain.className}DTO> findByExample(${domain.className}QUERY query) {
        return super.findByExample(query);
    }

    @Cacheable(cacheNames = CACHE_NAME,
            key = QUERY_KEY, cacheManager = "queryCacheManager", unless = "#result == null")
    @Override
    public List<Integer> findIdByExample(${domain.className}QUERY query) {
        return super.findIdByExample(query);
    }

    @Cacheable(cacheNames = CACHE_NAME, key = QUERY_KEY, cacheManager = "queryCacheManager")
    @Override
    public Integer countByExample(${domain.className}QUERY query) {
        return super.countByExample(query);
    }

    @Cacheable(cacheNames = CACHE_NAME,
            key = QUERY_KEY, cacheManager = "queryCacheManager", unless = "#result.list == null")
    @Override
    public Page<${domain.className}DTO> pageByExample(${domain.className}QUERY query) {
        return super.pageByExample(query);
    }

    @Cacheable(cacheNames = CACHE_NAME,
            key = QUERY_KEY, cacheManager = "queryCacheManager", unless = "#result == null")
    @Override
    public List<Integer> pageIdByExample(${domain.className}QUERY query) {
        return super.pageIdByExample(query);
    }

    @CacheEvict(cacheNames = CACHE_NAME, allEntries = true, condition = "#result > 0")
    @Transactional
    @Override
    public Integer update(${domain.className}DTO dto) {
        return super.update(dto);
    }

    @CacheEvict(cacheNames = CACHE_NAME, allEntries = true)
    @Transactional
    @Override
    public Integer insert(${domain.className}DTO dto) {
        return super.insert(dto);
    }

    @CacheEvict(cacheNames = CACHE_NAME, allEntries = true, condition = "#result > 0")
    @Transactional
    @Override
    public Integer deleteById(Integer id) {
        return super.deleteById(id);
    }

    @CacheEvict(cacheNames = CACHE_NAME, allEntries = true, condition = "#result > 0")
    @Transactional
    @Override
    public Integer deleteByIds(List<Integer> ids) {
        return super.deleteByIds(ids);
    }

    @CacheEvict(cacheNames = CACHE_NAME, allEntries = true, condition = "#result > 0")
    @Transactional
    @Override
    public Integer deleteByExample(${domain.className}QUERY query) {
        return super.deleteByExample(query);
    }

    @Cacheable(cacheNames = CACHE_NAME, key = QUERY_KEY, cacheManager = "queryCacheManager")
    @Override
    public boolean exists(${domain.className}QUERY query) {
        return super.exists(query);
    }

    @Cacheable(cacheNames = CACHE_NAME,
            key = QUERY_KEY, cacheManager = "queryCacheManager", unless = "#result.list == null")
    @Override
    public Page<${domain.className}DTO> pageBySearch(${domain.className}QUERY query) {
        return super.pageBySearch(query);
    }

    @Cacheable(cacheNames = CACHE_NAME, key = QUERY_KEY, cacheManager = "queryCacheManager")
    @Override
    public Integer countBySearch(${domain.className}QUERY query) {
        return super.countBySearch(query);
    }

    @CacheEvict(cacheNames = CACHE_NAME, allEntries = true, condition = "#result > 0")
    @Override
    public Integer enable(List<Integer> ids) {
        return super.enable(ids);
    }

    @CacheEvict(cacheNames = CACHE_NAME, allEntries = true, condition = "#result > 0")
    @Override
    public Integer disable(List<Integer> ids) {
        return super.disable(ids);
    }
}

