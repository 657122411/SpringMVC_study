package com.tjh.handler;

import com.tjh.entity.Goods;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class AnnotationHandler {
//    业务方法：modelandview完成数据的传递，使徒的解析
    @RequestMapping("/modelAndViewTest")
    public ModelAndView modelAndViewTest(){
//        创建ModelAndView对象
        ModelAndView modelAndView = new ModelAndView();
        //填充模型数据
        modelAndView.addObject("name","Bob");
        //设置逻辑视图
        modelAndView.setViewName("show");
        return modelAndView;
    }

//    业务方法:Model传值String进行视图解析
    @RequestMapping("/modelTest")
    public String ModelTest(Model model){
//        填充模型数据
        model.addAttribute("name","jerry");
        //设置逻辑视图
        return "show";
    }

    //业务方法：Map传值，String进行视图解析
    @RequestMapping("mapTest")
    public String MapTest(Map<String,String> map){
//        填充模型数据
        map.put("name","cat");
        //设置逻辑视图
        return "show";
    }

    /*添加商品并展示*/
    @RequestMapping("/addGoods")
    public ModelAndView addGoods(Goods goods){
        System.out.println(goods.getName()+goods.getPrice());
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("goods",goods);
        modelAndView.setViewName("show");
        return modelAndView;
    }
}
