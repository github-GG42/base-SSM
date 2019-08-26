package com.china.gis.baseSSM.aspect;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.china.gis.baseSSM.common.constant.LogRootConstant;
import com.china.gis.baseSSM.domain.Log;
import com.china.gis.baseSSM.util.IPUtils;
import com.china.gis.baseSSM.util.LogUtil;

/**
 * @ClassName: LoggingAop
 * @Description: controller日志
 * @author: GG42
 * @date: 2019年8月26日 下午4:30:37
 * @Copyright: 上海城地
 */
@Aspect
@Order(1)
@Component
public class LoggingAop {

	/**
	 * request: web request
	 */
	@Autowired
	public HttpServletRequest request;

	/**
	 * sysLog: 系统日志
	 */
	public static final Logger sysLog = LogUtil.get(LogRootConstant.SYSTEM_LOG.getLogRootName());

	/**
	 * busLog: 业务日志
	 */
	public static final Logger busLog = LogUtil.get(LogRootConstant.BUSINESS_LOG.getLogRootName());

	@Pointcut("execution(* com.china.gis.baseSSM.controller.*.*(..))")
	public void recordLogPointCut() {
	}

	@Around("LoggingAop.recordLogPointCut()")
	public Object recordLogPointCut(ProceedingJoinPoint joinPoint) throws Throwable {
		// 耗时-start
		long currentTimeMillisStart = System.currentTimeMillis();

		// 获取日志
		Log log = getLog(request, joinPoint);

		// 返回结果
		Object proceed = null;

		try {
			proceed = joinPoint.proceed();
		} catch (Throwable e) {
			log.setOperatopException(e.getMessage());
			throw e;
		} finally {
			// 访问耗时
			long currentTimeMillisEnd = System.currentTimeMillis();
			log.setTimeConsuming(String.valueOf(currentTimeMillisEnd - currentTimeMillisStart));

			Boolean hasException = StringUtils.isEmpty(log.getOperatopException());
			if (hasException) {
				LogUtil.info(busLog, log.toString());
			} else {
				LogUtil.error(sysLog, log.toString());
			}
		}
		return proceed;
	}

	/**
	 * @Title: getLog
	 * @Description: 组装日志
	 * @param request
	 * @param joinPoint
	 * @return
	 */
	private Log getLog(HttpServletRequest request, ProceedingJoinPoint joinPoint) {

		Log log = new Log();
		// 访问时间
		log.setOperatopDate(new Date());

		// 设置IP
		String accessIP = IPUtils.getRequestIP(request);
		log.setClientIP(accessIP);

		// 访问接口
		String accessPath = IPUtils.getAccessPath(request);
		log.setOperatopInterface(accessPath);

		// 访问类名
		String className = joinPoint.getTarget().getClass().getName();
		log.setOperatopClassName(className);

		// 访问方法名
		String methodName = joinPoint.getSignature().getName();
		log.setOperatopMethodName(methodName);
		return log;
	}
}
