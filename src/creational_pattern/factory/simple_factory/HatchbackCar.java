package creational_pattern.factory.simple_factory;

/**
 * @Author:F.jq
 * @Date:Created in 2017/11/10.
 * @description _
 * <P></P>
 */
public class HatchbackCar implements ICar {
    @Override
    public void getCar() {
        System.out.println("两厢车已经准备就绪...");
    }
}
