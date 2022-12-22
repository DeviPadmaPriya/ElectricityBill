package com.electricity.bill.ecxeption;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)

public class BillException extends RuntimeException {
	
private static final long serialVersionUID = 1L;
	
	public BillException(String message) {
		super(message);
	}

}
