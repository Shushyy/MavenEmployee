package com.phillipburns.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class BadRequestException extends  RuntimeException {

    /**
	 * 
	 */
	private static final long serialVersionUID = -3247937929274180140L;

	public BadRequestException(String msg){
        super(msg);
    }
}
