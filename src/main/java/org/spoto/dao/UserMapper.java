package org.spoto.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.spoto.model.User;

import java.util.List;

public interface UserMapper {

    List<User> list(@Param("uname") String uname, @Param("age") Integer age, RowBounds rb);

    Integer listCount(@Param("uname") String uname, @Param("age") Integer age);

    Integer add(User us);

    Integer change(User us);

    Integer del(@Param("ids") List<Integer> ids);
}
