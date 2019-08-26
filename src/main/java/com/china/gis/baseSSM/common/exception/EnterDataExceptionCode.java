package com.china.gis.baseSSM.common.exception;

/**
 * 
 * @ClassName: ExceptionCode
 * @Description: 用户录入异常枚举
 * @author: GG42
 * @date: 2019年8月1日 下午4:50:43
 * @Copyright: 上海城地
 */
public enum EnterDataExceptionCode {

	/**
	 * ENTRY_EMPTY: 输入为空
	 */
	ENTRY_EMPTY("0x30001", "输入为空"),
	/**
	 * INPUT_FORMAT_ERROR: 输入格式或内容错误
	 */
	INPUT_FORMAT_ERROR("0x30002", "输入格式或内容错误");

	/**
	 * code: 结果码
	 */
	private String code;
	/**
	 * msg: 结果码描述
	 */
	private String msg;

	EnterDataExceptionCode(String code, String msg) {
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
