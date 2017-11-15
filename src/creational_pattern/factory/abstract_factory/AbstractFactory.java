package creational_pattern.factory.abstract_factory;

import creational_pattern.factory.simple_factory.ICar;

/**
 * @Author:F.jq
 * @Date:Created in 2017/11/13.
 * @description _
 * <P>抽象工厂，可以实现不同接口,为了实现一些公共的、同类型的产品</P>
 * <p>
 *    为创建一组相关或相互依赖的对象提供一个接口，而且无需指定他们的具体类。
 *    同样在下面的结构图中，我们可以更好地解释这一定义。
 *    我们的抽象工厂中包含一系列的去构造一个抽象产品的方法，而具体产品的实现则是放在了具体工厂
 * </p>
 */
public abstract class AbstractFactory {

    public abstract ICar createJeepCar();

    public abstract ICar createSportCar();

    public abstract IFly createFly();

}
