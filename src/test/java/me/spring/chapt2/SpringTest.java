package me.spring.chapt2;

import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by wanghuanyu on 2015/6/25.
 */
public class SpringTest {

    @Test
    public void testXmlBeanFactory(){
        XmlBeanFactory beanFactory= new XmlBeanFactory(new ClassPathResource("spring-chapt2.xml"));
        TestBean testBean = beanFactory.getBean("testBean",TestBean.class);
        testBean.hello();
        testBean = beanFactory.getBean("abcbean",TestBean.class);
        testBean.hello();
        testBean = beanFactory.getBean("abean",TestBean.class);
        testBean.hello();
        testBean.getTestBean().hello();
        testBean.getTestBean().getTestBean().hello();
    }

    @Test
    public void testApplicationContext(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-chapt2.xml");
        applicationContext.getBean("abcbean",TestBean.class);
        TestBean testBean = applicationContext.getBean("testBean",TestBean.class);
        testBean.hello();
        testBean = applicationContext.getBean("abcbean",TestBean.class);
        testBean.hello();
        testBean = applicationContext.getBean("abean",TestBean.class);
        testBean.hello();
        testBean.getTestBean().hello();
        testBean.getTestBean().getTestBean().hello();
    }


}
