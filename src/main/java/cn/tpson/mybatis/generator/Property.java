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
public class Property {
    private List<String> comments;
    private String propertyType;
    private String capitalizePropertyType;
    private String property;
    private String column;
    private String columnDefinition;
    private boolean nullable;
    private String name;
    private int length;

    public Property(List<String> comments, String propertyType, String capitalizePropertyType, String property,
                    String column, String columnDefinition, boolean nullable, String name, int length) {
        this.comments = comments;
        this.propertyType = propertyType;
        this.capitalizePropertyType = capitalizePropertyType;
        this.property = property;
        this.column = column;
        this.columnDefinition = columnDefinition;
        this.nullable = nullable;
        this.name = name;
        this.length = length;
    }
}
