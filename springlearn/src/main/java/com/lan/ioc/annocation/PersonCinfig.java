package com.lan.ioc.annocation;

import com.lan.ioc.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lanxinping
 * @Date 2019-12-23
 */
@Configuration
public class PersonCinfig {

    @Bean
    public Person person1() {
        return new Person("lan1",12,"lan1");
    }

    @Bean
    public Person person2() {
        return new Person("lan2",18,"lan2");
    }
}
