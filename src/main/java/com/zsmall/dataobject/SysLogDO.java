package com.zsmall.dataobject;

public class SysLogDO {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_LOG.id
     *
     * @mbggenerated Sun Aug 16 23:12:38 CST 2020
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_LOG.username
     *
     * @mbggenerated Sun Aug 16 23:12:38 CST 2020
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_LOG.operation
     *
     * @mbggenerated Sun Aug 16 23:12:38 CST 2020
     */
    private String operation;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_LOG.operatime
     *
     * @mbggenerated Sun Aug 16 23:12:38 CST 2020
     */
    private Long operatime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_LOG.method
     *
     * @mbggenerated Sun Aug 16 23:12:38 CST 2020
     */
    private String method;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_LOG.params
     *
     * @mbggenerated Sun Aug 16 23:12:38 CST 2020
     */
    private String params;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_LOG.ip
     *
     * @mbggenerated Sun Aug 16 23:12:38 CST 2020
     */
    private String ip;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_LOG.create_time
     *
     * @mbggenerated Sun Aug 16 23:12:38 CST 2020
     */
    private Long createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_LOG.id
     *
     * @return the value of SYS_LOG.id
     *
     * @mbggenerated Sun Aug 16 23:12:38 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_LOG.id
     *
     * @param id the value for SYS_LOG.id
     *
     * @mbggenerated Sun Aug 16 23:12:38 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_LOG.username
     *
     * @return the value of SYS_LOG.username
     *
     * @mbggenerated Sun Aug 16 23:12:38 CST 2020
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_LOG.username
     *
     * @param username the value for SYS_LOG.username
     *
     * @mbggenerated Sun Aug 16 23:12:38 CST 2020
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_LOG.operation
     *
     * @return the value of SYS_LOG.operation
     *
     * @mbggenerated Sun Aug 16 23:12:38 CST 2020
     */
    public String getOperation() {
        return operation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_LOG.operation
     *
     * @param operation the value for SYS_LOG.operation
     *
     * @mbggenerated Sun Aug 16 23:12:38 CST 2020
     */
    public void setOperation(String operation) {
        this.operation = operation == null ? null : operation.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_LOG.operatime
     *
     * @return the value of SYS_LOG.operatime
     *
     * @mbggenerated Sun Aug 16 23:12:38 CST 2020
     */
    public Long getOperatime() {
        return operatime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_LOG.operatime
     *
     * @param operatime the value for SYS_LOG.operatime
     *
     * @mbggenerated Sun Aug 16 23:12:38 CST 2020
     */
    public void setOperatime(Long operatime) {
        this.operatime = operatime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_LOG.method
     *
     * @return the value of SYS_LOG.method
     *
     * @mbggenerated Sun Aug 16 23:12:38 CST 2020
     */
    public String getMethod() {
        return method;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_LOG.method
     *
     * @param method the value for SYS_LOG.method
     *
     * @mbggenerated Sun Aug 16 23:12:38 CST 2020
     */
    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_LOG.params
     *
     * @return the value of SYS_LOG.params
     *
     * @mbggenerated Sun Aug 16 23:12:38 CST 2020
     */
    public String getParams() {
        return params;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_LOG.params
     *
     * @param params the value for SYS_LOG.params
     *
     * @mbggenerated Sun Aug 16 23:12:38 CST 2020
     */
    public void setParams(String params) {
        this.params = params == null ? null : params.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_LOG.ip
     *
     * @return the value of SYS_LOG.ip
     *
     * @mbggenerated Sun Aug 16 23:12:38 CST 2020
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_LOG.ip
     *
     * @param ip the value for SYS_LOG.ip
     *
     * @mbggenerated Sun Aug 16 23:12:38 CST 2020
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_LOG.create_time
     *
     * @return the value of SYS_LOG.create_time
     *
     * @mbggenerated Sun Aug 16 23:12:38 CST 2020
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_LOG.create_time
     *
     * @param createTime the value for SYS_LOG.create_time
     *
     * @mbggenerated Sun Aug 16 23:12:38 CST 2020
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}