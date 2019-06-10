package com.briup.apps.app02.dao;

import com.briup.apps.app02.bean.Course;
import com.briup.apps.app02.bean.CourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_course
     *
     * @mbg.generated Mon Jun 10 09:54:53 CST 2019
     */
    long countByExample(CourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_course
     *
     * @mbg.generated Mon Jun 10 09:54:53 CST 2019
     */
    int deleteByExample(CourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_course
     *
     * @mbg.generated Mon Jun 10 09:54:53 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_course
     *
     * @mbg.generated Mon Jun 10 09:54:53 CST 2019
     */
    int insert(Course record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_course
     *
     * @mbg.generated Mon Jun 10 09:54:53 CST 2019
     */
    int insertSelective(Course record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_course
     *
     * @mbg.generated Mon Jun 10 09:54:53 CST 2019
     */
    List<Course> selectByExample(CourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_course
     *
     * @mbg.generated Mon Jun 10 09:54:53 CST 2019
     */
    Course selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_course
     *
     * @mbg.generated Mon Jun 10 09:54:53 CST 2019
     */
    int updateByExampleSelective(@Param("record") Course record, @Param("example") CourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_course
     *
     * @mbg.generated Mon Jun 10 09:54:53 CST 2019
     */
    int updateByExample(@Param("record") Course record, @Param("example") CourseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_course
     *
     * @mbg.generated Mon Jun 10 09:54:53 CST 2019
     */
    int updateByPrimaryKeySelective(Course record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_course
     *
     * @mbg.generated Mon Jun 10 09:54:53 CST 2019
     */
    int updateByPrimaryKey(Course record);
}