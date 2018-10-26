package com.simon.cloud.word.api.entities;

import java.util.Date;

public class UrpUserBase {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column urp_user_base.id
     *
     * @mbg.generated Thu Oct 25 09:26:00 CST 2018
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column urp_user_base.user_name
     *
     * @mbg.generated Thu Oct 25 09:26:00 CST 2018
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column urp_user_base.user_real_name
     *
     * @mbg.generated Thu Oct 25 09:26:00 CST 2018
     */
    private String userRealName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column urp_user_base.email
     *
     * @mbg.generated Thu Oct 25 09:26:00 CST 2018
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column urp_user_base.phone
     *
     * @mbg.generated Thu Oct 25 09:26:00 CST 2018
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column urp_user_base.add_time
     *
     * @mbg.generated Thu Oct 25 09:26:00 CST 2018
     */
    private Date addTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column urp_user_base.user_status
     *
     * @mbg.generated Thu Oct 25 09:26:00 CST 2018
     */
    private String userStatus;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column urp_user_base.id
     *
     * @return the value of urp_user_base.id
     *
     * @mbg.generated Thu Oct 25 09:26:00 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column urp_user_base.id
     *
     * @param id the value for urp_user_base.id
     *
     * @mbg.generated Thu Oct 25 09:26:00 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column urp_user_base.user_name
     *
     * @return the value of urp_user_base.user_name
     *
     * @mbg.generated Thu Oct 25 09:26:00 CST 2018
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column urp_user_base.user_name
     *
     * @param userName the value for urp_user_base.user_name
     *
     * @mbg.generated Thu Oct 25 09:26:00 CST 2018
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column urp_user_base.user_real_name
     *
     * @return the value of urp_user_base.user_real_name
     *
     * @mbg.generated Thu Oct 25 09:26:00 CST 2018
     */
    public String getUserRealName() {
        return userRealName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column urp_user_base.user_real_name
     *
     * @param userRealName the value for urp_user_base.user_real_name
     *
     * @mbg.generated Thu Oct 25 09:26:00 CST 2018
     */
    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName == null ? null : userRealName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column urp_user_base.email
     *
     * @return the value of urp_user_base.email
     *
     * @mbg.generated Thu Oct 25 09:26:00 CST 2018
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column urp_user_base.email
     *
     * @param email the value for urp_user_base.email
     *
     * @mbg.generated Thu Oct 25 09:26:00 CST 2018
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column urp_user_base.phone
     *
     * @return the value of urp_user_base.phone
     *
     * @mbg.generated Thu Oct 25 09:26:00 CST 2018
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column urp_user_base.phone
     *
     * @param phone the value for urp_user_base.phone
     *
     * @mbg.generated Thu Oct 25 09:26:00 CST 2018
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column urp_user_base.add_time
     *
     * @return the value of urp_user_base.add_time
     *
     * @mbg.generated Thu Oct 25 09:26:00 CST 2018
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column urp_user_base.add_time
     *
     * @param addTime the value for urp_user_base.add_time
     *
     * @mbg.generated Thu Oct 25 09:26:00 CST 2018
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column urp_user_base.user_status
     *
     * @return the value of urp_user_base.user_status
     *
     * @mbg.generated Thu Oct 25 09:26:00 CST 2018
     */
    public String getUserStatus() {
        return userStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column urp_user_base.user_status
     *
     * @param userStatus the value for urp_user_base.user_status
     *
     * @mbg.generated Thu Oct 25 09:26:00 CST 2018
     */
    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus == null ? null : userStatus.trim();
    }
}