package com.yinhai.demo.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

/**
 * Created by DELL-PC on 2017/5/10.
 */
@Namespace("/demo")
@Action(value = "testAnnotationAction",results = {@Result(name = "success",location = "/testAnnotation.jsp")})
public class TestAnnotationAction {
    public String execute(){
        return "success";
    }
}
