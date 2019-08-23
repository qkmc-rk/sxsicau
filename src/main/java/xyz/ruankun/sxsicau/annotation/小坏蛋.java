package xyz.ruankun.sxsicau.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 这是一个没有任何价值的注解，只希望你能开心地写完代码
 */
@Target(value = ElementType.METHOD)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface 小坏蛋 {

    boolean 真的吗() default false;
}
