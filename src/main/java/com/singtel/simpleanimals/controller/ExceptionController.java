package com.singtel.simpleanimals.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import com.singtel.simpleanimals.util.SimpleAnimalsUtil;

/**
 * @date 2018/10/28
 * @desc Error Handler
 */
@ControllerAdvice
@RestController
public class ExceptionController {

	private static Logger logger = LogManager.getLogger(SimpleAnimalsController.class);

	@ExceptionHandler(Exception.class)
	public Map<String, Object> hanleInternalError(HttpServletRequest httpServletRequest, Exception ex) {
		logger.error(ex);
		return SimpleAnimalsUtil.errorResponse(ex.getMessage());
	}

}