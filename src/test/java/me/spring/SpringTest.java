package me.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.testng.annotations.Test;

/**
 * Created by wanghuanyu on 2015/6/25.
 */
public class SpringTest {

    @Test
    public void test(){
        BeanFactory beanFactory= new XmlBeanFactory(new ClassPathResource("spring-chapt2.xml"));
        TestBean testBean = (TestBean)beanFactory.getBean("testBean");
        testBean.hello();
    }
}
