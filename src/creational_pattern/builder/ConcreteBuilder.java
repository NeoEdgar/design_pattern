package creational_pattern.builder;

/**
 * @Author:F.jq
 * @Date:Created in 2017/11/13.
 * @description _
 * <P>具体的建造</P>
 */
public class ConcreteBuilder implements Builder {

    private Product product;

    public ConcreteBuilder() {
        this.product = new Product();
    }

    @Override
    public void buildPartA() {
        System.out.println("建造部件basic");
        product.setBasic("地基");
    }

    @Override
    public void buildPartB() {
        System.out.println("建造部件wall");
        product.setWall("砌墙");
    }

    @Override
    public void buildPartC() {
        System.out.println("建造部件roofed");
        product.setRoofed("封顶");
    }

    public Product buildProduct(){
        return product;
    }
}
