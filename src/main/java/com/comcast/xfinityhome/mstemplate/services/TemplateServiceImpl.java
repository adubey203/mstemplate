package com.comcast.xfinityhome.mstemplate.services;

import com.comcast.xfinityhome.mstemplate.model.Template;
import com.comcast.xfinityhome.mstemplate.repository.TemplateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * This class is responsible to interact with
 * back end repositories(RDBMS, NoSQL, Server Side Micro-services etc.. )
 * using apache HTTP libraries
 * @author adubey203
 * @since 1/6/17
 */

@Service
public class TemplateServiceImpl implements TemplateService {

	@Autowired
	private TemplateRepository repository;

	@Override
	public Template getTemplate(String id) {


		//REST CALL TO OTHER SERVICE
		return repository.byId(id);
	}
}
