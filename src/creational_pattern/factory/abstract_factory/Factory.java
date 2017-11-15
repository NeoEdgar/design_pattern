package creational_pattern.factory.abstract_factory;

import creational_pattern.factory.simple_factory.ICar;
import creational_pattern.factory.simple_factory.JeepCar;
import creational_pattern.factory.simple_factory.SportCar;

/**
 * @Author:F.jq
 * @Date:Created in 2017/11/13.
 * @description _
 * <P></P>
 */
public class Factory extends AbstractFactory {
    @Override
    public ICar createJeepCar() {
        return new JeepCar();
    }

    @Override
    public ICar createSportCar() {
        return new SportCar();
    }

    @Override
    public IFly createFly() {
        return new IFly() {
            @Override
            public void fly(int height) {
                System.out.println("S774首次试飞.......");
            }
        };
    }
}
