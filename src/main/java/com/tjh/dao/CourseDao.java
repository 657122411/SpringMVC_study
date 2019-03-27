package com.tjh.dao;

import com.tjh.entity.Course;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class CourseDao {
    //充当数据库
    private Map<Integer, Course> courses = new HashMap<Integer, Course>();

    public void add(Course course){
        courses.put(course.getId(),course);
    }

    public Collection<Course> getAll(){
        return courses.values();
    }
}
