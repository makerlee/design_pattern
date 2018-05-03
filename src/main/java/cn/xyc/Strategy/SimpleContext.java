package cn.xyc.Strategy;

/**
 * Created by lijiyang on 2018/5/3.
 */
public class SimpleContext {
    private IStrategy strategy;

    public SimpleContext(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void action(String speed){
        strategy.handle(speed);
    }
}
