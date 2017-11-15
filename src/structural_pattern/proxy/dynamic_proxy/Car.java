package structural_pattern.proxy.dynamic_proxy;

import java.util.Random;

/**
 * @Author:F.jq
 * @Date:Created in 2017/11/14.
 * @description _
 * <P>真实主题</P>
 */
public class Car implements Movable {

    @Override
    public void move() throws Exception {
        Thread.sleep(new Random().nextInt(1000));
        System.out.println("汽车行驶中....");
    }

}
