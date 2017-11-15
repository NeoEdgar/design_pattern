package structural_pattern.decorator;

/**
 * @Author:F.jq
 * @Date:Created in 2017/11/14.
 * @description _
 * <P>具体构件(ConcreteComponent)角色：定义一个将要接收附加责任的类。</P>
 */
public class ConcreteComponent implements Component{

    @Override
    public void sampleOperation() {
        System.out.println(".....ConcreteComponent...");
    }
}
