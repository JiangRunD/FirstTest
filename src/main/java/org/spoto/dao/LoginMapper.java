package org.spoto.dao;

import org.apache.ibatis.annotations.Param;
import org.spoto.model.User;

public interface LoginMapper {

    User doLogin(@Param("account") String account,@Param("passwd") String passwd);
}
