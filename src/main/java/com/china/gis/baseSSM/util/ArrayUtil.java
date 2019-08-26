package com.china.gis.baseSSM.util;

import java.util.List;

/**   
 * @ClassName:	ArrayUtils   
 * @Description:	数组工具
 * @author:	GG42
 * @date:	2019年8月13日 下午5:00:28      
 * @Copyright:  上海城地
 */
public class ArrayUtil {
	/**   
	 * @Title:	isEmpty   
	 * @Description:	是否为空
	 * @param <T>	任意类
	 * @param list	List 
	 * @return
	 */
	public static <T> Boolean isEmpty(List<T> list) {
		Boolean hasEmpty = true;
		if(list!=null&&list.size()!=0) {
			hasEmpty = false;
		}
		return hasEmpty;
	}
}
