package com.briup.apps.app02.dao;

import com.briup.apps.app02.bean.Course;

import java.util.List;

public interface CourseMapper {

    void insert(Course course);

    void update(Course couse);
    List<Course> selectAll();

    Course selectByPrimaryKey(long id);
}
