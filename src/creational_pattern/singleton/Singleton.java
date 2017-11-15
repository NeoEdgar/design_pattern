package creational_pattern.singleton;

/**
 * @Author:F.jq
 * @Date:Created in 2017/11/10.
 * @description _
 * <P>实现：一是单例模式的类只提供私有的构造函数，二是类定义中含有一个该类的静态私有对象，三是该类提供了一个静态的公有的函数用于创建或获取它本身的静态私有对象。</P>
 * <p>懒汉，恶汉，双重校验锁，枚举 和 静态内部类</p>
 * <label>参考文档</label><a>http://cantellow.iteye.com/blog/838473</a>
 */
public class Singleton {

    //持有私有静态实例，防止被引用，此处赋值为null(懒汉式)，目的是实现延迟加载
    private static Singleton instance = null;

    //私有化构造方法，防止被实例化
    private Singleton() {
    }

    /**
     * 1、静态工程方法，创建实例
     * a.这种写法lazy loading很明显，但是致命的是在多线程不能正常工作。
     */
    public static Singleton getInstance() {
        if (null == instance){
            instance = new Singleton();
        }
        return instance;
    }


    /**
     * 2、满足多线程环境
     * a.锁在对象上，每次调用都会上锁，效率很低，99%情况下不需要同步,影响性能
     */
    public static synchronized Singleton getInstance2(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    /**
     * 3、双重锁形式 volatile synchronized
     * a.优化线程下，只在第一次创建对象时需要加锁
     * b.由于Java指令中创建对象和赋值操作是分开的，在复杂的多线程下，还是会发生错乱，并非理想
     */
    //private static volatile Singleton instance = null;
    public static Singleton getInstance3(){
        if (instance == null){
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    /**
     * 4、静态内部类维护单例的实现
     * a.利用JVM内部的机制保证当一个类被加载时，这个类的加载过程是线程互斥的。
     * b.JVM保证instance只被创建一次，并且保证把赋值给install的内存初始化完成。
     * c.只在第一次调用的时候使用互斥机制。提升了性能
     */
    //静态内部类维护单例的实现
    private static class SingletonFactory {
        //饿汉式
        private static Singleton instance = new Singleton();
    }
    //获取实例
    public static Singleton getInstance4(){
        return SingletonFactory.instance;
    }

    //如果该对象用于序列化，可以保证对象序列化前后保持一致
    public Object readResolve2(){
        return getInstance4();
    }

    /*-------------------------------------------------------------------------------------------------------*/
    /**
     * 5、因为我们只需要在创建类的时候进行同步，所以只要将创建和getInstance()分开，单独为创建加synchronized关键字
     * 采用"影子实例"的办法为单例对象的属性同步更新
     */
    private String properties = null;

    public String getProperties() {
        return properties;
    }

    private static synchronized void synInit(){
        if (instance == null){
            instance = new Singleton();
        }
    }

    public static Singleton getInstance5(){
        if (instance == null){
            synInit();
        }
        return instance;
    }

    public void updateProperties(){
        Singleton shadow = new Singleton();
        properties = shadow.getProperties();
    }

    /**
     * 6、枚举类实现
     * a.它不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象
     */
//    public enum Singleton {
//        INSTANCE;
//        public void whateverMethod() {
//        }
//    }

    /**
     * 1.如果单例由不同的类装载器装入，那便有可能存在多个单例类的实例。
     * 假定不是远端存取，例如一些servlet容器对每个servlet使用完全不同的类装载器，
     * 这样的话如果有两个servlet访问一个单例类，它们就都会有各自的实例。
     *
     * 2.如果Singleton实现了java.io.Serializable接口，那么这个类的实例就可能被序列化和复原。
     * 不管怎样，如果你序列化一个单例类的对象，接下来复原多个那个对象，那你就会有多个单例类的实例。
     */
    private static Class getClass(String classname) throws ClassNotFoundException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        if(classLoader == null) {
            classLoader = Singleton.class.getClassLoader();
        }
        return (classLoader.loadClass(classname));
    }
//    public class Singleton implements java.io.Serializable {
//        public static Singleton INSTANCE = new Singleton();
//        protected Singleton() {
//        }
//        private Object readResolve() {
//            return INSTANCE;
//        }
//    }


    public static void main(String[] args) {
        Singleton instance = getInstance();
        System.out.println("1/"+instance.hashCode());
        Singleton instance2 = getInstance2();
        System.out.println("2/"+instance2.hashCode());
        Singleton instance3 = getInstance3();
        System.out.println("3/"+instance3.hashCode());
        Singleton instance4_1 = getInstance4();
        System.out.println("4/"+instance4_1.hashCode());
        Singleton instance4_2 = getInstance4();
        System.out.println("4/"+instance4_2.hashCode());
        Singleton instance5 = getInstance5();
        System.out.println("5/"+instance5.hashCode());
    }
}