package structural_pattern.facade;

/**
 * @Author:F.jq
 * @Date:Created in 2017/11/15.
 * @description _
 * <P>子系统角色一：</P>
 * <p>子系统角色（Subsystem classes）：实现子系统的功能，并处理由Facade对象指派的任务。对子系统而言，facade和client角色是未知的，没有Facade的任何相关信息；即没有指向Facade的实例。</p>
 */
public class Light {

    public void on(){
        System.out.println("Light is open");
    }

    public void off(){
        System.out.println("Light is off");
    }
}
