package cn.xyc.Strategy;


import cn.xyc.Strategy.annotation.Strategy;

/**
 * Created by lijiyang on 2018/5/3.
 */
@Strategy(name="policeB")
public class PoliceB implements IStrategy {
    public void handle(String speed) {
        System.out.println("your speed is "+speed+",you get a ticket");
    }
}
