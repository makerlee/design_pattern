package cn.xyc.factoryMethod.factory;

import cn.xyc.factoryMethod.dao.IUserDao;

/**
 * Created by lijiyang on 2018/5/3.
 */
public interface IDaoFactory {
    IUserDao createDao();
}
