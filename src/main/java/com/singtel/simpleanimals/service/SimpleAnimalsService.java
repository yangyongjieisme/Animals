package com.singtel.simpleanimals.service;

import org.springframework.stereotype.Service;

import com.singtel.simpleanimals.model.Duck;

/**
 *
 * @date 2018/12/03
 * @desc business logic
 */
@Service
public class SimpleAnimalsService {
   
	public Duck getDuck() {
		
		return new Duck();
	}
	
}

