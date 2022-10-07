package org.spoto.service.impl;

import org.apache.ibatis.session.RowBounds;
import org.spoto.dao.UserMapper;
import org.spoto.dto.TabData;
import org.spoto.model.User;
import org.spoto.service.UserService;
import org.spoto.utils.PageUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper um;

    @Override
    public TabData<User> list(String uname,Integer age,Integer pageIndex,Integer pageSize){
        TabData<User> td=new TabData<>();
        td.setPageIndex(pageIndex);
        td.setPageSize(pageSize);

        RowBounds rb = PageUtils.getRb(pageIndex, pageSize);

        Integer count = um.listCount(uname, age);
        td.setDataCount(count);
        if (count<=0){
            return td;
        }
        List<User> list = um.list(uname, age, rb);
        td.setDataList(list);

        return td;
    }

    @Override
    public boolean save(User us){
        Integer id=us.getId();
        Integer result=0;
        if (id.equals(0)){
            result=um.add(us);
        }else{
            result=um.change(us);
        }
        //return result>0 ? true:false;
        return result>0;
    }

    @Override
    public boolean del(String[] idArr){

        List<Integer> ids=new ArrayList<>();

        for (String s:idArr){
            int id=Integer.parseInt(s);
            ids.add(id);
        }
        Integer del = um.del(ids);
        return del>0;
    }
}
