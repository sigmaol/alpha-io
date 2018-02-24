package org.ko.prototype.data.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.ko.prototype.data.bean.domain.RequestLog;
import org.ko.prototype.data.bean.domain.RequestLogExample;

public interface RequestLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table art_request_log
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    long countByExample(RequestLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table art_request_log
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    int deleteByExample(RequestLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table art_request_log
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table art_request_log
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    int insert(RequestLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table art_request_log
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    int insertSelective(RequestLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table art_request_log
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    List<RequestLog> selectByExampleWithRowbounds(RequestLogExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table art_request_log
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    List<RequestLog> selectByExample(RequestLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table art_request_log
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    RequestLog selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table art_request_log
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    int updateByExampleSelective(@Param("record") RequestLog record, @Param("example") RequestLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table art_request_log
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    int updateByExample(@Param("record") RequestLog record, @Param("example") RequestLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table art_request_log
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    int updateByPrimaryKeySelective(RequestLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table art_request_log
     *
     * @mbg.generated Sat Feb 24 11:26:39 CST 2018
     */
    int updateByPrimaryKey(RequestLog record);
}