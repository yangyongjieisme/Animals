package com.singtel.simpleanimals.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.singtel.simpleanimals.service.SimpleAnimalsService;
import com.singtel.simpleanimals.util.SimpleAnimalsUtil;

@RestController
public class SimpleAnimalsController {

	@Resource
	private SimpleAnimalsService service;

	@RequestMapping(value = "/getDuck", method = RequestMethod.GET)
	public Map<String, Object> getDuck() throws Exception {

		return SimpleAnimalsUtil.successResponse(service.getDuck());
	}
}
