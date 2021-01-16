package com.springboot.qa.qasystem.model;

import java.io.Serializable;
import java.util.Date;

public class Answer implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column answer.aid
     *
     * @mbg.generated
     */
    private Integer aid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column answer.uid
     *
     * @mbg.generated
     */
    private Integer uid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column answer.qid
     *
     * @mbg.generated
     */
    private Integer qid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column answer.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column answer.modify_time
     *
     * @mbg.generated
     */
    private Date modifyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column answer.ans_content
     *
     * @mbg.generated
     */
    private String ansContent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table answer
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column answer.aid
     *
     * @return the value of answer.aid
     *
     * @mbg.generated
     */
    public Integer getAid() {
        return aid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column answer.aid
     *
     * @param aid the value for answer.aid
     *
     * @mbg.generated
     */
    public void setAid(Integer aid) {
        this.aid = aid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column answer.uid
     *
     * @return the value of answer.uid
     *
     * @mbg.generated
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column answer.uid
     *
     * @param uid the value for answer.uid
     *
     * @mbg.generated
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column answer.qid
     *
     * @return the value of answer.qid
     *
     * @mbg.generated
     */
    public Integer getQid() {
        return qid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column answer.qid
     *
     * @param qid the value for answer.qid
     *
     * @mbg.generated
     */
    public void setQid(Integer qid) {
        this.qid = qid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column answer.create_time
     *
     * @return the value of answer.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column answer.create_time
     *
     * @param createTime the value for answer.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column answer.modify_time
     *
     * @return the value of answer.modify_time
     *
     * @mbg.generated
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column answer.modify_time
     *
     * @param modifyTime the value for answer.modify_time
     *
     * @mbg.generated
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column answer.ans_content
     *
     * @return the value of answer.ans_content
     *
     * @mbg.generated
     */
    public String getAnsContent() {
        return ansContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column answer.ans_content
     *
     * @param ansContent the value for answer.ans_content
     *
     * @mbg.generated
     */
    public void setAnsContent(String ansContent) {
        this.ansContent = ansContent == null ? null : ansContent.trim();
    }
}