package com.mooc.sb2;

import com.mooc.sb2.config.MyBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringBeanApplicationTests {
    public static void main(String[] args) {
        ApplicationContext context;
        context = new AnnotationConfigApplicationContext(MyBean.class);
        context.getBean("myBean");
    }
}
