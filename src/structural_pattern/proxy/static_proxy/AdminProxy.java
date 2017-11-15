package structural_pattern.proxy.static_proxy;

/**
 * @Author:F.jq
 * @Date:Created in 2017/11/14.
 * @description _
 * <P>2/继承式静态代理</P>
 */
public class AdminProxy extends Admin {

    @Override
    public void doSomething() {
        System.out.println("Log:admin操作开始");
        super.doSomething();
        System.out.println("Log:admin操作结束");
    }

    public static void main(String[] args) {
        AdminProxy adminProxy = new AdminProxy();
        adminProxy.doSomething();
    }
}
