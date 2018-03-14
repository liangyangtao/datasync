package com.kf.data.mybatis.entity.online;

import java.util.Date;

public class NeeqCompanyResearchStatOnline {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neeq_company_research_stat.id
     *
     * @mbggenerated Wed Mar 14 10:15:26 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neeq_company_research_stat.company_id
     *
     * @mbggenerated Wed Mar 14 10:15:26 CST 2018
     */
    private String companyId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neeq_company_research_stat.company_shortname
     *
     * @mbggenerated Wed Mar 14 10:15:26 CST 2018
     */
    private String companyShortname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neeq_company_research_stat.stock_code
     *
     * @mbggenerated Wed Mar 14 10:15:26 CST 2018
     */
    private String stockCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neeq_company_research_stat.date
     *
     * @mbggenerated Wed Mar 14 10:15:26 CST 2018
     */
    private Date date;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neeq_company_research_stat.research_expense_amount
     *
     * @mbggenerated Wed Mar 14 10:15:26 CST 2018
     */
    private Double researchExpenseAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neeq_company_research_stat.research_expense_ratio
     *
     * @mbggenerated Wed Mar 14 10:15:26 CST 2018
     */
    private Double researchExpenseRatio;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neeq_company_research_stat.research_expense_amount_pre
     *
     * @mbggenerated Wed Mar 14 10:15:26 CST 2018
     */
    private Double researchExpenseAmountPre;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neeq_company_research_stat.research_expense_ratio_pre
     *
     * @mbggenerated Wed Mar 14 10:15:26 CST 2018
     */
    private Double researchExpenseRatioPre;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neeq_company_research_stat.status
     *
     * @mbggenerated Wed Mar 14 10:15:26 CST 2018
     */
    private Byte status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neeq_company_research_stat.created_at
     *
     * @mbggenerated Wed Mar 14 10:15:26 CST 2018
     */
    private Date createdAt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neeq_company_research_stat.updated_at
     *
     * @mbggenerated Wed Mar 14 10:15:26 CST 2018
     */
    private Date updatedAt;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column neeq_company_research_stat.id
     *
     * @return the value of neeq_company_research_stat.id
     *
     * @mbggenerated Wed Mar 14 10:15:26 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column neeq_company_research_stat.id
     *
     * @param id the value for neeq_company_research_stat.id
     *
     * @mbggenerated Wed Mar 14 10:15:26 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column neeq_company_research_stat.company_id
     *
     * @return the value of neeq_company_research_stat.company_id
     *
     * @mbggenerated Wed Mar 14 10:15:26 CST 2018
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column neeq_company_research_stat.company_id
     *
     * @param companyId the value for neeq_company_research_stat.company_id
     *
     * @mbggenerated Wed Mar 14 10:15:26 CST 2018
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column neeq_company_research_stat.company_shortname
     *
     * @return the value of neeq_company_research_stat.company_shortname
     *
     * @mbggenerated Wed Mar 14 10:15:26 CST 2018
     */
    public String getCompanyShortname() {
        return companyShortname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column neeq_company_research_stat.company_shortname
     *
     * @param companyShortname the value for neeq_company_research_stat.company_shortname
     *
     * @mbggenerated Wed Mar 14 10:15:26 CST 2018
     */
    public void setCompanyShortname(String companyShortname) {
        this.companyShortname = companyShortname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column neeq_company_research_stat.stock_code
     *
     * @return the value of neeq_company_research_stat.stock_code
     *
     * @mbggenerated Wed Mar 14 10:15:26 CST 2018
     */
    public String getStockCode() {
        return stockCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column neeq_company_research_stat.stock_code
     *
     * @param stockCode the value for neeq_company_research_stat.stock_code
     *
     * @mbggenerated Wed Mar 14 10:15:26 CST 2018
     */
    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column neeq_company_research_stat.date
     *
     * @return the value of neeq_company_research_stat.date
     *
     * @mbggenerated Wed Mar 14 10:15:26 CST 2018
     */
    public Date getDate() {
        return date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column neeq_company_research_stat.date
     *
     * @param date the value for neeq_company_research_stat.date
     *
     * @mbggenerated Wed Mar 14 10:15:26 CST 2018
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column neeq_company_research_stat.research_expense_amount
     *
     * @return the value of neeq_company_research_stat.research_expense_amount
     *
     * @mbggenerated Wed Mar 14 10:15:26 CST 2018
     */
    public Double getResearchExpenseAmount() {
        return researchExpenseAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column neeq_company_research_stat.research_expense_amount
     *
     * @param researchExpenseAmount the value for neeq_company_research_stat.research_expense_amount
     *
     * @mbggenerated Wed Mar 14 10:15:26 CST 2018
     */
    public void setResearchExpenseAmount(Double researchExpenseAmount) {
        this.researchExpenseAmount = researchExpenseAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column neeq_company_research_stat.research_expense_ratio
     *
     * @return the value of neeq_company_research_stat.research_expense_ratio
     *
     * @mbggenerated Wed Mar 14 10:15:26 CST 2018
     */
    public Double getResearchExpenseRatio() {
        return researchExpenseRatio;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column neeq_company_research_stat.research_expense_ratio
     *
     * @param researchExpenseRatio the value for neeq_company_research_stat.research_expense_ratio
     *
     * @mbggenerated Wed Mar 14 10:15:26 CST 2018
     */
    public void setResearchExpenseRatio(Double researchExpenseRatio) {
        this.researchExpenseRatio = researchExpenseRatio;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column neeq_company_research_stat.research_expense_amount_pre
     *
     * @return the value of neeq_company_research_stat.research_expense_amount_pre
     *
     * @mbggenerated Wed Mar 14 10:15:26 CST 2018
     */
    public Double getResearchExpenseAmountPre() {
        return researchExpenseAmountPre;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column neeq_company_research_stat.research_expense_amount_pre
     *
     * @param researchExpenseAmountPre the value for neeq_company_research_stat.research_expense_amount_pre
     *
     * @mbggenerated Wed Mar 14 10:15:26 CST 2018
     */
    public void setResearchExpenseAmountPre(Double researchExpenseAmountPre) {
        this.researchExpenseAmountPre = researchExpenseAmountPre;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column neeq_company_research_stat.research_expense_ratio_pre
     *
     * @return the value of neeq_company_research_stat.research_expense_ratio_pre
     *
     * @mbggenerated Wed Mar 14 10:15:26 CST 2018
     */
    public Double getResearchExpenseRatioPre() {
        return researchExpenseRatioPre;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column neeq_company_research_stat.research_expense_ratio_pre
     *
     * @param researchExpenseRatioPre the value for neeq_company_research_stat.research_expense_ratio_pre
     *
     * @mbggenerated Wed Mar 14 10:15:26 CST 2018
     */
    public void setResearchExpenseRatioPre(Double researchExpenseRatioPre) {
        this.researchExpenseRatioPre = researchExpenseRatioPre;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column neeq_company_research_stat.status
     *
     * @return the value of neeq_company_research_stat.status
     *
     * @mbggenerated Wed Mar 14 10:15:26 CST 2018
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column neeq_company_research_stat.status
     *
     * @param status the value for neeq_company_research_stat.status
     *
     * @mbggenerated Wed Mar 14 10:15:26 CST 2018
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column neeq_company_research_stat.created_at
     *
     * @return the value of neeq_company_research_stat.created_at
     *
     * @mbggenerated Wed Mar 14 10:15:26 CST 2018
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column neeq_company_research_stat.created_at
     *
     * @param createdAt the value for neeq_company_research_stat.created_at
     *
     * @mbggenerated Wed Mar 14 10:15:26 CST 2018
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column neeq_company_research_stat.updated_at
     *
     * @return the value of neeq_company_research_stat.updated_at
     *
     * @mbggenerated Wed Mar 14 10:15:26 CST 2018
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column neeq_company_research_stat.updated_at
     *
     * @param updatedAt the value for neeq_company_research_stat.updated_at
     *
     * @mbggenerated Wed Mar 14 10:15:26 CST 2018
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}