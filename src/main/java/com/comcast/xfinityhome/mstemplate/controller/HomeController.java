package com.comcast.xfinityhome.mstemplate.controller;

import com.comcast.xfinityhome.mstemplate.services.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by adubey203 on 2/6/17.
 * This is a generic REST end point.
 * We could leverage this controller to fetch Health, Monitoring and Metering information.
 *
 */


@RestController
public class HomeController {


	@Autowired
	TemplateService service;

	@RequestMapping("/")
	public String index() {
		return "Welcome!!! This is Template Home";
	}


	@RequestMapping("/health")
	public String health() {
		return "I am Healthy... :)";
	}


	@RequestMapping("/status")
	public String status() {
		return " I am active ...";
	}

}
