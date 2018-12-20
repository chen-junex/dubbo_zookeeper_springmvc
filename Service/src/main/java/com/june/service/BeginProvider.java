/**
 * Copyright (C), 2018-2018, 中信网络科技股份有限公司
 * <p>
 * FileName: BeginProvider
 * <p>
 * Author:   cjs
 * <p>
 * Date:     2018/12/16 17:05
 * <p>
 * Description: test
 * <p>
 * History:
 *
 * <author>          <time>          <version>          <desc>
 * <p>
 * 作者姓名           修改时间           版本号              描述
 */


package com.june.service;



import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 〈一句话功能简述〉<br> 
 * 〈test〉
 *
 * @author cjs

 * @create 2018/12/16

 * @since 1.0.0

 */

public class BeginProvider {
public static void main(String args[]) throws Exception{
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"provider.xml"});
    context.start();
    System.out.println("服务开启");
    System.in.read();
}

}