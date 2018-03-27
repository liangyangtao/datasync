package com.kf.data.elasticsearch.entity;

import java.util.Date;

/**
 * 
* @ClassName: NeeqCompanyNoticeES 
* @Description: TODO(公司公告 es ) 
* @author xuweichao 
* @date 2017年11月23日 下午3:42:50 
*
 */
public class NeeqNoticeES {
	private Integer id;
	private String companyid;
	private String notice_id;
	private String code;
	private String securities_id;
	private String company_name;
	private String disclosure_code;
	private String title;
	private String publish_date;
	private Integer publish_date_machine;
	private String file_path;
	private String file_ext;
	private String publish_type;
	private String notice_type_code;
	private String notice_type_name;
	private String notice_classification_first_level;
	private String notice_classification_second_level;
	private String notice_classification_first_level_name;
	private String notice_classification_second_level_name;
	private String positiveornegative;
	private String content;
	private String status;
	private int created_at;
	private int updated_at;
	private String html_path;
	
	public String getHtml_path() {
		return html_path;
	}
	public void setHtml_path(String html_path) {
		this.html_path = html_path;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getPublish_date_machine() {
		return publish_date_machine;
	}
	public void setPublish_date_machine(Integer publish_date_machine) {
		this.publish_date_machine = publish_date_machine;
	}
	
	
	public int getCreated_at() {
		return created_at;
	}
	public void setCreated_at(int created_at) {
		this.created_at = created_at;
	}
	public int getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(int updated_at) {
		this.updated_at = updated_at;
	}
	public String getCompanyid() {
		return companyid;
	}
	public void setCompanyid(String companyid) {
		this.companyid = companyid;
	}
	public String getNotice_id() {
		return notice_id;
	}
	public void setNotice_id(String notice_id) {
		this.notice_id = notice_id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getSecurities_id() {
		return securities_id;
	}
	public void setSecurities_id(String securities_id) {
		this.securities_id = securities_id;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getDisclosure_code() {
		return disclosure_code;
	}
	public void setDisclosure_code(String disclosure_code) {
		this.disclosure_code = disclosure_code;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublish_date() {
		return publish_date;
	}
	public void setPublish_date(String publish_date) {
		this.publish_date = publish_date;
	}
	public String getFile_path() {
		return file_path;
	}
	public void setFile_path(String file_path) {
		this.file_path = file_path;
	}
	public String getFile_ext() {
		return file_ext;
	}
	public void setFile_ext(String file_ext) {
		this.file_ext = file_ext;
	}
	public String getPublish_type() {
		return publish_type;
	}
	public void setPublish_type(String publish_type) {
		this.publish_type = publish_type;
	}
	public String getNotice_type_code() {
		return notice_type_code;
	}
	public void setNotice_type_code(String notice_type_code) {
		this.notice_type_code = notice_type_code;
	}
	public String getNotice_type_name() {
		return notice_type_name;
	}
	public void setNotice_type_name(String notice_type_name) {
		this.notice_type_name = notice_type_name;
	}
	public String getNotice_classification_first_level() {
		return notice_classification_first_level;
	}
	public void setNotice_classification_first_level(String notice_classification_first_level) {
		this.notice_classification_first_level = notice_classification_first_level;
	}
	public String getNotice_classification_second_level() {
		return notice_classification_second_level;
	}
	public void setNotice_classification_second_level(String notice_classification_second_level) {
		this.notice_classification_second_level = notice_classification_second_level;
	}
	public String getNotice_classification_first_level_name() {
		return notice_classification_first_level_name;
	}
	public void setNotice_classification_first_level_name(String notice_classification_first_level_name) {
		this.notice_classification_first_level_name = notice_classification_first_level_name;
	}
	public String getNotice_classification_second_level_name() {
		return notice_classification_second_level_name;
	}
	public void setNotice_classification_second_level_name(String notice_classification_second_level_name) {
		this.notice_classification_second_level_name = notice_classification_second_level_name;
	}
	public String getPositiveornegative() {
		return positiveornegative;
	}
	public void setPositiveornegative(String positiveornegative) {
		this.positiveornegative = positiveornegative;
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
	

}
