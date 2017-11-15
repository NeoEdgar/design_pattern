package creational_pattern.prototype;

import java.io.IOException;

/**
 * @Author:F.jq
 * @Date:Created in 2017/11/13.
 * @description _
 * <P></P>
 */
public class TheGreatestSage {
    private Monkey monkey = new Monkey();

    public void change() throws IOException, ClassNotFoundException {
        //克隆大圣本尊(浅克隆)
        System.out.println("---------------------------浅克隆-----------------------------");
        Monkey copyMonkey = (Monkey)monkey.clone();
        System.out.println("大圣本尊的生日是：" + monkey.getBirthDate());
        System.out.println("克隆的大圣的生日是：" + copyMonkey.getBirthDate());
        System.out.println("大圣本尊跟克隆的大圣是否为同一个对象 " + (monkey == copyMonkey));
        System.out.println("大圣本尊持有的金箍棒 跟 克隆的大圣持有的金箍棒是否为同一个对象？ " + (monkey.getStaff() == copyMonkey.getStaff()));
        //深度克隆
        System.out.println("---------------------------深度克隆-----------------------------");
        Monkey deepCopyMonkey = (Monkey)monkey.deepClone();
        System.out.println("大圣本尊的生日是：" + monkey.getBirthDate());
        System.out.println("克隆的大圣的生日是：" + deepCopyMonkey.getBirthDate());
        System.out.println("大圣本尊跟克隆的大圣是否为同一个对象 " + (monkey == deepCopyMonkey));
        System.out.println("大圣本尊持有的金箍棒 跟 克隆的大圣持有的金箍棒是否为同一个对象？ " + (monkey.getStaff() == deepCopyMonkey.getStaff()));

    }

    public static void main(String[]args) throws IOException, ClassNotFoundException {
        TheGreatestSage sage = new TheGreatestSage();
        sage.change();
    }
}