package com.mooc.sb2.bean;

//import org.apache.commons.lang3.ArrayUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.yaml.snakeyaml.util.ArrayUtils;

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

    /**
     * 获取Bean, 如果不存在则返回一个Class.newInstance()生成的bean(仅适用于Singleton)
     * @param beanClass
     * @param <T>
     * @return
     */
//    public final static <T> T getBeanIfAbsent(Class<T> beanClass) {
//        String[] beanNames = context.getBeanNamesForType(beanClass);
//        if(ArrayUtils.isEmpty(beanNames)) {
//            try {
//                return beanClass.newInstance();
//            } catch (InstantiationException | IllegalAccessException e) {
//                e.printStackTrace();
//            }
//        }
//        if(beanNames.length > 1) {
//            throw new NoUniqueBeanDefinitionException(beanClass, beanNames);
//        }
//        return context.getBean(beanNames[0], beanClass);
//    }
}