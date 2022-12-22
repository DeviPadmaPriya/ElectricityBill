package com.cg.consumer.exceptions;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ConsumerException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public ConsumerException(String message) {
		super(message);
	}
}

