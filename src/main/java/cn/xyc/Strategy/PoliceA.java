package cn.xyc.Strategy;


import cn.xyc.Strategy.annotation.Strategy;

/**
 * Created by lijiyang on 2018/5/3.
 */
@Strategy(name="policeA")
public class PoliceA implements IStrategy {
    public void handle(String speed) {
        System.out.println("your speed is " + speed + ",this a your first time,你走吧");
    }
}
