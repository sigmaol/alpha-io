package org.ko.prototype.data.bean.domain;

import java.io.Serializable;
import java.util.Date;

public class Slider extends AbstractDomain implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_slider.id
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_slider.url
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private String url;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_slider.block
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private Short block;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_slider.link
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private String link;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_slider.description
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_slider.delete_status
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private Short deleteStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_slider.trace_code_i
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private String traceCodeI;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_slider.trace_code_u
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private String traceCodeU;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_slider.host_name
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private String hostName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_slider.create_user_id
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private Integer createUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_slider.create_by
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private String createBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_slider.create_date
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_slider.update_user_id
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private Integer updateUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_slider.update_by
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private String updateBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_slider.update_date
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private Date updateDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table art_slider
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_slider.id
     *
     * @return the value of art_slider.id
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_slider.id
     *
     * @param id the value for art_slider.id
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_slider.url
     *
     * @return the value of art_slider.url
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_slider.url
     *
     * @param url the value for art_slider.url
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_slider.block
     *
     * @return the value of art_slider.block
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public Short getBlock() {
        return block;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_slider.block
     *
     * @param block the value for art_slider.block
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setBlock(Short block) {
        this.block = block;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_slider.link
     *
     * @return the value of art_slider.link
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public String getLink() {
        return link;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_slider.link
     *
     * @param link the value for art_slider.link
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setLink(String link) {
        this.link = link == null ? null : link.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_slider.description
     *
     * @return the value of art_slider.description
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_slider.description
     *
     * @param description the value for art_slider.description
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_slider.delete_status
     *
     * @return the value of art_slider.delete_status
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public Short getDeleteStatus() {
        return deleteStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_slider.delete_status
     *
     * @param deleteStatus the value for art_slider.delete_status
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setDeleteStatus(Short deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_slider.trace_code_i
     *
     * @return the value of art_slider.trace_code_i
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public String getTraceCodeI() {
        return traceCodeI;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_slider.trace_code_i
     *
     * @param traceCodeI the value for art_slider.trace_code_i
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setTraceCodeI(String traceCodeI) {
        this.traceCodeI = traceCodeI == null ? null : traceCodeI.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_slider.trace_code_u
     *
     * @return the value of art_slider.trace_code_u
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public String getTraceCodeU() {
        return traceCodeU;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_slider.trace_code_u
     *
     * @param traceCodeU the value for art_slider.trace_code_u
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setTraceCodeU(String traceCodeU) {
        this.traceCodeU = traceCodeU == null ? null : traceCodeU.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_slider.host_name
     *
     * @return the value of art_slider.host_name
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public String getHostName() {
        return hostName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_slider.host_name
     *
     * @param hostName the value for art_slider.host_name
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setHostName(String hostName) {
        this.hostName = hostName == null ? null : hostName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_slider.create_user_id
     *
     * @return the value of art_slider.create_user_id
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public Integer getCreateUserId() {
        return createUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_slider.create_user_id
     *
     * @param createUserId the value for art_slider.create_user_id
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_slider.create_by
     *
     * @return the value of art_slider.create_by
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_slider.create_by
     *
     * @param createBy the value for art_slider.create_by
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_slider.create_date
     *
     * @return the value of art_slider.create_date
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_slider.create_date
     *
     * @param createDate the value for art_slider.create_date
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_slider.update_user_id
     *
     * @return the value of art_slider.update_user_id
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public Integer getUpdateUserId() {
        return updateUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_slider.update_user_id
     *
     * @param updateUserId the value for art_slider.update_user_id
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setUpdateUserId(Integer updateUserId) {
        this.updateUserId = updateUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_slider.update_by
     *
     * @return the value of art_slider.update_by
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_slider.update_by
     *
     * @param updateBy the value for art_slider.update_by
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_slider.update_date
     *
     * @return the value of art_slider.update_date
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_slider.update_date
     *
     * @param updateDate the value for art_slider.update_date
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table art_slider
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
        sb.append(", url=").append(url);
        sb.append(", block=").append(block);
        sb.append(", link=").append(link);
        sb.append(", description=").append(description);
        sb.append(", deleteStatus=").append(deleteStatus);
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
     * This method corresponds to the database table art_slider
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
        Slider other = (Slider) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getBlock() == null ? other.getBlock() == null : this.getBlock().equals(other.getBlock()))
            && (this.getLink() == null ? other.getLink() == null : this.getLink().equals(other.getLink()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getDeleteStatus() == null ? other.getDeleteStatus() == null : this.getDeleteStatus().equals(other.getDeleteStatus()))
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
     * This method corresponds to the database table art_slider
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getBlock() == null) ? 0 : getBlock().hashCode());
        result = prime * result + ((getLink() == null) ? 0 : getLink().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getDeleteStatus() == null) ? 0 : getDeleteStatus().hashCode());
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