package cn.xyc.factoryMethod.factory;

import cn.xyc.factoryMethod.dao.IUserDao;
import cn.xyc.factoryMethod.dao.OracleUserDao;

/**
 * Created by lijiyang on 2018/5/3.
 */
public class OracleDaoFactory implements IDaoFactory {

    public IUserDao createDao() {
        return new OracleUserDao();
    }
}
