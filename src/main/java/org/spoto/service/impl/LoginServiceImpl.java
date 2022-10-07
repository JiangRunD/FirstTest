package org.spoto.service.impl;

import org.spoto.dao.LoginMapper;
import org.spoto.model.User;
import org.spoto.service.LoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LoginServiceImpl implements LoginService {

    @Resource
    private LoginMapper lm;

    @Override
    public User doLogin(String account, String passwd) {

        User us = lm.doLogin(account, passwd);
        return us;
    }
}
