package structural_pattern.decorator;

/**
 * @Author:F.jq
 * @Date:Created in 2017/11/14.
 * @description _
 * <P>具体装饰(ConcreteDecorator)角色：负责给构件对象“贴上”附加的责任。</P>
 */
public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void sampleOperation() {
        super.sampleOperation();
        System.out.println("重写相关ConcreteDecoratorB业务");
    }
}
