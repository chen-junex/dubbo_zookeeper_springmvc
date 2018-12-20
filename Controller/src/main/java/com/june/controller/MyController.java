/**
 * Copyright (C), 2018-2018, 中信网络科技股份有限公司
 * <p>
 * FileName: MyController
 * <p>
 * Author:   cjs
 * <p>
 * Date:     2018/12/16 15:31
 * <p>
 * Description: test
 * <p>
 * History:
 *
 * <author>          <time>          <version>          <desc>
 * <p>
 * 作者姓名           修改时间           版本号              描述
 */
package com.june.controller;


import com.alibaba.dubbo.common.json.JSONObject;
import com.june.interfaces.IMyInterfaces;

import com.june.modle.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * 〈一句话功能简述〉<br> 
 * 〈test〉
 *
 * @author cjs

 * @create 2018/12/16

 * @since 1.0.0

 */
@Controller
public class MyController {

  //  @Autowired
  //  private IMyInterfaces myInterfaces;



@RequestMapping("/test")
public String getTest(){
    ClassPathXmlApplicationContext contest = new ClassPathXmlApplicationContext(new String[]{"classpath:consumer.xml"});
    System.out.println("1111");
    IMyInterfaces myInterfaces = (IMyInterfaces)contest.getBean("iMyInterfaces");
    myInterfaces.helloWolrd("chen");
    String str = myInterfaces.helloWolrd("ccc");
    System.out.println(str);
    return "welcome";
}

@RequestMapping("/modleandview")
    public ModelAndView getTest1(){
    ModelAndView modelAndView = new ModelAndView();
    modelAndView.addObject("name","陈俊仕");
    modelAndView.setViewName("HandlebarsTest");
    return modelAndView;

}
@RequestMapping("/void")
    public void getTest2(HttpServletRequest request, HttpServletResponse response){
    try {
       // String username = request.getParameter("username");
        String username = "this.username";
        request.setAttribute("username",username);
        // request.getRequestDispatcher("/WEB-INF/view/HandlebarsTest.jsp").forward(request,response);
        request.getRequestDispatcher("/WEB-INF/view/HandlebarsTest.html").forward(request,response);
    }catch (Exception e){
        System.out.println("异常了");
    }
}

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
   public String printHello(ModelMap model) {
        model.addAttribute("message", "Hello Spring MVC Framework!");
       return "welcome";
   }

    @RequestMapping(value = "/ajaxtest",method = RequestMethod.POST)
    @ResponseBody
    public User ajaxtest(User user,String mod, HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("ajaxtsts后台");
        System.out.println(mod);
        String name = request.getParameter("mod");
        System.out.println(name);
        JSONObject js = new JSONObject();
        js.put("name",mod);
        System.out.println(js.toString());
        user.setName(mod);
        user.setAge(1);
        System.out.println(user.getName());

        return user;
    }
}