package org.spoto.controller;


import com.alibaba.fastjson.JSONObject;
import org.spoto.dto.TabData;
import org.spoto.model.User;
import org.spoto.service.UserService;
import org.spoto.utils.WebUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.annotation.WebServlet;

@RestController
public class UserController {

    @Resource
    private UserService us;

    @RequestMapping("user-list")
    public String list(Integer pageIndex, String uname,Integer age){
        if(pageIndex==null||pageIndex<=0){
            pageIndex=1;
        }

        //每页显示几条数据
        int pageSize=4;

        //调用业务层处理数据

//        TabService ts=new TabServiceImpl();
        TabData<User> td = us.list(uname, age, pageIndex, pageSize);

        return WebUtil.returnData(td);
    }

    @RequestMapping("user-save")
    public String save(User user){

        boolean save=us.save(user);

        JSONObject data=new JSONObject();
        data.put("type",save);
        return data.toString();
    }

    @RequestMapping("user-del")
    public String del(String ids){
        JSONObject data=new JSONObject();
        if (ids==null||ids.equals("")){
            data.put("type",false);
            return data.toString();
        }

        String[] idArr = ids.split(",");
        boolean result = us.del(idArr);

        data.put("type",result);
        return data.toString();
    }
}
