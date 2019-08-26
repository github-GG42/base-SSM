package com.china.gis.baseSSM.common.exception;
/**
 * 
 * @ClassName:	SecretKeyException   
 * @Description:	秘钥相关错误
 * @author:	GG42
 * @date:	2019年8月7日 上午11:35:28      
 * @Copyright:  上海城地
 */
public class SecretKeyException extends BaseException {
	
	private static final long serialVersionUID = 6036163249097768218L;

	public SecretKeyException(String code, String msg) {
		super(code, msg);
	}

	public SecretKeyException(SecretKeyExceptionCode exceptionCode) {
		super(exceptionCode.getCode(), exceptionCode.getMsg());
	}
}
