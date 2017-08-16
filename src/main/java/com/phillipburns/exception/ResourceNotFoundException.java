package com.phillipburns.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends  RuntimeException {

    /**
	 * 
	 */
	private static final long serialVersionUID = -5672646735235963840L;

	public  ResourceNotFoundException(String msg){
        super(msg);
    }
}
