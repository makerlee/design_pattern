package cn.xyc.factoryMethod.dao;

import cn.xyc.factoryMethod.bean.User;

/**
 * Created by lijiyang on 2018/5/3.
 */
public class MysqlUserDao implements IUserDao {
    public void addUser(User user) {
        System.out.println("mysql add user:"+user);
    }

    public void removeUser(User user) {
        System.out.println("mysql remove user:"+user.getName());
    }

    public User getUser(String username) {
        User user = new User();
        user.setName(username);
        return user;
    }
}
