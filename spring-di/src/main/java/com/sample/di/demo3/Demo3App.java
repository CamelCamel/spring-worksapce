package com.sample.di.demo3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo3App {

	public static void main(String[] args) {
		
		String resource = "classpath:/com/sample/di/demo3/demo3.xml";
		
		ApplicationContext acc = new ClassPathXmlApplicationContext(resource);
		
		SampleController controller = acc.getBean("controller",SampleController.class);
		
		controller.add("lee311", "12341234");
	}
}
