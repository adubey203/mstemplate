package com.comcast.xfinityhome.mstemplate.repository;

import com.comcast.xfinityhome.mstemplate.model.Template;

/**
 * Repository - Could use any data source (RDBMS, NoSQL, Rest EndPoint, data pipe).
 * @author adubey203
 */

public interface TemplateRepository {

	/**
	 * Find an Template Id.
	 *
	 * @param  id
	 * @return Template
	 */
	public Template byId(String id);

}
