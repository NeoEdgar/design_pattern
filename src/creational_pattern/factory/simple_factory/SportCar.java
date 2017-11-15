package creational_pattern.factory.simple_factory;

/**
 * @Author:F.jq
 * @Date:Created in 2017/11/10.
 * @description _
 * <P>具体产品类：跑车</P>
 */
public class SportCar implements ICar {
    @Override
    public void getCar() {
        System.out.println("跑车进入赛道....");
    }
}
