package com.june.service; /**
 * Copyright (C), 2018-2018, 中信网络科技股份有限公司
 * <p>
 * FileName: MyInterfacesImpl
 * <p>
 * Author:   cjs
 * <p>
 * Date:     2018/12/16 15:34
 * <p>
 * Description: test
 * <p>
 * History:
 *
 * <author>          <time>          <version>          <desc>
 * <p>
 * 作者姓名           修改时间           版本号              描述
 */


import com.june.interfaces.IMyInterfaces;

/**
 * 〈一句话功能简述〉<br> 
 * 〈test〉
 *
 * @author cjs

 * @create 2018/12/16

 * @since 1.0.0

 */

public class MyInterfacesImpl implements IMyInterfaces {


    public String helloWolrd(String name) {
        return "hello"+name;
    }
}