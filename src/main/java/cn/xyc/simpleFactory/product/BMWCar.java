package cn.xyc.simpleFactory.product;

import cn.xyc.simpleFactory.annotation.Vehicle;

/**
 * Created by lijiyang on 2018/5/3.
 */
@Vehicle(name = "bmw")
public class BMWCar implements ICar {
    public void driver() {
        System.out.println("BWM 530li is running");
    }
}
