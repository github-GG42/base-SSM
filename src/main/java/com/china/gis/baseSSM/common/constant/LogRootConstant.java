package com.china.gis.baseSSM.common.constant;
/**
 * 
 * @ClassName:	LogRootConstant   
 * @Description:	日志流向
 * @author:	GG42
 * @date:	2019年8月2日 下午4:19:52      
 * @Copyright:  上海城地
 */
public enum LogRootConstant {
	/**   
	 * SYSTEM_LOG: 系统日志key
	 */  
	SYSTEM_LOG("LOG_ROOT_CONSTANT_SYSTEM_LOG"),
	/**   
	 * BUSINESS_LOG: 业务日志key
	 */  
	BUSINESS_LOG("LOG_ROOT_CONSTANT_BUSINESS_LOG");
	private String logRootName;

	private LogRootConstant(String logRootName) {
		this.logRootName = logRootName;
	}

	public String getLogRootName() {
		return logRootName;
	}

	
}
