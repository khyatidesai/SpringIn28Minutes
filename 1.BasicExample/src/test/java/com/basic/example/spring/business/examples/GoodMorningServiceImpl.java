package com.basic.example.spring.business.examples;

import org.springframework.stereotype.Component;

@Component
public class GoodMorningServiceImpl implements HiService {
	@Override
	public String sayHi() {
		return "Good Morning";
	}
}
