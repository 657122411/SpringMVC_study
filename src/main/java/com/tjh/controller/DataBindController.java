package com.tjh.controller;


import com.tjh.dao.CourseDao;
import com.tjh.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DataBindController {

    @Autowired
    private CourseDao courseDao;


    @RequestMapping(value = "/baseType")
    @ResponseBody
    public String baseType(@RequestParam(value = "id") int id){
        return "id"+id;
    }

    @RequestMapping(value = "/packageType")
    @ResponseBody
    public String packageType(@RequestParam(value = "id") Integer id){
        return "id"+id;
    }

    @RequestMapping(value = "/arrayType")
    @ResponseBody
    public String arrayType(String[] name){
        StringBuffer sbf = new StringBuffer();
        for (String s : name) {
            sbf.append(s).append(" ");
        }
        return sbf.toString();
    }

    @RequestMapping(value = "/pojoType")
    public ModelAndView pojoType(Course course){
        courseDao.add(course);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("courses",courseDao.getAll());
        return modelAndView;
    }

}
