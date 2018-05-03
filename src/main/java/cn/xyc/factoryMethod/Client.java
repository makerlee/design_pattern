package cn.xyc.factoryMethod;

import cn.xyc.factoryMethod.bean.User;
import cn.xyc.factoryMethod.dao.IUserDao;
import cn.xyc.factoryMethod.factory.IDaoFactory;
import cn.xyc.factoryMethod.factory.MysqlDaoFactory;

/**
 * Created by lijiyang on 2018/5/3.
 */
public class Client {
    public static void main(String[] args) {
        IDaoFactory daoFactory = new MysqlDaoFactory();
        IUserDao dao = daoFactory.createDao();
        User user = dao.getUser("haha");
        System.out.println(user.toString());
    }
}
