package com.china.gis.baseSSM.common.constant;

import org.apache.commons.lang3.StringUtils;
/**
 * 第三方用户状态
 * @author gg42
 *
 */
public enum UserStateConstant {
	/**
	 * 未激活
	 */
	NOT_ACTIVE(0, "未激活"),
	/**
	 * 已激活
	 */
	ACTIVATED(1, "已激活"),
	/**
	 * 已过期
	 */
	OUT_OF_DATE(2, "已过期"),
	/**
	 * 已注销
	 */
	BE_A_BAD_ASS(3, "已注销"),
	/**
	 * 未知状态
	 */
	UNKNOWN_STATE(-1, "未知状态");
	private  int userStateNumber;
	private  String userStateName;

	private UserStateConstant(int userStateNumber, String userStateName) {
		this.userStateName = userStateName;
		this.userStateNumber = userStateNumber;
	}

	/**
	 * 通过UserStateNumber取枚举
	 * 
	 * @param value
	 * @return
	 */
	public static UserStateConstant getTypeByStateNumber(int userStateNumber) {
		for (UserStateConstant enums : UserStateConstant.values()) {
			if (enums.getUserStateNumer() == userStateNumber) {
				return enums;
			}
		}
		return null;
	}

	/**
	 * 通过UserStateName取枚举
	 * 
	 * @param value
	 * @return
	 */
	public static UserStateConstant getTypeByStateName(String userStateName) {
		if (StringUtils.isEmpty(userStateName)) {
			return null;
		}
		for (UserStateConstant enums : UserStateConstant.values()) {
			if (enums.getUserStateName().equals(userStateName)) {
				return enums;
			}
		}
		return null;
	}

	/**
	 * 通过userStateNumber取 用户状态描述
	 * 
	 * @param userStateNumber
	 * @return
	 */
	public static String getStateNameByStateNumber(int userStateNumber) {
		for (UserStateConstant enums : UserStateConstant.values()) {
			if (enums.getUserStateNumer() == userStateNumber) {
				return enums.getUserStateName();
			}
		}
		return UNKNOWN_STATE.getUserStateName();
	}

	/**
	 * 通过userStateName取 用户状态码
	 * 
	 * @param userStateName
	 * @return
	 */
	public static int getStateNumberByStateName(String userStateName) {
		if (StringUtils.isEmpty(userStateName)) {
			return UNKNOWN_STATE.getUserStateNumer();
		}
		for (UserStateConstant enums : UserStateConstant.values()) {
			if (enums.getUserStateName().equals(userStateName)) {
				return enums.getUserStateNumer();
			}
		}
		return UNKNOWN_STATE.getUserStateNumer();
	}

	/**
	 * 判断用户状态是否为合法状态,是则返回原状态码,否则返回int型 -1
	 * 
	 * @param stateNumber 判断码
	 * @return int
	 */
	public static int existUserStateNumber(int stateNumber) {
		for (UserStateConstant enums : UserStateConstant.values()) {
			if (enums.getUserStateNumer() == stateNumber) {
				return stateNumber;
			}
		}
		return UNKNOWN_STATE.getUserStateNumer();
	}

	/**
	 * 判断用户状态是否为合法状态,是则返回原状态码,否则返回String型 -1
	 * 
	 * @param stateNumber 判断码
	 * @return String
	 */
	public static String existUserStateNumber(String stateNumber) {
		if (StringUtils.isEmpty(stateNumber)) {
			return String.valueOf(UNKNOWN_STATE.getUserStateNumer());
		}
		Integer number = Integer.parseInt(stateNumber);
		for (UserStateConstant enums : UserStateConstant.values()) {
			if (enums.getUserStateNumer() == number) {
				return String.valueOf(enums.getUserStateNumer());
			}
		}
		return String.valueOf(UNKNOWN_STATE.getUserStateNumer());
	}

	public String getUserStateName() {
		return userStateName;
	}

	public int getUserStateNumer() {
		return userStateNumber;
	}
}
