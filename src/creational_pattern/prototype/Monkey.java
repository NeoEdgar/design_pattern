package creational_pattern.prototype;

import java.io.*;
import java.util.Date;

/**
 * @Author:F.jq
 * @Date:Created in 2017/11/13.
 * @description _
 * <P></P>
 */
public class Monkey implements Cloneable,Serializable {
    //身高
    private int height;
    //体重
    private int weight;
    //生日
    private Date birthDate;
    //金箍棒
    private GoldRingedStaff staff;
    /**
     * 构造函数
     */
    public Monkey(){
        this.birthDate = new Date();
        staff = new GoldRingedStaff();
    }
    /**
     * 克隆方法
     */
    public Object clone(){
        Monkey temp = null;
        try {
            temp = (Monkey) super.clone();
        } catch (CloneNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            return temp;
        }
    }

    /**
     * 利用序列化实现深度克隆
     *　　把对象写到流里的过程是序列化(Serialization)过程；而把对象从流中读出来的过程则叫反序列化(Deserialization)过程。
     *   应当指出的是，写到流里的是对象的一个拷贝，而原对象仍然存在于JVM里面。
     *　　在Java语言里深度克隆一个对象，常常可以先使对象实现Serializable接口，
     *   然后把对象（实际上只是对象的拷贝）写到一个流里（序列化），再从流里读回来（反序列化），便可以重建对象。
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public  Object deepClone() throws IOException, ClassNotFoundException{
        //将对象写到流里
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);
        //从流里读回来
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public Date getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    public GoldRingedStaff getStaff() {
        return staff;
    }
    public void setStaff(GoldRingedStaff staff) {
        this.staff = staff;
    }

}
