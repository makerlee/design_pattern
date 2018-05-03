package cn.xyc.simpleFactory;

import cn.xyc.simpleFactory.factory.CarFactory;
import cn.xyc.simpleFactory.product.ICar;

/**
 * Created by lijiyang on 2018/5/3.
 */
public class Client {
    public static void main(String[] args) {
        //这里通过构造函数传入想要生产的汽车类型字符串,实际场景中用配置文件
        CarFactory factory = new CarFactory();
        ICar car = factory.newCar("benz");
        car.driver();
    }
}
