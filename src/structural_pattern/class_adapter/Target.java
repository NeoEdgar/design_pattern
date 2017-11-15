package structural_pattern.class_adapter;

/**
 * @Author:F.jq
 * @Date:Created in 2017/11/13.
 * @description _
 * <P></P>
 */
public interface Target {

    /**
     * 这是源类Adaptee也有的方法
     */
    public void sampleOperation1();

    /**
     * 这是源类Adaptee没有的方法
     */
    public void sampleOperation2();
}
