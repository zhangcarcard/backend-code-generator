package cn.tpson.mybatis.generator.annotation;

import java.lang.annotation.*;

/**
 * Created by zk in 2018/11/05
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Property {
    int length() default 0;

    String name() default "";

    Comment[] comments() default {};

    String columnDefinition() default "";

    boolean nullable() default true;
}
