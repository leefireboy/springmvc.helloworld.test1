/*
 * Copyright (c) 2015 Sohu TV. All rights reserved.
 */
package springmvc.helloworld.test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * <P>
 * Description:
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2015年12月20日上午12:05:29
 */
public class HelloController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest req,
            HttpServletResponse res) throws Exception {
        System.out.println("处理 hello.do 请求");
        ModelAndView mv = new ModelAndView("hello");
        return mv;// 调用hello.jsp
    }

}
