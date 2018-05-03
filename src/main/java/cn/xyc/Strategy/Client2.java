package cn.xyc.Strategy;

/**
 * Created by lijiyang on 2018/5/3.
 */
public class Client2 {
    public static void main(String[] args) {
        SimpleFactoryContext context = new SimpleFactoryContext("policeA");
        context.action("200km/h");
    }
}
