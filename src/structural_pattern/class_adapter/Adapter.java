package structural_pattern.class_adapter;

/**
 * @Author:F.jq
 * @Date:Created in 2017/11/13.
 * @description _
 * <p>类适配器模式</p>
 * <P>
 *     模式所涉及的角色有：
 *     目标(Target)角色：这就是所期待得到的接口。注意：由于这里讨论的是类适配器模式，因此目标不可以是类。
 *     源(Adaptee)角色：现在需要适配的接口。
 *     适配器(Adaper)角色：适配器类是本模式的核心。适配器把源接口转换成目标接口。显然，这一角色不可以是接口，而必须是具体类。
 * </P>
 */
public class Adapter extends Adaptee implements Target{

    /**
     * 由于源类Adaptee没有方法sampleOperation2
     * 因此适配补充上这个方法
     */
    @Override
    public void sampleOperation2() {
        System.out.println("适配器补充上这个方法");
    }
}
