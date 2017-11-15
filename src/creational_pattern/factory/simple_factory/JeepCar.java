package creational_pattern.factory.simple_factory;

/**
 * @Author:F.jq
 * @Date:Created in 2017/11/10.
 * @description _
 * <P>具体产品类：越野</P>
 */
public class JeepCar implements ICar {
    @Override
    public void getCar() {
        System.out.println("开始探险吧，Jeep...");
    }
}
