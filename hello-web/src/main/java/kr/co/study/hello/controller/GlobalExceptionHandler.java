package kr.co.study.hello.controller;

import org.mybatis.spring.MyBatisSystemException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import kr.co.study.hello.exception.BizException;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(BizException.class)
	public String handleBizException(Exception e, Model model ) {
		
		System.out.print("handler in " );
		model.addAttribute("type", e.getClass().getSimpleName());
model.addAttribute("msg", e.getMessage());
		return "error";
	}
	
	@ExceptionHandler(MyBatisSystemException.class)
	public String handleBatisException(Exception e, Model model ) {
		
		System.out.print("Batis Error in " );
		model.addAttribute("type", e.getClass().getSimpleName());
		model.addAttribute("msg", e.getMessage());
		return "error";
	}
	

}
