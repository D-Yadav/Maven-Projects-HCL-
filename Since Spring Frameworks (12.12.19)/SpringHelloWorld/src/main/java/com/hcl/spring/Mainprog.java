package com.hcl.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainprog {

	public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("hello.xml");	
Hello h=(HelloImp1)ctx.getBean("bean1");
System.out.println(h.sayHello(" Deepak"));
}

}
