package cn.xyc.simpleFactory.annotation;

import java.lang.annotation.*;

/**
 * Created by lijiyang on 2018/5/3.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface Vehicle {
    String name() default "";
}
