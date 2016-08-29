package com.basic.spring.example1.dataservice.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.basic.spring.example1.database.Database;
import com.basic.spring.example1.dataservice.api.TodoDataService;

@Component
public class TodoDataServiceRealImpl implements TodoDataService {
	public List<String> retrieveTodos(String user) {
		return Database.retrieveTodos(user);
	}
}