/**
 * Copyright (C), 2018-2018, 中信网络科技股份有限公司
 * <p>
 * FileName: MyController1
 * <p>
 * Author:   cjs
 * <p>
 * Date:     2018/12/16 18:21
 * <p>
 * Description: test1
 * <p>
 * History:
 *
 * <author>          <time>          <version>          <desc>
 * <p>
 * 作者姓名           修改时间           版本号              描述
 */


package com.june.controller;


import com.june.interfaces.IMyInterfaces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 〈一句话功能简述〉<br> 
 * 〈test1〉
 *
 * @author cjs

 * @create 2018/12/16

 * @since 1.0.0

 */
@Controller
public class MyController1 {

    @Autowired
    private IMyInterfaces iMyInterfaces;

    @RequestMapping("/test1")
    public String test1(){
        String str = iMyInterfaces.helloWolrd("陈俊仕");
        System.out.println(str);
        return "welcome";
    }

}