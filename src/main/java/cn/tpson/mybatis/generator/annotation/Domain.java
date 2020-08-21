package cn.tpson.mybatis.generator.annotation;

import java.lang.annotation.*;

/**
 * Created by zk in 2018/11/05
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Domain {
    Comment[] comments() default {};
    String name() default "";
}
