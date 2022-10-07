package org.spoto.service;

import org.spoto.dto.TabData;
import org.spoto.model.User;

public interface UserService {

    TabData<User> list(String uname, Integer age, Integer pageIndex, Integer pageSize);

    boolean save(User us);

    boolean del(String[] idArr);
}
