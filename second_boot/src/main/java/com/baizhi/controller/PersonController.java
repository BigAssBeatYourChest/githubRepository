package com.baizhi.controller;

import com.baizhi.entity.PageQuery;
import com.baizhi.entity.Person;
import com.baizhi.entity.Person2;
import com.baizhi.service.Person2Service;
import com.baizhi.service.PersonService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Create by 杨宁
 * On 2019/2/20.
 */
//@RestController
@Controller
@RequestMapping("person")
public class PersonController {
    @Autowired
    private PersonService personService;
    @Autowired
    private Person2Service person2Service;


    @RequestMapping("index")
    public String index(){
        return "login";
    }

    @RequestMapping("login")
    public String login(Person person,String enCode, HttpSession session){
        String verificationCode = (String) session.getAttribute("verificationCode");

        Person p = personService.selectPersonByObj(person);
        if (p.getId()==null || !enCode.equals(verificationCode)){
            return "login";
        }
        return "redirect:getAll";

    }

    @RequestMapping("getAll")
    public String getAll(PageQuery pageQuery, ModelMap modelMap){
        System.out.println("qqqqqq"+pageQuery.getPage()+"   "+pageQuery.getRows());
        Page<Object> page = PageHelper.startPage(pageQuery.getPage(), pageQuery.getRows());
        List<Person2> list = person2Service.selectPerson2(null);
        long total = page.getTotal();
        modelMap.addAttribute("list",list);
        return "empList";
    }

    @RequestMapping("deleteById")
    public String deleteById(Integer id){
        person2Service.deletePerson2ById (id);
        return "redirect:getAll";
    }

    @RequestMapping("selectById")
    public String selectById(Integer id,ModelMap modelMap){
        Person2 person2 = person2Service.selectPerson2ById(id);
        System.out.println(id+"qqq"+person2);
        modelMap.addAttribute("person2",person2);
        return "updateEmp";
    }

    @RequestMapping("change")
    public String change(Person2 person2){
        person2Service.updatePerson2ById(person2);
        return "redirect:getAll";
    }

    @RequestMapping("add")
    public String add(Person2 person2){
        person2Service.insertNonEmptyPerson2(person2);
        return "redirect:getAll";
    }
}
