package com.jinke.location.controller;

import com.jinke.location.bean.HttpResult;
import com.jinke.location.bean.Student;
import com.jinke.location.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }


    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public ModelAndView student() {
        return new ModelAndView("student", "command", new Student());
    }

    @RequestMapping(value = "/file", method = RequestMethod.GET)
    public String image() {
        return "upFile";
    }

    @RequestMapping(value = "/getImage", method = RequestMethod.POST)
    public String getUpFile(@RequestParam("image") MultipartFile file) {
//        System.out.println(user.getXuweijei());
//        System.out.println(user.getXuwiejei());
        System.out.println("upFile size="+file.getSize());
        return "index";
    }

    @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
    public String addStudent(@ModelAttribute("SpringWeb") Student student, ModelMap model) {
        model.addAttribute("name", student.getName());
        model.addAttribute("age", student.getAge());
        model.addAttribute("id", student.getId());
        return "result";
    }

    @RequestMapping(value = "/list")
    @ResponseBody
    public Map<String, Object> getjsopn() {
        HttpResult httpResult = new HttpResult();
        User user = new User(1, "xuweijei", "xuwiejei", "xwj", "nan", "22", "zhuhai");
        String[] arrays = new String[]{"a", "b", "c"};
        user.setArrays(arrays);
        httpResult.setData(user);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("errcode", "1");
        map.put("errmsg", "success");
        map.put("data", user);
        return map;
    }
}
