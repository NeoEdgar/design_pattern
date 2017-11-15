package structural_pattern.interface_adapter;

/**
 * @Author:F.jq
 * @Date:Created in 2017/11/14.
 * @description _
 * <P></P>
 */
public class WrapperTest {

    public static void main(String[] args) {
        AdapteeSub1 adapteeSub1 = new AdapteeSub1();
        AdapteeSub2 adapteeSub2 = new AdapteeSub2();

        adapteeSub2.method1();
        adapteeSub2.method2();
        adapteeSub1.method1();
        adapteeSub1.method2();

    }
}
