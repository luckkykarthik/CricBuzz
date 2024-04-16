package com.Cricket.Cricbuzz.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class matchIdNotExists extends RuntimeException{

	private static final long serialVersionUID = 1L;
	public matchIdNotExists(String msg){
		super(msg);
	}

}
