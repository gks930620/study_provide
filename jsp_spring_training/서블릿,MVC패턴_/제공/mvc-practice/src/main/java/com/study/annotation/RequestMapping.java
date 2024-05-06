package com.study.annotation;


import com.study.mvc.controller.RequestMethod;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD}) //
@Retention(RetentionPolicy.RUNTIME) //유지기간
public @interface RequestMapping {

    String value() default "";
    RequestMethod[] method() default {};
}
