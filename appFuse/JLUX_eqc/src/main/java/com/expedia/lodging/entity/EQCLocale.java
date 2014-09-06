package com.expedia.lodging.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "locales")
public class EQCLocale {
	
	
	@Id
    @GeneratedValue
	private int id;
	
	private int lang_id;
	
	private String name;
	
	private String code;
	
	private Date created_at;
	
	private Date updated_at;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getLang_id() {
		return lang_id;
	}
	public void setLang_id(int lang_id) {
		this.lang_id = lang_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
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
