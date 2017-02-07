package com.comcast.xfinityhome.mstemplate.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

/**
 * Allow the controller to return a 404 if an Template is not found by simply
 * throwing this exception.
 * The @ResponseStatus causes Spring MVC to return a
 * 404 instead of the usual 500.
 * 
 * @author adueby203
 */

@ResponseStatus(HttpStatus.NOT_FOUND)
public class TemplateNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public TemplateNotFoundException(String templateId) {
		super("Template Not Found Exception :- Template Id:" + templateId);
	}
}
