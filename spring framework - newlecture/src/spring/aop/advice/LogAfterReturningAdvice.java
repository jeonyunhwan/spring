package spring.aop.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class LogAfterReturningAdvice implements AfterReturningAdvice{

	@Override
	//반환값을 가지고 할거 있으면 하고 아니면 안써도 된다.
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("returnValue:"+returnValue+"method"+method.getName());
	}
}
