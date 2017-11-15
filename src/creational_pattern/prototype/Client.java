package creational_pattern.prototype;

/**
 * @Author:F.jq
 * @Date:Created in 2017/11/13.
 * @description _
 * <P></P>
 */
public class Client {

    /**
     * 持有需要使用的原型接口对象
     */
    private Prototype prototype;

    /**
     * 构造方法，传入需要使用的原型接口对象
     */
    public Client(Prototype prototype){
        this.prototype = prototype;
    }

    public void operation(ConcretePrototype1 prototype){
        Prototype clone = prototype.clone();
    }
}
