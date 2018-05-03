package cn.xyc.Strategy;

/**
 * Created by lijiyang on 2018/5/3.
 */
public class Client {
    public static void main(String[] args) {

        PoliceA policeA = new PoliceA();
        PoliceB policeB = new PoliceB();

        SimpleContext context1 = new SimpleContext(policeA);
        SimpleContext context2 = new SimpleContext(policeB);
        context1.action("200km/h");
        context2.action("200km/h");
    }
}
