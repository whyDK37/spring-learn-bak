package me.spring.chapt2;

import org.junit.Test;
import org.springframework.aop.config.AopConfigUtils;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class AspectTest {

    @Test
    public void testXmlBeanFactory(){
        //使用这种方式aop不生效
//        XmlBeanFactory beanFactory= new XmlBeanFactory(new ClassPathResource("Aspect-test.xml"));
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Aspect-test.xml");
        TestBean testBean = applicationContext.getBean("testBean",TestBean.class);
        testBean.test();

        System.out.println();
        System.out.println("names:");
        String[] names = applicationContext.getBeanDefinitionNames();
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }

}
