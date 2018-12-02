package com.singtel.simpleanimals.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RestController;

import com.singtel.simpleanimals.service.SimpleAnimalsService;


@RestController
public class SimpleAnimalsController {

	@Resource
	private SimpleAnimalsService lbsService;

	
}
