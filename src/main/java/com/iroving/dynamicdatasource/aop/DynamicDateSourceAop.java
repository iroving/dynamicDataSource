package com.iroving.dynamicdatasource.aop;

import com.iroving.dynamicdatasource.annotation.DbSource;
import com.iroving.dynamicdatasource.datasource.DateSourceHolder;
import com.iroving.dynamicdatasource.datasource.DynamicDataSource;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DynamicDateSourceAop {

//    @Pointcut("execution(*com.imnu.dproxy.ArithmeticCalculatorImpl.*(..))")
//    private void selectAll() {
//    }

    /**
     * 切面，在使用 @DbSource 注解之前，将参数传递进来，从而切换数据源，就是设置 DynamicDataSource 中的 dataSource 和 concurrentDSName
     *
     * @param joinPoint
     * @param dbSource
     */


    @Before("@annotation(dbSource)")
    public void switchDataSource(JoinPoint joinPoint, DbSource dbSource) {
//        DynamicDataSource.concurrentDataSource(dbSource.value());
        DateSourceHolder.setDateSource(dbSource.value());
    }

    /**
     * 切面，在使用 @DbSource 注解之后，要清理 DynamicDataSource 中的 dataSource 和 concurrentDSName
     *
     * @param joinPoint
     */
    @After("@within(com.iroving.dynamicdatasource.annotation.DbSource)")
    public void restoreDataSource(JoinPoint joinPoint) {
        DateSourceHolder.clearDateSource();
    }
}


