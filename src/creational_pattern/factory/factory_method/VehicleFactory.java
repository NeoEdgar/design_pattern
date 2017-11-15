package creational_pattern.factory.factory_method;

import creational_pattern.factory.simple_factory.ICar;

/**
 * @Author:F.jq
 * @Date:Created in 2017/11/13.
 * @description _
 * <P>抽象工厂,各工厂是完全独立的</P>
 */
public abstract class VehicleFactory {
    public abstract ICar create();
}
