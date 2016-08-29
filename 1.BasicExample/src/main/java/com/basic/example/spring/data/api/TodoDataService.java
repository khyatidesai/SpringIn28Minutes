package com.basic.example.spring.data.api;

import java.util.List;

import com.basic.example.spring.model.Todo;

public interface TodoDataService {
	List<Todo> retrieveTodos(String userName);
}
