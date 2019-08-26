package com.china.gis.baseSSM.common.exception;

/**
 * 
 * @ClassName: ExceptionCode
 * @Description: 秘钥异常枚举
 * @author: GG42
 * @date: 2019年8月1日 下午4:50:43
 * @Copyright: 上海城地
 */
public enum UserExceptionCode {

	/**   
	 * ACCOUNT_NOT_ACTIVATED: 账号未激活
	 */  
	ACCOUNT_NOT_ACTIVATED("0x20000", "账号未激活"),
	/**   
	 * ACCOUNT_ACTIVATED: 账号已激活
	 */  
	ACCOUNT_ACTIVATED("0x20002", "账号已激活"),
	/**   
	 * ACCOUNT_HAS_BEEN_CANCELLED: 账号已注销
	 */  
	ACCOUNT_HAS_BEEN_CANCELLED("0x20003", "账号已注销"),
	/**   
	 * ACCOUNT_STATUS_UNKNOWN: 账号状态未知
	 */  
	ACCOUNT_STATUS_UNKNOWN("0x20004", "账号状态未知"),
	/**   
	 * NO_ACCOUNT_EXISTS: 账号不存在
	 */  
	NO_ACCOUNT_EXISTS("0x20005", "账号不存在");

	private String code;
	/**
	 * msg: 结果码描述
	 */
	private String msg;

	UserExceptionCode(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public String getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}
}
