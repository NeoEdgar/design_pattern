package structural_pattern.facade;

/**
 * @Author:F.jq
 * @Date:Created in 2017/11/15.
 * @description _
 * <P>客户角色（client）：调用facade角色获得完成相应的功能。</P>
 */
public class Client {

    public static void main(String[] args) {
        FacadeEG facade = new FacadeEG();
        System.out.println("-----daytime----");
        facade.daytime(0);
        System.out.println("-----night----");
        facade.night(1);
    }
}
