package cn.xyc.factoryMethod.factory;

import cn.xyc.factoryMethod.dao.IUserDao;
import cn.xyc.factoryMethod.dao.MysqlUserDao;

/**
 * Created by lijiyang on 2018/5/3.
 */
public class MysqlDaoFactory implements IDaoFactory {
    public IUserDao createDao() {
        return new MysqlUserDao();
    }
}
