package org.ko.prototype.data.bean.domain;

import java.io.Serializable;
import java.util.Date;

public class Menu extends AbstractDomain implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_menu.id
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_menu.parent_id
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private Integer parentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_menu.name
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_menu.url
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private String url;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_menu.icon_css
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private String iconCss;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_menu.visible
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private Short visible;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_menu.delete_status
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private Short deleteStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_menu.sort
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private Float sort;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_menu.trace_code_i
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private String traceCodeI;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_menu.trace_code_u
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private String traceCodeU;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_menu.host_name
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private String hostName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_menu.create_user_id
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private Integer createUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_menu.create_by
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private String createBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_menu.create_date
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_menu.update_user_id
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private Integer updateUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_menu.update_by
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private String updateBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column art_menu.update_date
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private Date updateDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table art_menu
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_menu.id
     *
     * @return the value of art_menu.id
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_menu.id
     *
     * @param id the value for art_menu.id
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_menu.parent_id
     *
     * @return the value of art_menu.parent_id
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_menu.parent_id
     *
     * @param parentId the value for art_menu.parent_id
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_menu.name
     *
     * @return the value of art_menu.name
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_menu.name
     *
     * @param name the value for art_menu.name
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_menu.url
     *
     * @return the value of art_menu.url
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_menu.url
     *
     * @param url the value for art_menu.url
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_menu.icon_css
     *
     * @return the value of art_menu.icon_css
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public String getIconCss() {
        return iconCss;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_menu.icon_css
     *
     * @param iconCss the value for art_menu.icon_css
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setIconCss(String iconCss) {
        this.iconCss = iconCss == null ? null : iconCss.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_menu.visible
     *
     * @return the value of art_menu.visible
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public Short getVisible() {
        return visible;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_menu.visible
     *
     * @param visible the value for art_menu.visible
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setVisible(Short visible) {
        this.visible = visible;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_menu.delete_status
     *
     * @return the value of art_menu.delete_status
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public Short getDeleteStatus() {
        return deleteStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_menu.delete_status
     *
     * @param deleteStatus the value for art_menu.delete_status
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setDeleteStatus(Short deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_menu.sort
     *
     * @return the value of art_menu.sort
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public Float getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_menu.sort
     *
     * @param sort the value for art_menu.sort
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setSort(Float sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_menu.trace_code_i
     *
     * @return the value of art_menu.trace_code_i
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public String getTraceCodeI() {
        return traceCodeI;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_menu.trace_code_i
     *
     * @param traceCodeI the value for art_menu.trace_code_i
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setTraceCodeI(String traceCodeI) {
        this.traceCodeI = traceCodeI == null ? null : traceCodeI.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_menu.trace_code_u
     *
     * @return the value of art_menu.trace_code_u
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public String getTraceCodeU() {
        return traceCodeU;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_menu.trace_code_u
     *
     * @param traceCodeU the value for art_menu.trace_code_u
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setTraceCodeU(String traceCodeU) {
        this.traceCodeU = traceCodeU == null ? null : traceCodeU.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_menu.host_name
     *
     * @return the value of art_menu.host_name
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public String getHostName() {
        return hostName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_menu.host_name
     *
     * @param hostName the value for art_menu.host_name
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setHostName(String hostName) {
        this.hostName = hostName == null ? null : hostName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_menu.create_user_id
     *
     * @return the value of art_menu.create_user_id
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public Integer getCreateUserId() {
        return createUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_menu.create_user_id
     *
     * @param createUserId the value for art_menu.create_user_id
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_menu.create_by
     *
     * @return the value of art_menu.create_by
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_menu.create_by
     *
     * @param createBy the value for art_menu.create_by
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_menu.create_date
     *
     * @return the value of art_menu.create_date
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_menu.create_date
     *
     * @param createDate the value for art_menu.create_date
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_menu.update_user_id
     *
     * @return the value of art_menu.update_user_id
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public Integer getUpdateUserId() {
        return updateUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_menu.update_user_id
     *
     * @param updateUserId the value for art_menu.update_user_id
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setUpdateUserId(Integer updateUserId) {
        this.updateUserId = updateUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_menu.update_by
     *
     * @return the value of art_menu.update_by
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_menu.update_by
     *
     * @param updateBy the value for art_menu.update_by
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column art_menu.update_date
     *
     * @return the value of art_menu.update_date
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column art_menu.update_date
     *
     * @param updateDate the value for art_menu.update_date
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table art_menu
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
        sb.append(", parentId=").append(parentId);
        sb.append(", name=").append(name);
        sb.append(", url=").append(url);
        sb.append(", iconCss=").append(iconCss);
        sb.append(", visible=").append(visible);
        sb.append(", deleteStatus=").append(deleteStatus);
        sb.append(", sort=").append(sort);
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
     * This method corresponds to the database table art_menu
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
        Menu other = (Menu) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getParentId() == null ? other.getParentId() == null : this.getParentId().equals(other.getParentId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getIconCss() == null ? other.getIconCss() == null : this.getIconCss().equals(other.getIconCss()))
            && (this.getVisible() == null ? other.getVisible() == null : this.getVisible().equals(other.getVisible()))
            && (this.getDeleteStatus() == null ? other.getDeleteStatus() == null : this.getDeleteStatus().equals(other.getDeleteStatus()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
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
     * This method corresponds to the database table art_menu
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getParentId() == null) ? 0 : getParentId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getIconCss() == null) ? 0 : getIconCss().hashCode());
        result = prime * result + ((getVisible() == null) ? 0 : getVisible().hashCode());
        result = prime * result + ((getDeleteStatus() == null) ? 0 : getDeleteStatus().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
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