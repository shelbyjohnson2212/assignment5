package com.meritamerica.assignment4;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NegativeAmountException extends Exception {
	public NegativeAmountException() {
		super("NegativeAmountException");
	}
}