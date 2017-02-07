package com.comcast.xfinityhome.mstemplate.repository;

import com.comcast.xfinityhome.mstemplate.exceptions.TemplateNotFoundException;
import com.comcast.xfinityhome.mstemplate.model.Template;
import org.springframework.stereotype.Component;

/**
 * Repository - Could use any data source (RDBMS, NoSQL, data pipe).
 * @author adubey203
 */


@Component
public class TemplateRepositoryImpl implements TemplateRepository{

	/**
	 * Find an Template Id.
	 *
	 * @param  id
	 * @return Template
	 */
	public Template byId(String id){
		if(!"10".equals(id)) {
			throw new TemplateNotFoundException(id);
		}

		Template template = new Template(id);
		template.setName("Micro Service based API's");
		return template;
	}

}
