package structural_pattern.proxy.static_proxy;

/**
 * @Author:F.jq
 * @Date:Created in 2017/11/14.
 * @description _
 * <P>1/以聚合方式实现的代理主题</P>
 */
public class AdminPoly implements Manager {

    private Admin admin;

    public AdminPoly(Admin admin) {
        this.admin = admin;
    }

    @Override
    public void doSomething() {
        System.out.println("Log:admin操作开始");
        admin.doSomething();
        System.out.println("Log:admin操作结束");
    }

    public static void main(String[] args) {
        Admin admin = new Admin();
        AdminPoly adminPoly = new AdminPoly(admin);
        adminPoly.doSomething();
    }
}
