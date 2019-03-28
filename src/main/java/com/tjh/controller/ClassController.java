package com.tjh.controller;

import com.tjh.dao.ClassDao;
import com.tjh.entity.Class;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClassController {
    @Autowired
    private ClassDao classDao;

    /*添加课程*/
    @PostMapping(value = "/addClass")
    public String add(Class mclass){
        classDao.add(mclass);
        return "rediredt:/getAll";
    }

    /*重新加载*/
    @GetMapping(value = "/getAll")
    public ModelAndView getAll(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index2");
        modelAndView.addObject("classMap",classDao.getAll());
        return modelAndView;
    }

    /*通过id查询*/
    @GetMapping(value = "/getById(id)")
    public ModelAndView getById(@PathVariable(value = "id")int id){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("edit");
        modelAndView.addObject("class",classDao.getById(id));
        return modelAndView;
    }

    /*修改*/
    @PutMapping(value = "/update")
    public String uptate(Class mclass){
        classDao.update(mclass);
        return "redirect:/getAll";
    }

    /*删除*/
    @DeleteMapping(value = "/deleye(id)")
    public String delete(@PathVariable(value = "id")int id){
        classDao.deleteById(id);
        return "redirect:getAll";
    }

}
