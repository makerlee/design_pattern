package cn.xyc.simpleFactory.product;

import cn.xyc.simpleFactory.annotation.Vehicle;

/**
 * Created by lijiyang on 2018/5/3.
 */
@Vehicle(name = "benz")
public class BenzCar implements ICar {
    public void driver() {
        System.out.println("benz c200l is running.....");
    }
}
