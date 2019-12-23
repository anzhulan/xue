package com.lan.springbootlearn;

import com.lan.springbootlearn.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootLearnApplicationTests {

	@Resource
	private Person person;
	@Test
	public void contextLoads() {
		System.out.println(person.toString());
	}

}
