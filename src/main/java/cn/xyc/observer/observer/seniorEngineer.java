package cn.xyc.observer.observer;

/**
 * Created by lijiyang on 2018/5/4.
 */
public class seniorEngineer implements ITalent{
    public void newJob(String job) {
        System.out.println("senior engineer get new position "+job);
    }
}
