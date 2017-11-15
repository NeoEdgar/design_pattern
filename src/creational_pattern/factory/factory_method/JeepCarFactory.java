package creational_pattern.factory.factory_method;

import creational_pattern.factory.simple_factory.ICar;
import creational_pattern.factory.simple_factory.JeepCar;

/**
 * @Author:F.jq
 * @Date:Created in 2017/11/13.
 * @description _
 * <P>具体工厂</P>
 */
public class JeepCarFactory extends VehicleFactory {
    @Override
    public ICar create() {
        return new JeepCar();
    }
}
