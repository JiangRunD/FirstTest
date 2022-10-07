package org.spoto.controller;

import com.alibaba.fastjson.JSONObject;
import org.spoto.model.User;
import org.spoto.service.LoginService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class LoginController {

    @Resource
    private LoginService ls;

    @RequestMapping("dologin")
    public String doLogin(HttpServletRequest request, HttpServletResponse response, String account, String passwd){


        User us = ls.doLogin(account, passwd);

        JSONObject d=new JSONObject();
        if (us!=null){
            request.getSession().setAttribute("logined",us.getId());
            d.put("type",true);
        }else{
            d.put("type",false);
        }

        return d.toString();
    }

    @RequestMapping("outlogin")
    public void outLogin(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.getSession().setAttribute("logined",false);
        response.sendRedirect("login.html");
    }
}
