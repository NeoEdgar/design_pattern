package creational_pattern.builder;

/**
 * @Author:F.jq
 * @Date:Created in 2017/11/13.
 * @description _
 * <P>建造者</P>
 */
public class Director {

    //产品放在Builder接口，还是实现类自己定义，此处建造参数是否为具体实现类参数
    public Product construct(ConcreteBuilder builder){
        System.out.println("指挥建造流程");
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.buildProduct();
    }

    //测试
    public static void main(String[] args) {
        Director director = new Director();
        Product product = director.construct(new ConcreteBuilder());
        System.out.println(product);
        System.out.println("结束完成建造");
    }
}
