package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		//load the spring configuration file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		
		//retrieve bean from spring container 
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
		
		//check if they are the same bean
		boolean result = (theCoach == alphaCoach);
		
		//print the result
		System.out.println("\n Pointing to the same object "+result);
		System.out.println("\n Memory Location ofr the Coach: "+ theCoach);
		
		System.out.println("\n Memory Location ofr the alphaCoach:"+ alphaCoach);
		
		//close the context
		context.close();

	}

}
