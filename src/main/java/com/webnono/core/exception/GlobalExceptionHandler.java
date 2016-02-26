package com.webnono.core.exception;

import org.apache.shiro.authz.AuthorizationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;

/**
 * 通用的异常处理
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);
// 示例
// @ExceptionHandler(RuntimeException.class)
//    public ModelAndView handleUserNotFoundException(Exception ex){
//        ModelAndView modelAndView = new ModelAndView();
//        System.out.println("正在处理异常");
//        logger.info("正在处理异常");
//        modelAndView.addObject("error",ex.getMessage());
//        modelAndView.setViewName("login");
//        return modelAndView;
//    }
    @ExceptionHandler(AuthorizationException.class)
    public ModelAndView handleunauthorizedExcetpion(HttpServletResponse response){
        ModelAndView modelAndView = new ModelAndView("redirect:/page/unauthorized");
        response.setStatus(200);
        return modelAndView;
    }
}
