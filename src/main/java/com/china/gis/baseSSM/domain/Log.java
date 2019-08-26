package com.china.gis.baseSSM.domain;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 
 * @ClassName: Log
 * @Description: 日志类
 * @author: GG42
 * @date: 2019年8月2日 下午5:02:52
 * @Copyright: 上海城地
 */
@JsonIgnoreProperties({ "id" })
public class Log implements Serializable {

	/**
	 * serialVersionUID: 序列ID
	 */
	private static final long serialVersionUID = -8914325519446672317L;

	/**
	 * id: 主键
	 */
	private String logId;

	/**
	 * operatopCode: 操作者
	 */
	private String operatopAccount;

	/**
	 * clientIP: 调用IP地址
	 */
	private String clientIP;

	/**
	 * operatopInterface: 访问接口
	 */
	private String operatopInterface;

	/**
	 * operatopClassName: 类名
	 */
	private String operatopClassName;

	/**
	 * operatopMethodName: 方法名
	 */
	private String operatopMethodName;

	/**
	 * operatopDate: 调用时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date operatopDate;

	/**
	 * operatopException: 异常
	 */
	private String operatopException;

	/**
	 * timeConsuming: 操作耗时
	 */
	private String timeConsuming;

	public Log() {
		super();
	}

	public Log(String logId, String operatopAccount, String clientIP, String operatopInterface,
			String operatopClassName, String operatopMethodName, Date operatopDate, String operatopException,
			String timeConsuming) {
		super();
		this.logId = logId;
		this.operatopAccount = operatopAccount;
		this.clientIP = clientIP;
		this.operatopInterface = operatopInterface;
		this.operatopClassName = operatopClassName;
		this.operatopMethodName = operatopMethodName;
		this.operatopDate = operatopDate;
		this.operatopException = operatopException;
		this.timeConsuming = timeConsuming;
	}

	public String getOperatopInterface() {
		return operatopInterface;
	}

	public void setOperatopInterface(String operatopInterface) {
		this.operatopInterface = operatopInterface;
	}

	public String getLogId() {
		return logId;
	}

	public void setLogId(String logId) {
		this.logId = logId;
	}

	public String getOperatopAccount() {
		return operatopAccount;
	}

	public void setOperatopAccount(String operatopAccount) {
		this.operatopAccount = operatopAccount;
	}

	public String getClientIP() {
		return clientIP;
	}

	public void setClientIP(String clientIP) {
		this.clientIP = clientIP;
	}

	public String getOperatopClassName() {
		return operatopClassName;
	}

	public void setOperatopClassName(String operatopClassName) {
		this.operatopClassName = operatopClassName;
	}

	public String getOperatopMethodName() {
		return operatopMethodName;
	}

	public void setOperatopMethodName(String operatopMethodName) {
		this.operatopMethodName = operatopMethodName;
	}

	public Date getOperatopDate() {
		return operatopDate;
	}

	public void setOperatopDate(Date operatopDate) {
		this.operatopDate = operatopDate;
	}

	public String getOperatopException() {
		return operatopException;
	}

	public void setOperatopException(String operatopException) {
		this.operatopException = operatopException;
	}

	public String getTimeConsuming() {
		return timeConsuming;
	}

	public void setTimeConsuming(String timeConsuming) {
		this.timeConsuming = timeConsuming;
	}

	@Override
	public String toString() {
		return "操作者:" + operatopAccount + "\t 访问IP:" + clientIP + "\t 类名:" + operatopClassName + "\t 方法名:"
				+ operatopMethodName + "\t 时间:" + operatopDate + "\t 异常:" + operatopException + "\t 耗时:"
				+ timeConsuming;
	}

}
