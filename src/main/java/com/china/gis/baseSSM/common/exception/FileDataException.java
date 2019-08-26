package com.china.gis.baseSSM.common.exception;

/**   
 * @ClassName:	FileDataException   
 * @Description:	文件处理异常
 * @author:	GG42
 * @date:	2019年8月20日 下午4:49:08      
 * @Copyright:  上海城地
 */
public class FileDataException extends BaseException {

	/**   
	 * serialVersionUID: 序列值
	 */  
	private static final long serialVersionUID = 117832307498283027L;
	
	public FileDataException(String code, String msg) {
		super(code, msg);
	}
	
	public FileDataException(FileDataExceptionCode exceptionCode) {
		super(exceptionCode.getCode(), exceptionCode.getMsg());
	}

}
