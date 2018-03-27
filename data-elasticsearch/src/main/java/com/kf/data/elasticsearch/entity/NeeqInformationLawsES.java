package com.kf.data.elasticsearch.entity;

import java.util.Date;

public class NeeqInformationLawsES {

	private Integer id;
	private String laws_id;
	private String laws_title;
	private String category_id;
	private String category_name;
	private String organization_id;
	private String organization;
	private String summary;
	private Integer effective_date_machine;
	private String effective_date;
	private String release_date_machine;
	private String release_date;
	private String deadline_date_machine;
	private String deadline_date;
	private String content;
	private String laws_url;
	private String appendix;
	private Boolean status;
	private String file_list;
	private String updated_at;
	private String created_at;

	public String getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLaws_id() {
		return laws_id;
	}

	public void setLaws_id(String laws_id) {
		this.laws_id = laws_id;
	}

	public String getLaws_title() {
		return laws_title;
	}

	public void setLaws_title(String laws_title) {
		this.laws_title = laws_title;
	}

	public String getCategory_id() {
		return category_id;
	}

	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}

	public String getCategory_name() {
		return category_name;
	}

	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}

	public String getOrganization_id() {
		return organization_id;
	}

	public void setOrganization_id(String organization_id) {
		this.organization_id = organization_id;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public Integer getEffective_date_machine() {
		return effective_date_machine;
	}

	public void setEffective_date_machine(Integer effective_date_machine) {
		this.effective_date_machine = effective_date_machine;
	}

	public String getEffective_date() {
		return effective_date;
	}

	public void setEffective_date(String effective_date) {
		this.effective_date = effective_date;
	}

	public String getRelease_date_machine() {
		return release_date_machine;
	}

	public void setRelease_date_machine(String release_date_machine) {
		this.release_date_machine = release_date_machine;
	}

	public String getRelease_date() {
		return release_date;
	}

	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}

	public String getDeadline_date_machine() {
		return deadline_date_machine;
	}

	public void setDeadline_date_machine(String deadline_date_machine) {
		this.deadline_date_machine = deadline_date_machine;
	}

	public String getDeadline_date() {
		return deadline_date;
	}

	public void setDeadline_date(String deadline_date) {
		this.deadline_date = deadline_date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getLaws_url() {
		return laws_url;
	}

	public void setLaws_url(String laws_url) {
		this.laws_url = laws_url;
	}

	public String getAppendix() {
		return appendix;
	}

	public void setAppendix(String appendix) {
		this.appendix = appendix;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getFile_list() {
		return file_list;
	}

	public void setFile_list(String file_list) {
		this.file_list = file_list;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

}