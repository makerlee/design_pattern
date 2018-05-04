package cn.xyc.observer;

import cn.xyc.observer.observer.ITalent;
import cn.xyc.observer.observer.JuniorEngineer;
import cn.xyc.observer.observer.seniorEngineer;
import cn.xyc.observer.subject.AbstractHR;
import cn.xyc.observer.subject.HeadHR;

/**
 * Created by lijiyang on 2018/5/4.
 */
public class Client {
    public static void main(String[] args) {
        //创建两个观察者
        ITalent juniorEngineer = new JuniorEngineer();
        ITalent seniorEngineer = new seniorEngineer();

        //创建主题
        AbstractHR hr = new HeadHR();
        hr.addTalent(juniorEngineer);
        hr.addTalent(seniorEngineer);

        //发布主题
        hr.publishJob("java开发");
    }
}
