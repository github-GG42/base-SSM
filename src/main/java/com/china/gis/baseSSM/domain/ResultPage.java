package com.china.gis.baseSSM.domain;
/**
 * 
 * @ClassName:	ResultPage   
 * @Description:	分页结果类
 * @author:	GG42
 * @date:	2019年8月1日 下午5:28:34      
 * @Copyright:  上海城地
 */
public class ResultPage extends Result {

	/**   
	 * serialVersionUID: TODO
	 */  
	private static final long serialVersionUID = 3159620767585997597L;
	
	/**
	 * 当前页数据条数
	 */
	private Integer currentPageLimit =NUMBER_ZERO;
	/**
	 * 每页数据条数
	 */
	private Integer limits =NUMBER_ZERO;
	/**
	 * 当前页码数
	 */
	private Integer currentPage =NUMBER_ZERO;
	/**
	 * 总数据条数
	 */
	private Integer count =NUMBER_ZERO;

	public static final Integer NUMBER_ZERO = 0;
	
	public ResultPage() {
		super();
	}

	public ResultPage(String status, String message, Object data) {
		super(status, message, data);
	}

	public ResultPage(Integer currentPageLimit, Integer limits, Integer currentPage, Integer count) {
		super();
		this.currentPageLimit = currentPageLimit;
		this.limits = limits;
		this.currentPage = currentPage;
		this.count = count;
	}
	
	public ResultPage(Object data,Integer currentPageLimit, Integer limits, Integer currentPage, Integer count) {
		super(Result.SUCCESS, Result.SUCCESS_MESSAGE, data);
		this.currentPageLimit = currentPageLimit;
		this.limits = limits;
		this.currentPage = currentPage;
		this.count = count;
	}

	public Integer getCurrentPageLimit() {
		return currentPageLimit;
	}

	public void setCurrentPageLimit(Integer currentPageLimit) {
		this.currentPageLimit = currentPageLimit;
	}

	public Integer getLimits() {
		return limits;
	}

	public void setLimits(Integer limits) {
		this.limits = limits;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}
}
