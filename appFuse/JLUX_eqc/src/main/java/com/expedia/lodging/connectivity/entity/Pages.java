package com.expedia.lodging.connectivity.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pages {
	
	@Id
    @GeneratedValue
	private int id;
	private String permalink;
	private int site_id;
	private int creator_id;
	private Date created_at;
	private Date updated_at;
	private int position;
	private int has_login;
	private int show_in_nav;
	private int has_dev_login_links;
	private int requires_user;
	private String nav_link_text;
	private int active;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPermalink() {
		return permalink;
	}
	public void setPermalink(String permalink) {
		this.permalink = permalink;
	}
	public int getSite_id() {
		return site_id;
	}
	public void setSite_id(int site_id) {
		this.site_id = site_id;
	}
	public int getCreator_id() {
		return creator_id;
	}
	public void setCreator_id(int creator_id) {
		this.creator_id = creator_id;
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
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public int getHas_login() {
		return has_login;
	}
	public void setHas_login(int has_login) {
		this.has_login = has_login;
	}
	public int getShow_in_nav() {
		return show_in_nav;
	}
	public void setShow_in_nav(int show_in_nav) {
		this.show_in_nav = show_in_nav;
	}
	public int getHas_dev_login_links() {
		return has_dev_login_links;
	}
	public void setHas_dev_login_links(int has_dev_login_links) {
		this.has_dev_login_links = has_dev_login_links;
	}
	public int getRequires_user() {
		return requires_user;
	}
	public void setRequires_user(int requires_user) {
		this.requires_user = requires_user;
	}
	public String getNav_link_text() {
		return nav_link_text;
	}
	public void setNav_link_text(String nav_link_text) {
		this.nav_link_text = nav_link_text;
	}
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
}
