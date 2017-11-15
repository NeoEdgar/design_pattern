package structural_pattern.proxy.static_proxy;

/**
 * @Author:F.jq
 * @Date:Created in 2017/11/14.
 * @description _
 * <P>真实主题类</P>
 */
public class Admin implements Manager {

    @Override
    public void doSomething() {
        System.out.println("Admin do something");
    }
}
