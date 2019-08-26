package com.china.gis.baseSSM.common.exception;

/**   
 * @ClassName:	FileDataExceptionCode   
 * @Description:	文件处理异常
 * @author:	GG42
 * @date:	2019年8月20日 下午4:48:52      
 * @Copyright:  上海城地
 */
public enum FileDataExceptionCode {
	/**
	 * FILE_DOES_NOT_EXIST: 文件不存在
	 */
	FILE_DOES_NOT_EXIST("0x40001", "文件不存在"),
	/**
	 * FILE_CONVERSION_EXCEPTION: 文件转换异常
	 */
	FILE_CONVERSION_EXCEPTION("0x40002", "文件转换异常"),
	
	/**   
	 * FILE_SUFFIXES_ARE_INCORRECT: 文件后缀不正确
	 */  
	FILE_SUFFIXES_ARE_INCORRECT("0x40003", "文件后缀不正确");

	/**
	 * code: 结果码
	 */
	private String code;
	/**
	 * msg: 结果码描述
	 */
	private String msg;

	FileDataExceptionCode(String code, String msg) {
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
