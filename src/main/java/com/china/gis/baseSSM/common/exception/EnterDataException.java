package com.china.gis.baseSSM.common.exception;

public class EnterDataException extends BaseException {

	/**
	 * serialVersionUID: 序列值
	 */
	private static final long serialVersionUID = 5620943583848041135L;

	public EnterDataException(String code, String msg) {
		super(code, msg);
	}
	
	public EnterDataException(EnterDataExceptionCode exceptionCode) {
		super(exceptionCode.getCode(), exceptionCode.getMsg());
	}
}
