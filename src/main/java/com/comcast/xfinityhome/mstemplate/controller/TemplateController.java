package com.comcast.xfinityhome.mstemplate.controller;

import com.comcast.xfinityhome.mstemplate.services.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;


/**
 * Created by adubey203 on 2/6/17.
 * This is a REST end point for your defined "<MicroService>" e.g. TemplateMicroService;
 * to serve its domain specific requests.
 *
 * Please rename this controller according to the Domain/Request that
 * this micro-service end point needs to serve
 *
 */

@RestController
public class TemplateController {

	@Autowired
	private TemplateService service;

	@RequestMapping("/template/{id}")
	public String byId(@PathVariable("id") String id) {

		return String.format("The template requested is named : %s", service.getTemplate(id).getName());
	}

}
