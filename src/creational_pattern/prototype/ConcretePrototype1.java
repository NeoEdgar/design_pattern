package creational_pattern.prototype;

/**
 * @Author:F.jq
 * @Date:Created in 2017/11/13.
 * @description _
 * <P>具体原型（Concrete Prototype）角色：被复制的对象。此角色需要实现抽象的原型角色所要求的接口。</P>
 */
public class ConcretePrototype1 implements Prototype {

    //最简单的克隆，新建一个自身对象，由于没有属性就不在复制值了
    @Override
    public Prototype clone() {
        Prototype prototype = new ConcretePrototype1();
        return prototype;
    }
}
