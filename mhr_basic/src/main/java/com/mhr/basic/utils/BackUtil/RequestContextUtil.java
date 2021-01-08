package com.mhr.basic.utils.BackUtil;

import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestContextUtil {
	   public static Object get(String name) {
	        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
	        if(attributes != null) {
				return attributes.getAttribute(name, RequestAttributes.SCOPE_REQUEST);
			}
	        return null;
	    }

	    public static void set(String name, Object value) {
	        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
	        if(attributes != null) {
				attributes.setAttribute(name, value, RequestAttributes.SCOPE_REQUEST);
			}
	    }
      
	    public static HttpServletRequest getRequest() {
	        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
	        if(attributes != null) {
				return attributes.getRequest();
			}
	        return null;
	    }

	    public static HttpServletResponse getResponse() {
	        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
	        if(attributes != null) {
				return attributes.getResponse();
			}
	        return null;
	    }

}
