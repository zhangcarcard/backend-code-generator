package cn.tpson.mybatis.generator.commons;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Zhangka in 2018/10/25
 */
public class ReflectUtils {
    private static final Logger logger = LoggerFactory.getLogger(ReflectUtils.class);

    private ReflectUtils() {
        throw new AssertionError("no ReflectUtils instance for you!");
    }

    /**
     * 获取泛型类型.
     *
     * @param clazz
     * @param index
     * @param <T>
     * @return
     */
    public static <T> Class<T> getClassGenericType(Class<? extends Object> clazz, int index) {
        Type genType = null;
        while (clazz != Object.class) {
            Type t = clazz.getGenericSuperclass();
            if (t instanceof ParameterizedType) {
                genType = t;
                break;
            }
            clazz = clazz.getSuperclass();
        }
        if (genType == null) {
            logger.info("superclass not ParameterizedType");
            return null;
        }

        Type[] params = ((ParameterizedType) genType).getActualTypeArguments();
        if ((index >= params.length) || (index < 0)) {
            logger.info("Index: {}, Size of {}'s Parameterized Type: {}", index, clazz.getSimpleName(), params.length);
            return null;
        }
        if (!(params[index] instanceof Class)) {
            logger.info("{} not set the actual class on superclass generic parameter", clazz.getSimpleName());
            return null;
        }

        Class<T> ret = (Class<T>) params[index];
        return ret;
    }

    public static <T> T getFieldValue(Object obj, String fieldName) {
        Field field = getAccessibleField(obj, fieldName);
        return getFieldValue(obj, field);
    }

    public static <T> T getFieldValue(Object obj, Field field) {
        if (field == null) {
            return null;
        }

        Object result = null;
        try {
            if (!field.isAccessible()) {
                field.setAccessible(true);
            }
            result = field.get(obj);
        } catch (IllegalAccessException e) {
            logger.error("获取属性值出错:{}", e.getMessage());
        }
        return (T) result;
    }

    public static void setFieldValue(Object obj, String fieldName, Object value) {
        Field field = getAccessibleField(obj, fieldName);
        if (field == null) {
//            throw new IllegalArgumentException("Could not find field [" + fieldName + "] on target [" + obj + "]");
            return;
        }
        try {
            field.set(obj, value);
        } catch (IllegalAccessException e) {
            logger.error("设置属性值出错:{}", e.getMessage());
        }
    }

    public static Field getAccessibleField(Object obj, String fieldName) {
        if (obj == null) {
            return null;
        }

        return getAccessibleField(obj.getClass(), fieldName);
    }

    public static Field getAccessibleField(Class<?> clazz, String fieldName) {
        if (clazz == null) {
            return null;
        }

        while (clazz != Object.class) {
            try {
                Field field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                return field;
            } catch (NoSuchFieldException e) {
                clazz = clazz.getSuperclass();
            }
        }

        return null;
    }

    /**
     * 获取所有字段值,包括父类.
     *
     * @param clazz
     * @return
     */
    public static List<Field> getFields(Class<?> clazz) {
        List<Field> fieldList = new ArrayList<>();
        Class tempClass = clazz;
        while (tempClass != null) {
            List<Field> list = Arrays.asList(tempClass.getDeclaredFields()).stream()
                    .filter(e -> !Modifier.isStatic(e.getModifiers())).collect(Collectors.toList());
            fieldList.addAll(list);
            tempClass = tempClass.getSuperclass();
        }

        return fieldList;
    }

    /**
     * 获取所有方法,包括父类.
     *
     * @param clazz
     * @return
     */
    public static List<Method> getAllMethods(Class<?> clazz) {
        List<Method> methodList = new ArrayList<>();
        Class tempClass = clazz;
        while (tempClass != null && tempClass != Object.class) {
            methodList.addAll(Arrays.asList(tempClass.getDeclaredMethods()));
            tempClass = tempClass.getSuperclass();
        }

        return methodList;
    }

    /**
     * 获取所有方法,不包括父类.
     *
     * @param clazz
     * @return
     */
    public static List<Method> getMethods(Class<?> clazz) {
        return Arrays.asList(clazz.getDeclaredMethods());
    }

    /**
     * 获取所有方法,包括父类.
     *
     * @param clazz
     * @return
     */
    public static List<Method> getAllMethods(Class<?> clazz, Class<? extends Annotation> annotation) {
        List<Method> methodList = new ArrayList<>();
        Class tempClass = clazz;
        while (tempClass != null && tempClass != Object.class) {
            Method[] methods = tempClass.getDeclaredMethods();
            for (Method method : methods) {
                if (Modifier.isStatic(method.getModifiers())) {
                    continue;
                }

                if (method.isAnnotationPresent(annotation)) {
                    methodList.add(method);
                }
            }

            tempClass = tempClass.getSuperclass();
        }

        return methodList;
    }

    /**
     * 获取所有方法,不包括父类.
     *
     * @param clazz
     * @return
     */
    public static List<Method> getMethods(Class<?> clazz, Class<? extends Annotation> annotation) {
        List<Method> methodList = new ArrayList<>();
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            if (Modifier.isStatic(method.getModifiers())) {
                continue;
            }

            if (method.isAnnotationPresent(annotation)) {
                methodList.add(method);
            }
        }

        return methodList;
    }
}
