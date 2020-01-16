package com.example.demomybatis.handler;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = Exception.class)   //继承所有异常类
    @ResponseBody
    private Map<String,Object> exceptionHandler(HttpServletRequest req, Exception e){
        Map<String ,Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success",false);
        modelMap.put("errMsg",e.getMessage());
        return  modelMap;
    }
}
