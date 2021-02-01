package com.iroving.dynamicdatasource.annotation;

import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DbSource {

    /**
     * 数据源 key 值
     *
     * @return
     */
    String value();
}
