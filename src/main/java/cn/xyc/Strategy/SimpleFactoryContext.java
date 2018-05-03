package cn.xyc.Strategy;

import cn.xyc.Strategy.annotation.Strategy;
import org.reflections.Reflections;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by lijiyang on 2018/5/3.<br/>
 * 使用反射和简单工厂模式增强 策略模式的功能<br/>
 * 客户端不需要知道策略类的具体实例化过程<br/>
 * 只需要传入字符串指定要使用的策略类型
 * @see Client2
 */
public class SimpleFactoryContext {
    private static Map<String, Class> allStrategies;

    static {
        Reflections reflections = new Reflections("com.example.demo.design_pattern.Strategy");
        Set<Class<?>> annotatedClasses =
                reflections.getTypesAnnotatedWith(Strategy.class);
        allStrategies = new ConcurrentHashMap<String, Class>();
        for (Class clazz:annotatedClasses){
            Strategy strategy = (Strategy) clazz.getAnnotation(Strategy.class);
            String name = strategy.name();
            allStrategies.put(name, clazz);
        }
        allStrategies = Collections.unmodifiableMap(allStrategies);
    }

    private IStrategy strategy;

    private String strategyName;

    public SimpleFactoryContext(String strategyName) {
        try {
            strategy = (IStrategy) allStrategies.get(strategyName).newInstance();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void action(String speed){
        strategy.handle(speed);
    }
}
