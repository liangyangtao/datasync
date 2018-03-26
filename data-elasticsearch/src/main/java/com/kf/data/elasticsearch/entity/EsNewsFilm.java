package com.kf.data.elasticsearch.entity;

import java.util.Date;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/***
 * 
 * 
 * @Title: EsNewsFilm.java
 * @Package com.kf.data.elasticsearch.entity
 * @Description: 公司新闻实体
 * @author liangyt
 * @date 2017年11月8日 下午5:30:37
 * @version V1.0
 */
public class EsNewsFilm {

	private int created_at;
	private String if_unfavourable;
	private String relate_industry;
	private String for_or_against_name;
	private String tag;
	private String for_or_against_code;
	private String file_list;
	private String subjectivity_code;
	private String images_list;
	private String title;
	private String company_id;
	private String content;
	private String source;
	private String company_name;
	private String real_cource;
	private int status;
	private String subjectivity_name;
	private int updated_at;
	private String subjectity_name;
	private String category_name;
	private Date release_date;
	private String author;
	private String summary;
	private String news_id;
	private String author_id;
	private String category_id;
	private String relate_industry_id;

	public int getCreated_at() {
		return created_at;
	}

	public void setCreated_at(int created_at) {
		this.created_at = created_at;
	}

	public String getIf_unfavourable() {
		return if_unfavourable;
	}

	public void setIf_unfavourable(String if_unfavourable) {
		this.if_unfavourable = if_unfavourable;
	}

	public String getRelate_industry() {
		return relate_industry;
	}

	public void setRelate_industry(String relate_industry) {
		this.relate_industry = relate_industry;
	}

	public String getFor_or_against_name() {
		return for_or_against_name;
	}

	public void setFor_or_against_name(String for_or_against_name) {
		this.for_or_against_name = for_or_against_name;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getFor_or_against_code() {
		return for_or_against_code;
	}

	public void setFor_or_against_code(String for_or_against_code) {
		this.for_or_against_code = for_or_against_code;
	}

	public String getFile_list() {
		return file_list;
	}

	public void setFile_list(String file_list) {
		this.file_list = file_list;
	}

	public String getSubjectivity_code() {
		return subjectivity_code;
	}

	public void setSubjectivity_code(String subjectivity_code) {
		this.subjectivity_code = subjectivity_code;
	}

	public String getImages_list() {
		return images_list;
	}

	public void setImages_list(String images_list) {
		this.images_list = images_list;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCompany_id() {
		return company_id;
	}

	public void setCompany_id(String company_id) {
		this.company_id = company_id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getReal_cource() {
		return real_cource;
	}

	public void setReal_cource(String real_cource) {
		this.real_cource = real_cource;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getSubjectivity_name() {
		return subjectivity_name;
	}

	public void setSubjectivity_name(String subjectivity_name) {
		this.subjectivity_name = subjectivity_name;
	}

	public int getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(int updated_at) {
		this.updated_at = updated_at;
	}

	public String getSubjectity_name() {
		return subjectity_name;
	}

	public void setSubjectity_name(String subjectity_name) {
		this.subjectity_name = subjectity_name;
	}

	public String getCategory_name() {
		return category_name;
	}

	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}

	public Date getRelease_date() {
		return release_date;
	}

	public void setRelease_date(Date release_date) {
		this.release_date = release_date;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getNews_id() {
		return news_id;
	}

	public void setNews_id(String news_id) {
		this.news_id = news_id;
	}

	public String getAuthor_id() {
		return author_id;
	}

	public void setAuthor_id(String author_id) {
		this.author_id = author_id;
	}

	public String getCategory_id() {
		return category_id;
	}

	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}

	public String getRelate_industry_id() {
		return relate_industry_id;
	}

	public void setRelate_industry_id(String relate_industry_id) {
		this.relate_industry_id = relate_industry_id;
	}

	public String toJsonString() {
		Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss").create();
		return gson.toJson(this);
	}

}
