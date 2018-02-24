package org.ko.prototype.data.bean.domain;

import java.io.Serializable;
import java.util.Date;

public class Thirdparty extends AbstractDomain implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_thirdparty.id
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_thirdparty.user_id
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_thirdparty.third_name
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private String thirdName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_thirdparty.password
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_thirdparty.type
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private Short type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_thirdparty.enable_status
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private Short enableStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_thirdparty.trace_code_i
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private String traceCodeI;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_thirdparty.trace_code_u
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private String traceCodeU;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_thirdparty.host_name
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private String hostName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_thirdparty.create_user_id
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private Integer createUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_thirdparty.create_by
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private String createBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_thirdparty.create_date
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_thirdparty.update_user_id
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private Integer updateUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_thirdparty.update_by
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private String updateBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_thirdparty.update_date
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private Date updateDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table art_thirdparty
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_thirdparty.id
     *
     * @return the value of art_thirdparty.id
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_thirdparty.id
     *
     * @param id the value for art_thirdparty.id
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_thirdparty.user_id
     *
     * @return the value of art_thirdparty.user_id
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_thirdparty.user_id
     *
     * @param userId the value for art_thirdparty.user_id
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_thirdparty.third_name
     *
     * @return the value of art_thirdparty.third_name
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public String getThirdName() {
        return thirdName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_thirdparty.third_name
     *
     * @param thirdName the value for art_thirdparty.third_name
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setThirdName(String thirdName) {
        this.thirdName = thirdName == null ? null : thirdName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_thirdparty.password
     *
     * @return the value of art_thirdparty.password
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_thirdparty.password
     *
     * @param password the value for art_thirdparty.password
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_thirdparty.type
     *
     * @return the value of art_thirdparty.type
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public Short getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_thirdparty.type
     *
     * @param type the value for art_thirdparty.type
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setType(Short type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_thirdparty.enable_status
     *
     * @return the value of art_thirdparty.enable_status
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public Short getEnableStatus() {
        return enableStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_thirdparty.enable_status
     *
     * @param enableStatus the value for art_thirdparty.enable_status
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setEnableStatus(Short enableStatus) {
        this.enableStatus = enableStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_thirdparty.trace_code_i
     *
     * @return the value of art_thirdparty.trace_code_i
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public String getTraceCodeI() {
        return traceCodeI;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_thirdparty.trace_code_i
     *
     * @param traceCodeI the value for art_thirdparty.trace_code_i
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setTraceCodeI(String traceCodeI) {
        this.traceCodeI = traceCodeI == null ? null : traceCodeI.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_thirdparty.trace_code_u
     *
     * @return the value of art_thirdparty.trace_code_u
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public String getTraceCodeU() {
        return traceCodeU;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_thirdparty.trace_code_u
     *
     * @param traceCodeU the value for art_thirdparty.trace_code_u
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setTraceCodeU(String traceCodeU) {
        this.traceCodeU = traceCodeU == null ? null : traceCodeU.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_thirdparty.host_name
     *
     * @return the value of art_thirdparty.host_name
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public String getHostName() {
        return hostName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_thirdparty.host_name
     *
     * @param hostName the value for art_thirdparty.host_name
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setHostName(String hostName) {
        this.hostName = hostName == null ? null : hostName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_thirdparty.create_user_id
     *
     * @return the value of art_thirdparty.create_user_id
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public Integer getCreateUserId() {
        return createUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_thirdparty.create_user_id
     *
     * @param createUserId the value for art_thirdparty.create_user_id
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_thirdparty.create_by
     *
     * @return the value of art_thirdparty.create_by
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_thirdparty.create_by
     *
     * @param createBy the value for art_thirdparty.create_by
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_thirdparty.create_date
     *
     * @return the value of art_thirdparty.create_date
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_thirdparty.create_date
     *
     * @param createDate the value for art_thirdparty.create_date
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_thirdparty.update_user_id
     *
     * @return the value of art_thirdparty.update_user_id
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public Integer getUpdateUserId() {
        return updateUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_thirdparty.update_user_id
     *
     * @param updateUserId the value for art_thirdparty.update_user_id
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setUpdateUserId(Integer updateUserId) {
        this.updateUserId = updateUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_thirdparty.update_by
     *
     * @return the value of art_thirdparty.update_by
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_thirdparty.update_by
     *
     * @param updateBy the value for art_thirdparty.update_by
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_thirdparty.update_date
     *
     * @return the value of art_thirdparty.update_date
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_thirdparty.update_date
     *
     * @param updateDate the value for art_thirdparty.update_date
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table art_thirdparty
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", thirdName=").append(thirdName);
        sb.append(", password=").append(password);
        sb.append(", type=").append(type);
        sb.append(", enableStatus=").append(enableStatus);
        sb.append(", traceCodeI=").append(traceCodeI);
        sb.append(", traceCodeU=").append(traceCodeU);
        sb.append(", hostName=").append(hostName);
        sb.append(", createUserId=").append(createUserId);
        sb.append(", createBy=").append(createBy);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateUserId=").append(updateUserId);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", updateDate=").append(updateDate);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table art_thirdparty
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Thirdparty other = (Thirdparty) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getThirdName() == null ? other.getThirdName() == null : this.getThirdName().equals(other.getThirdName()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getEnableStatus() == null ? other.getEnableStatus() == null : this.getEnableStatus().equals(other.getEnableStatus()))
            && (this.getTraceCodeI() == null ? other.getTraceCodeI() == null : this.getTraceCodeI().equals(other.getTraceCodeI()))
            && (this.getTraceCodeU() == null ? other.getTraceCodeU() == null : this.getTraceCodeU().equals(other.getTraceCodeU()))
            && (this.getHostName() == null ? other.getHostName() == null : this.getHostName().equals(other.getHostName()))
            && (this.getCreateUserId() == null ? other.getCreateUserId() == null : this.getCreateUserId().equals(other.getCreateUserId()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getUpdateUserId() == null ? other.getUpdateUserId() == null : this.getUpdateUserId().equals(other.getUpdateUserId()))
            && (this.getUpdateBy() == null ? other.getUpdateBy() == null : this.getUpdateBy().equals(other.getUpdateBy()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table art_thirdparty
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getThirdName() == null) ? 0 : getThirdName().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getEnableStatus() == null) ? 0 : getEnableStatus().hashCode());
        result = prime * result + ((getTraceCodeI() == null) ? 0 : getTraceCodeI().hashCode());
        result = prime * result + ((getTraceCodeU() == null) ? 0 : getTraceCodeU().hashCode());
        result = prime * result + ((getHostName() == null) ? 0 : getHostName().hashCode());
        result = prime * result + ((getCreateUserId() == null) ? 0 : getCreateUserId().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getUpdateUserId() == null) ? 0 : getUpdateUserId().hashCode());
        result = prime * result + ((getUpdateBy() == null) ? 0 : getUpdateBy().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        return result;
    }
}