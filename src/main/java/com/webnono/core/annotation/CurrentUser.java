package com.webnono.core.annotation;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2015/12/21.
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CurrentUser {

    String value() default "user";
}
