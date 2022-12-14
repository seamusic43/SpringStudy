package kr.co.study.hello.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class MeasuringInterceptor extends HandlerInterceptorAdapter {
	
	Logger log = LoggerFactory.getLogger(MeasuringInterceptor.class);

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		request.setAttribute("mi.beginTime", System.currentTimeMillis());
		return true;
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		long beginTime = (long) request.getAttribute("mi.beginTime");
		long endTime = System.currentTimeMillis();
		

		log.debug(request.getRequestURI() + " 실행 시간 : " + (endTime - beginTime));
		
		super.afterCompletion(request, response, handler, ex);
	}

}
