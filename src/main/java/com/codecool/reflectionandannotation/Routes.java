package com.codecool.reflectionandannotation;


public class Routes {
    @WebRoute(path = "/")
    public String mainPage(){
        return "main";
    }

    @WebRoute(path = "/test1")
    public String test1(){
        return "egy";
    }

    @WebRoute(path = "/test2")
    public String test2(){
        return "kettő";
    }
}
