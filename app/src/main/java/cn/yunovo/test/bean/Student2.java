package cn.yunovo.test.bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Administrator on 2018/12/26.
 */

public class Student2 {

    private String name;

    private ArrayList<String> courses;

    public Student2(String name, ArrayList<String> courses) {
        this.name = name;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addCourse(String course)
    {
        courses.add(course);
    }

    public String removeCourse(String course){
        boolean removed = courses.remove(course);
        if(removed){
            return course;
        }else{
            return null;
        }
    }

    public List<String> getCourses() {
        return Collections.unmodifiableList(courses);
    }
}
