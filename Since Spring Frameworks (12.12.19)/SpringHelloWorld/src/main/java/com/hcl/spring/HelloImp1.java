package com.hcl.spring;

public class HelloImp1 implements Hello {
private String greeting;


public String getGreeting() {
	return greeting;
}


public void setGreeting(String greeting) {
	this.greeting = greeting;
}


public String sayHello(String name) {
	// TODO Auto-generated method stub
	return greeting+name;
}


}


