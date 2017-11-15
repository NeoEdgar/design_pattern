package structural_pattern.proxy.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author:F.jq
 * @Date:Created in 2017/11/14.
 * @description _
 * <P>事务处理器</P>
 */
public class TimeHandler implements InvocationHandler {

    private Object target;

    public TimeHandler(Object target) {
        this.target = target;
    }

    /**
     * @param proxy 被代理的对象
     * @param method 被代理对象的方法
     * @param args 方法的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long startTime = System.currentTimeMillis();
        System.out.println("汽车开始行驶...");
        method.invoke(target,args);
        long endTime = System.currentTimeMillis();
        System.out.println("汽车行驶时间："+(endTime-startTime)+"毫秒！");
        return null;
    }

    public static void main(String[] args) throws Exception {
        Car car = new Car();
        TimeHandler timeHandler = new TimeHandler(car);
        Class<? extends Car> cls = car.getClass();
        /**
         * 类加载器
         */
        Movable m = (Movable)Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), timeHandler);
        m.move();
    }
}
