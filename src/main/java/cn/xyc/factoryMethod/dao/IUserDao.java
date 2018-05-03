package cn.xyc.factoryMethod.dao;

import cn.xyc.factoryMethod.bean.User;

/**
 * Created by lijiyang on 2018/5/3.
 */
public interface IUserDao {
    void addUser(User user);
    void removeUser(User user);
    User getUser(String username);
}
