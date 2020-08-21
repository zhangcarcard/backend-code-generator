package cn.tpson.mybatis.generator.annotation;

import java.lang.annotation.*;

/**
 * Created by zk in 2018/11/05
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Comment {
    String value() default "";
}
