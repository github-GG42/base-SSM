package com.china.gis.baseSSM.common.exception;
/**
 * 
 * @ClassName:	UserException   
 * @Description:	用户异常码
 * @author:	GG42
 * @date:	2019年8月7日 下午4:10:19      
 * @Copyright:  上海城地
 */
public class UserException extends BaseException {

	/**
	 * serialVersionUID: 序列值
	 */
	private static final long serialVersionUID = 4926206445020571513L;

	public UserException(String code, String msg) {
		super(code, msg);
	}
	
	public UserException(UserExceptionCode exceptionCode) {
		super(exceptionCode.getCode(), exceptionCode.getMsg());
	}
}
