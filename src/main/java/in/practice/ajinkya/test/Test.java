package in.practice.ajinkya.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
		Object ob = ac.getBean("eob");
		System.out.println(ob);
	}
	
}
