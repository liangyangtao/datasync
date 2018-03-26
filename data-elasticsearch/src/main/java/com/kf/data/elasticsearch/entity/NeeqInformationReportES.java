package com.kf.data.elasticsearch.entity;

import java.util.Date;

public class NeeqInformationReportES {

	private Integer id;
	private String report_id;
	private String title;
	private String summay;
	private String publish_date;
	private Integer publish_date_machine;
	private String report_type_name;
	private String report_type_code;
	private String market_classification_code;
	private String spcurities_name;
	private String spcurities_id;
	private String code;
	private String code_id;
	private String sname;
	private String reporter;
	private String reporter_id;
	private String file_url;
	private String content;
	private String status;
	private Date created_at;
	private Date updated_at;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getReport_id() {
		return report_id;
	}
	public void setReport_id(String report_id) {
		this.report_id = report_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSummay() {
		return summay;
	}
	public void setSummay(String summay) {
		this.summay = summay;
	}
	public String getPublish_date() {
		return publish_date;
	}
	public void setPublish_date(String publish_date) {
		this.publish_date = publish_date;
	}
	public Integer getPublish_date_machine() {
		return publish_date_machine;
	}
	public void setPublish_date_machine(Integer publish_date_machine) {
		this.publish_date_machine = publish_date_machine;
	}
	public String getReport_type_name() {
		return report_type_name;
	}
	public void setReport_type_name(String report_type_name) {
		this.report_type_name = report_type_name;
	}
	
	public String getReport_type_code() {
		return report_type_code;
	}
	public void setReport_type_code(String report_type_code) {
		this.report_type_code = report_type_code;
	}
	public String getMarket_classification_code() {
		return market_classification_code;
	}
	public void setMarket_classification_code(String market_classification_code) {
		this.market_classification_code = market_classification_code;
	}
	public String getSpcurities_name() {
		return spcurities_name;
	}
	public void setSpcurities_name(String spcurities_name) {
		this.spcurities_name = spcurities_name;
	}
	public String getSpcurities_id() {
		return spcurities_id;
	}
	public void setSpcurities_id(String spcurities_id) {
		this.spcurities_id = spcurities_id;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCode_id() {
		return code_id;
	}
	public void setCode_id(String code_id) {
		this.code_id = code_id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getReporter() {
		return reporter;
	}
	public void setReporter(String reporter) {
		this.reporter = reporter;
	}
	public String getReporter_id() {
		return reporter_id;
	}
	public void setReporter_id(String reporter_id) {
		this.reporter_id = reporter_id;
	}
	public String getFile_url() {
		return file_url;
	}
	public void setFile_url(String file_url) {
		this.file_url = file_url;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
