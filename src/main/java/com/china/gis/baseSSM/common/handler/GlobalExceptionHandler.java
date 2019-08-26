package com.china.gis.baseSSM.common.handler;

import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.china.gis.baseSSM.common.exception.BaseException;
import com.china.gis.baseSSM.domain.Result;
import com.china.gis.baseSSM.util.ResultUtils;

/**
 * 
 * @ClassName: GlobalExceptionHandler
 * @Description: 全局异常处理类
 * @author: GG42
 * @date: 2019年8月1日 下午5:00:47
 * @Copyright: 上海城地
 */
@ControllerAdvice
@ResponseBody
@Order(value = 1)
public class GlobalExceptionHandler {
	/**
	 * 
	 * @Title: handleInterfaseException
	 * @Description: 400 接口参数类型错误
	 * @param e
	 * @return
	 */
	@ResponseStatus(HttpStatus.OK)
	@ExceptionHandler(org.springframework.web.method.annotation.MethodArgumentTypeMismatchException.class)
	@ResponseBody
	public Result handleInterfaseException(
			org.springframework.web.method.annotation.MethodArgumentTypeMismatchException e) {
		// 打印日志
		Result result = ResultUtils.ofErrorResult("参数错误");
		return result;
	}

	/**
	 * 
	 * @Title: handleHttpMessageNotReadableException
	 * @Description: 400 参数解析失败
	 * @param e
	 * @return
	 */
	@ResponseStatus(HttpStatus.OK)
	@ExceptionHandler(HttpMessageNotReadableException.class)
	@ResponseBody
	public Result handleHttpMessageNotReadableException(HttpMessageNotReadableException e) {

		Result result = ResultUtils.ofErrorResult("参数解析失败");
		return result;
	}

	/**
	 * 
	 * @Title: handleHttpRequestMethodNotSupportedException
	 * @Description: 405 不支持当前请求方法
	 * @param e
	 * @return
	 */
	@ResponseStatus(HttpStatus.OK)
	@ExceptionHandler(HttpRequestMethodNotSupportedException.class)
	@ResponseBody
	public Result handleHttpRequestMethodNotSupportedException(HttpRequestMethodNotSupportedException e) {
		// 打印日志

		Result result = ResultUtils.ofErrorResult("不支持当前请求方法");
		return result;
	}

	/**
	 * 
	 * @Title: handleHttpMediaTypeNotSupportedException
	 * @Description: 415 不支持当前媒体类型
	 * @param e
	 * @return
	 */
	@ResponseStatus(HttpStatus.OK)
	@ExceptionHandler(HttpMediaTypeNotSupportedException.class)
	@ResponseBody
	public Result handleHttpMediaTypeNotSupportedException(Exception e) {
		// 打印日志

		Result result = ResultUtils.ofErrorResult("不支持当前媒体类型");
		return result;
	}

	/**
	 * 
	 * @Title: handleHttpMessageBusinessRuntimeException
	 * @Description: 400 处理所有业务异常
	 * @param e
	 * @return
	 */
	@ResponseStatus(HttpStatus.OK)
	@ExceptionHandler(BaseException.class)
	@ResponseBody
	public Result handleHttpMessageBusinessRuntimeException(BaseException e) {
		// 打印日志

		Result result = ResultUtils.ofErrorResult(e);
		return result;
	}

	/**
	 * 
	 * @Title: handleUnknownException
	 * @Description: 500 未知错误
	 * @param e
	 * @return
	 * @throws Throwable
	 */
	@ResponseStatus(HttpStatus.OK)
	@ExceptionHandler(Exception.class)
	@ResponseBody
	public Result handleUnknownException(Throwable e) throws Throwable { // 打印日志
		Result result = ResultUtils.ofErrorResult("未知错误");
		System.out.println(e);
		return result;
	}
}
