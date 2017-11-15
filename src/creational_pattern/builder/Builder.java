package creational_pattern.builder;

/**
 * @Author:F.jq
 * @Date:Created in 2017/11/13.
 * @description _
 * <P>抽象建造(将一个复杂对象的构造与它的表示分离，使同样的构建过程可以创建不同的表示，这样的设计模式被称为建造者模式)</P>
 * <p>1 builder:为创建一个产品对象的各个部件指定抽象接口。</p>
 * <p>2 ConcreteBuilder:实现Builder的接口以构造和装配该产品的各个部件，定义并明确它所创建的表示，并提供一个检索产品的接口。</p>
 * <p>3 Director:构造一个使用Builder接口的对象。</p>
 * <p>4 Product:表示被构造的复杂对象。ConcreteBuilder创建该产品的内部表示并定义它的装配过程，包含定义组成部件的类，包括将这些部件装配成最终产品的接口。</p>
 */
public interface Builder {

    //操作一
    void buildPartA();
    //操作二
    void buildPartB();
    //操作三
    void buildPartC();

    //产品
    //Product buildProduct();

}
