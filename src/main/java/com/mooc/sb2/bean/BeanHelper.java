package com.mooc.sb2.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public final class BeanHelper implements ApplicationContextAware {

    private static ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }

    /**
     * 获取Bean
     * @param beanClass
     * @param <T>
     * @return
     */
    public final static <T> T getBean(Class<T> beanClass) {
        return context.getBean(beanClass);
    }
}