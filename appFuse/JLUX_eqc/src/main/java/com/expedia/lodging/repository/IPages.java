package com.expedia.lodging.repository;

import java.util.List;
import java.util.Map;

import com.expedia.lodging.entity.LocaleContent;
import com.expedia.lodging.entity.Pages;

public interface IPages {
	public List<Pages> findAll();
	
	/**
	 * key : value
	 * permalink : id
	 *     example :
	 *          
	 *          home : 1
	 *          connectivity : 2
	 *          contact : 3
	 *          etc
	 *     
	 * @return
	 */
	public Map<String,Integer> getPermalinkAndIdMapping();
	
	public LocaleContent findById(String id);
}
