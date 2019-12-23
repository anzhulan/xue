package com.lan.test.ioc;

import com.lan.ioc.annocation.PersonCinfig;
import com.lan.ioc.bean.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lanxinping
 * @Date 2019-12-23
 */

public class BeanTest {
    public ApplicationContext applicationContext;

    @Test
    public void persontest() {
        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person lan = (Person) applicationContext.getBean("lan");
        System.out.println(lan);
    }

    @Test
    public void personTest() {
        applicationContext = new AnnotationConfigApplicationContext(PersonCinfig.class);
        Object person = applicationContext.getBean("person2");
        System.out.println(person);
    }
}
