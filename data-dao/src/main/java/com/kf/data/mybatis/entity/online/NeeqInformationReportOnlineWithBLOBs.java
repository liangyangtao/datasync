package com.kf.data.mybatis.entity.online;

public class NeeqInformationReportOnlineWithBLOBs extends NeeqInformationReportOnline {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neeq_information_report.summay
     *
     * @mbggenerated Thu Mar 22 16:38:54 CST 2018
     */
    private String summay;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neeq_information_report.content
     *
     * @mbggenerated Thu Mar 22 16:38:54 CST 2018
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column neeq_information_report.summay
     *
     * @return the value of neeq_information_report.summay
     *
     * @mbggenerated Thu Mar 22 16:38:54 CST 2018
     */
    public String getSummay() {
        return summay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column neeq_information_report.summay
     *
     * @param summay the value for neeq_information_report.summay
     *
     * @mbggenerated Thu Mar 22 16:38:54 CST 2018
     */
    public void setSummay(String summay) {
        this.summay = summay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column neeq_information_report.content
     *
     * @return the value of neeq_information_report.content
     *
     * @mbggenerated Thu Mar 22 16:38:54 CST 2018
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column neeq_information_report.content
     *
     * @param content the value for neeq_information_report.content
     *
     * @mbggenerated Thu Mar 22 16:38:54 CST 2018
     */
    public void setContent(String content) {
        this.content = content;
    }
}