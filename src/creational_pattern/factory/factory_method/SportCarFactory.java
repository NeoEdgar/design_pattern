package creational_pattern.factory.factory_method;

import creational_pattern.factory.simple_factory.ICar;
import creational_pattern.factory.simple_factory.SportCar;

/**
 * @Author:F.jq
 * @Date:Created in 2017/11/13.
 * @description _
 * <P></P>
 */
public class SportCarFactory extends VehicleFactory {
    @Override
    public ICar create() {
        return new SportCar();
    }
}
