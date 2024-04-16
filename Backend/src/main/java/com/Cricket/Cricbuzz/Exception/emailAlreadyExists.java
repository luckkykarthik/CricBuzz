package com.Cricket.Cricbuzz.Exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class emailAlreadyExists extends RuntimeException{
	private static final long serialVersionUID = 1L;
	public emailAlreadyExists(String message) {
        super(message);
    }

}
