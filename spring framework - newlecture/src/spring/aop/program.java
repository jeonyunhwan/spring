package spring.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.aop.entity.Exam;
import spring.aop.entity.NewlecExam;

public class program {

	public static void main(String[] args) {
		//만약total의 성능이 느리다는 이야기가 들릴때, 
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring/aop/setting.xml");
		Exam proxy = (Exam)context.getBean("proxy");
		System.out.printf("total is %d\n",proxy.total());
		System.out.printf("avg is %f",proxy.avg());
		//Exam exam = new NewlecExam(1,1,1,1);
		
		// instance 할당받을 수 있음
		//인터페이스에 따라 달라짐.
		/*
		Exam proxy = (Exam)Proxy.newProxyInstance(NewlecExam.class.getClassLoader(),new Class[] {Exam.class},
				new InvocationHandler() {
					@Override
					public Object invoke(Object arg0, Method arg1, Object[] arg2) throws Throwable {
						
						long start = System.currentTimeMillis();
						
						Object result = arg1.invoke(exam, arg2);
						
						try {
							Thread.sleep(200);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						long end = System.currentTimeMillis();
						
						String message = (end-start) + "ms 가 걸렸습니다.";
						System.out.println(message);
						

						return result;
					}
			
		}
			
		
				);
		*/
	
	}
	
}
