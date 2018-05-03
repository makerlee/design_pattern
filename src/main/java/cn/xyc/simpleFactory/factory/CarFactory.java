package cn.xyc.simpleFactory.factory;

import cn.xyc.simpleFactory.annotation.Vehicle;
import cn.xyc.simpleFactory.product.ICar;
import org.reflections.Reflections;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by lijiyang on 2018/5/3.
 */
public class CarFactory {
    private static Map<String, Class> allCars;

    static {
        Reflections reflections = new Reflections("cn.xyc.simpleFactory.product");
        Set<Class<?>> annotatedClasses = reflections.getTypesAnnotatedWith(Vehicle.class);
        allCars = new ConcurrentHashMap<String, Class>();
        for (Class<?> classObject : annotatedClasses) {
            Vehicle vehicle = (Vehicle) classObject.getAnnotation(Vehicle.class);
            allCars.put(vehicle.name(), classObject);
        }
        allCars = Collections.unmodifiableMap(allCars);
    }


    public static ICar newCar(String carName) {
        ICar car = null;
        String type = null;
        try {
            //XMLConfiguration config = new XMLConfiguration("car.xml");
            //type = config.getString("factory3.type");
            type = carName;
        } catch (Exception ex) {
            //LOG.error("Parsing xml configuration file failed", ex);
            ex.printStackTrace();
        }

        if (allCars.containsKey(type)) {
            try {
                car = (ICar) allCars.get(type).newInstance();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else {
            //LOG.error("specified car type {} does not exist", type);
        }
        return car;
    }
}
