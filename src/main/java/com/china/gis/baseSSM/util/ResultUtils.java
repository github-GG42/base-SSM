package com.china.gis.baseSSM.util;

import org.springframework.util.StringUtils;

import com.china.gis.baseSSM.common.exception.BaseException;
import com.china.gis.baseSSM.domain.Result;
import com.china.gis.baseSSM.domain.ResultPage;

/**
 * 
 * @ClassName: ResultUtils
 * @Description: 生成Result返回结果/ResultPage返回结果页
 * @author: GG42
 * @date: 2019年8月1日 下午5:21:39
 * @Copyright: 上海城地
 */
public final class ResultUtils {

	/**
	 * 
	 * @Title: of
	 * @Description: 返回结果码为0,Data数据为""
	 * @return
	 */
	public static Result ofFailResult() {
		return new Result(Result.FAIL, Result.FAIL_MESSAGE, Result.DATA_NULL);
	}

	/**
	 * 
	 * @Title: of
	 * @Description: 自定义返回结果码,Data数据为""
	 * @param status  结果码
	 * @param message 消息
	 * @return
	 */
	public static Result ofResult(String status, String message) {
		return new Result(status, message, Result.DATA_NULL);
	}

	/**
	 * 
	 * @Title: of
	 * @Description: 自定义返回结果码/Data数据
	 * @param status  结果码
	 * @param message 消息
	 * @param data    数据
	 * @return
	 */
	public static Result ofResult(String status, String message, Object data) {
		return new Result(status, message, data);
	}

	/**
	 * 
	 * @Title: ofSuccessResult
	 * @Description: 返回成功,自定义Data数据
	 * @param data 数据
	 * @return
	 */
	public static Result ofSuccessResult(Object data) {
		return new Result(Result.SUCCESS, Result.SUCCESS_MESSAGE, data);
	}

	/**
	 * 
	 * @Title: of
	 * @Description: 出现异常时,返回业务异常信息,Data数据为""
	 * @param e 业务异常
	 * @return
	 */
	public static Result ofErrorResult(BaseException e) {
		return new Result(e.getCode(), e.getMsg(), Result.DATA_NULL);
	}

	/**
	 * 
	 * @Title: ofResultPage
	 * @Description: 返回结果码为0,data数据为"",分页数据都为0
	 * @return
	 */
	public static ResultPage ofFailResultPage() {
		return new ResultPage(Result.FAIL, Result.FAIL_MESSAGE, Result.DATA_NULL);
	}

	/**
	 * 
	 * @Title: ofResultPage
	 * @Description: 自定义data数据,返回ResultPage
	 * @param data             数据
	 * @param currentPageLimit 当前页数据条数
	 * @param limits           每页数据条数
	 * @param currentPage      当前页码数
	 * @param count            总数据条数
	 * @return
	 */
	public static ResultPage ofSuccessResultPage(Object data, Integer currentPageLimit, Integer limits,
			Integer currentPage, Integer count) {
		return new ResultPage(data, currentPageLimit, limits, currentPage, count);
	}

	/**
	 * 
	 * @Title: ofErrorreResultPage
	 * @Description: 出现异常时,返回业务异常信息,Data数据为""
	 * @param e 业务异常
	 * @return
	 */
	public static ResultPage ofErrorreResultPage(BaseException e) {
		return new ResultPage(e.getCode(), e.getMsg(), Result.DATA_NULL);
	}

	/**
	 * @Title: ofErrorResult
	 * @Description: 系统异常返回,自定义错误消息,返回码为0
	 * @param erroMessage 错误消息
	 * @return
	 */
	public static Result ofErrorResult(String erroMessage) {
		return new Result(Result.FAIL, erroMessage, Result.DATA_NULL);
	}

	/**
	 * 
	 * @Title: assembleFailResult
	 * @Description: 组装失败结果
	 * @param result
	 * @param message
	 * @return
	 */
	public static Result assembleFailResult(Result result) {
		return assembleFailResult(result, null);
	}

	/**
	 * 
	 * @Title: assembleFailResult
	 * @Description: 组装失败结果,自定义返回消息
	 * @param result
	 * @param message
	 * @return
	 */
	public static Result assembleFailResult(Result result, String message) {
		result.setStatus(Result.FAIL);
		result.setMessage(message);
		if (StringUtils.isEmpty(message)) {
			result.setMessage(Result.FAIL_MESSAGE);
		}
		result.setData(Result.DATA_NULL);
		return result;
	}

	/**
	 * 
	 * @Title: assembleSuccessResult
	 * @Description: TODO
	 * @param result
	 * @param data
	 * @return
	 */
	public static Result assembleSuccessResult(Result result, Object data) {
		result.setStatus(Result.SUCCESS);
		result.setMessage(Result.SUCCESS_MESSAGE);
		result.setData(data);
		if (StringUtils.isEmpty(data)) {
			result.setData(Result.DATA_NULL);
		}
		return result;
	}

	/**
	 * 
	 * @Title: assembleFailResultPage
	 * @Description: 组装失败返回结果页
	 * @param page
	 * @return
	 */
	public static ResultPage assembleFailResultPage(ResultPage page) {
		return assembleFailResultPage(page, null);
	}

	/**
	 * 
	 * @Title: assembleFailResultPage
	 * @Description: 组装失败返回结果页,自定义返回消息
	 * @param page
	 * @param message
	 * @return
	 */
	public static ResultPage assembleFailResultPage(ResultPage page, String message) {
		page.setStatus(Result.FAIL);
		page.setMessage(message);
		if (StringUtils.isEmpty(message)) {
			page.setMessage(Result.FAIL_MESSAGE);
		}
		page.setData(Result.DATA_NULL);
		page.setCount(ResultPage.NUMBER_ZERO);
		page.setCurrentPage(ResultPage.NUMBER_ZERO);
		page.setCurrentPageLimit(ResultPage.NUMBER_ZERO);
		page.setLimits(ResultPage.NUMBER_ZERO);
		return page;
	}

	/**
	 * 
	 * @Title: assembleSuccessResultPage
	 * @Description: 组装成功返回结果页
	 * @param page
	 * @return
	 */
	public static ResultPage assembleSuccessResultPage(ResultPage page) {
		return assembleSuccessResultPage(page, null);
	}

	/**
	 * 
	 * @Title: assembleSuccessResultPage
	 * @Description: 组装成功返回结果页,自定义data
	 * @param page
	 * @param data
	 * @return
	 */
	public static ResultPage assembleSuccessResultPage(ResultPage page, Object data) {
		page.setStatus(Result.SUCCESS);
		page.setMessage(Result.SUCCESS_MESSAGE);
		page.setData(data);
		if (StringUtils.isEmpty(data)) {
			page.setData(Result.DATA_NULL);
		}
		return page;
	}
}
