package spring.aop.advice;

import org.springframework.aop.ThrowsAdvice;

public class LogAfterThrowingAdvice implements ThrowsAdvice{
	public void afterThrowing(IllegalArgumentException e) throws Throwable{
		//예외가 발생했을 때 처리를 어떻게할것인가.
		System.out.println("예외발생"+e.getMessage());
		
	}
}
