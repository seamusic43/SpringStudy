package kr.co.study.hello.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MeasuringAspect {
	
	@Around("execution(* kr.co.study.hello.service.*Service.*(..))")
	public Object measuringMethodRunningTime(ProceedingJoinPoint joinPoint) {
		long start = System.currentTimeMillis();
		
		try {
			return joinPoint.proceed();
		} catch (Throwable e) {
			return null;
		} finally {
			long during = System.currentTimeMillis() - start;
			
			String targetMethodName = joinPoint.getSignature().getName();

			System.out.print(targetMethodName + "running time is = " + during);
		}
		
	}

}
