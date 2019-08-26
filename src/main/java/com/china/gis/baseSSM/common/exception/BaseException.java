package com.china.gis.baseSSM.common.exception;

/**
 * 
 * @ClassName: BaseException
 * @Description: 基础业务异常
 * @author: GG42
 * @date: 2019年8月1日 下午4:45:27
 * @Copyright: 上海城地
 */
public class BaseException extends RuntimeException {

	/**
	 * serialVersionUID: 基础异常ID
	 */
	private static final long serialVersionUID = -2448713129970485356L;

	/**
	 * 结果码
	 */
	private String code;

	/**
	 * 结果码描述
	 */
	private String msg;

	public BaseException(String code, String msg) {
		super(msg);
		this.code = code;
		this.msg = msg;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
