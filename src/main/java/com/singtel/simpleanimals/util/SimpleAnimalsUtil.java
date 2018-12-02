package com.singtel.simpleanimals.util;

import java.util.HashMap;
import java.util.Map;

/**
 * @date 2018/12/03
 * @desc utility class
 */
public class SimpleAnimalsUtil {
	

	/**
	 * @date 2018/12/03
	 * @desc wrap good response
	 */
	public static Map<String, Object> successResponse(Object data) {

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("status", 200);
		map.put("data", data);
		return map;

	}
	/**
	 * @date 2018/12/03
	 * @desc wrap bad response
	 */
	public static Map<String, Object> errorResponse(String message) {

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("status", -1);
		map.put("messge", message);
		return map;
	}
}
