package com.bob.department.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class DepartmentNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public DepartmentNotFoundException(String message) {
		super(message);
	}
}
