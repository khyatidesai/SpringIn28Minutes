package com.basicexample.spring.business.api;

import java.util.List;

import com.basic.example.spring.model.Todo;

public interface TodoBusinessService {
	List<Todo> retrieveTodosForNextWeek(String user);
}
