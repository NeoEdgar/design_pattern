package creational_pattern.factory.simple_factory;

/**
 * @Author:F.jq
 * @Date:Created in 2017/11/10.
 * @description _
 * <P>简单工厂核心代码</P>
 * <mark>简单工厂的优点/缺点</mark>
 * <ui>
 *    <li>优点：简单工厂模式能够根据外界给定的信息，决定究竟应该创建哪个具体类的对象。明确区分了各自的职责和权力，有利于整个软件体系结构的优化。</li>
 *    <li>缺点：很明显工厂类集中了所有实例的创建逻辑，容易违反GRASPR的高内聚的责任分配原则</li>
 * </ui>
 * <p>工厂模式适合：凡是出现了大量的产品需要创建，并且具有共同的接口时，可以通过工厂方法模式进行创建。
 * 在以上的三种模式中，第一种如果传入的字符串有误，不能正确创建对象，第三种相对于第二种，不需要实例化工厂类，
 * 所以，大多数情况下，我们会选用第三种——静态工厂方法模式。</p>
 */
public class CarFactory {

    /**
     * 普通工厂模式
     * 通过传递参数来选择要创建的对象
     * @param type
     */
    public ICar GetCar(CarType type) throws Exception{
        switch (type){
            case SportCarType:
                return new SportCar();
            case JeepCarType:
                return new JeepCar();
            case HatchbackCar:
                return new HatchbackCar();
            default:
                throw new Exception("只有野马...");
        }
    }

    /**
     * 多个工厂模式
     * 工厂内提供多个方法来创建对象
     */
    public SportCar createSportCar(){
        return new SportCar();
    }
    public JeepCar createJeepCar(){
        return new JeepCar();
    }
    public HatchbackCar createHatchbackCar(){
        return new HatchbackCar();
    }

    /**
     * 静态工厂模式
     * 不需要new一个工厂，直接类名点出方法
     */
    public static SportCar createStaticSportCar(){
        return new SportCar();
    }
    public static JeepCar createStaticJeepCar(){
        return new JeepCar();
    }
    public static HatchbackCar createStaticHatchbackCar(){
        return new HatchbackCar();
    }


    //本地测试
    public static void main(String[] args) {
        //普通工厂模式-------------------------------
        try {
            CarFactory carFactory = new CarFactory();
            ICar iCar = carFactory.GetCar(CarType.SportCarType);
            iCar.getCar();
        }catch (Exception e){
        }

        //多个工厂模式-------------------------------
        CarFactory carFactory = new CarFactory();
        JeepCar jeepCar = carFactory.createJeepCar();
        jeepCar.getCar();

        //静态工厂模式-------------------------------
        HatchbackCar hatchbackCar = CarFactory.createStaticHatchbackCar();
        hatchbackCar.getCar();

    }
}
