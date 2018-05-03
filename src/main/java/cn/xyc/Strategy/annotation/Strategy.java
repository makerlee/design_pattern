package cn.xyc.Strategy.annotation;

import java.lang.annotation.*;

/**
 * Created by lijiyang on 2018/5/3.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface Strategy {
    String name() default "";
}
