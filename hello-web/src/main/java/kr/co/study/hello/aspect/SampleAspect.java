package kr.co.study.hello.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SampleAspect {
	@Before("execution(* kr.co.study.hello..*.*(..))")
	public void before(JoinPoint joinPoint) {
		String targetMethodName = joinPoint.getSignature().getName();
		
		System.out.print(targetMethodName + " is invoked..");
		
	}

}
