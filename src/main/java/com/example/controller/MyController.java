package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class MyController {


    @RequestMapping("ajax.do")
    public void ajax(HttpServletRequest request , HttpServletResponse response) throws IOException {
        PrintWriter pw = response.getWriter();
        pw.print("abc");
        pw.flush();//刷新
        pw.close();//关闭
    }

    @RequestMapping("json.do")
    @ResponseBody
    public Object json(HttpServletRequest request , HttpServletResponse response) throws IOException {
        List list = new ArrayList();
        list.add("abc");
        list.add(123);
        list.add("bbb");
        return list;
    }
}
