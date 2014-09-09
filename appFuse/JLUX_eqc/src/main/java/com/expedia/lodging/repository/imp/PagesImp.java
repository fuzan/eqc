package com.expedia.lodging.repository.imp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.expedia.lodging.entity.Pages;
import com.expedia.lodging.repository.IPages;

public class PagesImp extends RepositoryBase implements IPages{

	public List<Pages> findAll() {
		return entityManager.createQuery("from Pages",Pages.class).getResultList();
	}

	public Map<String, Integer> getPermalinkAndIdMapping() {
		Map<String,Integer> map = null;
		List<Pages> list =  findAll();
		if( list != null && list.size() > 0 ){
			map = new HashMap<String,Integer>();
			for(Pages pages : list){
				map.put(pages.getPermalink(), pages.getId());
			}
		}
		return map;
	}

	public Pages findById(int id) {
		// TODO Auto-generated method stub
		return entityManager.createQuery("from Pages p where p.id = ? ",Pages.class).setParameter(1, id).getSingleResult();
	}

	
	public Map<String,String> getPermalinkAndTextMapping(){
		Map<String,String> map = null;
		List<Pages> list =  findAll();
		if( list != null && list.size() > 0 ){
			map = new HashMap<String,String>();
			for(Pages pages : list){
				map.put(pages.getPermalink(), pages.getNav_link_text());
			}
		}
		return map;
	}

	public Pages findByPermalink(String link) {
		// TODO Auto-generated method stub
		return entityManager.createQuery("from Pages p where p.permalink = ? ",Pages.class).setParameter(1, link).getSingleResult();
	}
	
}
