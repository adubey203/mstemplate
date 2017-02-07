package com.comcast.xfinityhome.mstemplate.controller;

import com.comcast.xfinityhome.mstemplate.services.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;


/**
 * Created by adubey203 on 2/6/17.
 *
 * Rnam
 */

@RestController
public class TemplateController {

	@Autowired
	TemplateService service;

	@RequestMapping("/template/{id}")
	public String byId(@PathVariable("id") String id) {

		return String.format("The template requested is named : %s", service.getTemplate(id).getName());
	}

}
