package com.kf.data.mybatis.entity.online;

public class NeeqCompanyPatentOnlineWithBLOBs extends NeeqCompanyPatentOnline {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neeq_company_patent.address
     *
     * @mbggenerated Wed Mar 21 14:25:49 CST 2018
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neeq_company_patent.summary
     *
     * @mbggenerated Wed Mar 21 14:25:49 CST 2018
     */
    private String summary;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column neeq_company_patent.address
     *
     * @return the value of neeq_company_patent.address
     *
     * @mbggenerated Wed Mar 21 14:25:49 CST 2018
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column neeq_company_patent.address
     *
     * @param address the value for neeq_company_patent.address
     *
     * @mbggenerated Wed Mar 21 14:25:49 CST 2018
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column neeq_company_patent.summary
     *
     * @return the value of neeq_company_patent.summary
     *
     * @mbggenerated Wed Mar 21 14:25:49 CST 2018
     */
    public String getSummary() {
        return summary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column neeq_company_patent.summary
     *
     * @param summary the value for neeq_company_patent.summary
     *
     * @mbggenerated Wed Mar 21 14:25:49 CST 2018
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }
}