package com.expedia.lodging.connectivity.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "localized_nav_texts")
public class LocaleNavLink {

	@Id
    @GeneratedValue
	private int id;
	private int page_id;
	private int locale_id;
	private int author_id;
	private String nav_link_text;
	private Date created_at;
	private Date updated_at;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPage_id() {
		return page_id;
	}
	public void setPage_id(int page_id) {
		this.page_id = page_id;
	}
	public int getLocale_id() {
		return locale_id;
	}
	public void setLocale_id(int locale_id) {
		this.locale_id = locale_id;
	}
	public int getAuthor_id() {
		return author_id;
	}
	public void setAuthor_id(int author_id) {
		this.author_id = author_id;
	}
	public String getNav_link_text() {
		return nav_link_text;
	}
	public void setNav_link_text(String nav_link_text) {
		this.nav_link_text = nav_link_text;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	
	
	
}
