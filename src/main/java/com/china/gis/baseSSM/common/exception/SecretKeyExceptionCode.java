package com.china.gis.baseSSM.common.exception;

/**
 * 
 * @ClassName: ExceptionCode
 * @Description: 秘钥异常枚举
 * @author: GG42
 * @date: 2019年8月1日 下午4:50:43
 * @Copyright: 上海城地
 */
public enum SecretKeyExceptionCode {

	/**
	 * SECRET_KEY_EXPIRATION: 秘钥过期
	 */
	SECRET_KEY_EXPIRATION("0x10001", "秘钥过期"),
	/**
	 * SECRET_KEY_ERROR: 秘钥错误
	 */
	SECRET_KEY_ERROR("0x10002", "秘钥错误"),
	/**
	 * SECRET_KEY_INPUT: 请输入秘钥
	 */
	SECRET_KEY_INPUT("0x10003", "请输入秘钥");

	/**
	 * code: 结果码
	 */
	private String code;
	/**
	 * msg: 结果码描述
	 */
	private String msg;

	SecretKeyExceptionCode(String code, String msg) {
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
