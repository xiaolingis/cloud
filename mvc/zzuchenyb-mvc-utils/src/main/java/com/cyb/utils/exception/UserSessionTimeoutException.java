package com.cyb.utils.exception;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
/**
 *作者 : iechenyb<br>
 *类描述: 说点啥<br>
 *创建时间: 2018年5月11日
 */
public class UserSessionTimeoutException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	Log log = LogFactory.getLog(UserSessionTimeoutException.class);
	public UserSessionTimeoutException() {
		super();
	}
	public UserSessionTimeoutException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}
	public UserSessionTimeoutException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		
	}
	public UserSessionTimeoutException(String arg0) {
		super(arg0);
		
	}
	public UserSessionTimeoutException(Throwable arg0) {
		super(arg0);
	}
	
}
