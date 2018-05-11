package com.wht.template.core.convert;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * Created by Think on 2016/12/3.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Component
public @interface VOConvert {
    String value() default "";
}
