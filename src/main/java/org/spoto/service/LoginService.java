package org.spoto.service;

import org.spoto.model.User;

public interface LoginService {

    User doLogin(String account, String passwd);
}
