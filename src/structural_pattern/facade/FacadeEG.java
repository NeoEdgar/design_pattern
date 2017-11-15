package structural_pattern.facade;

/**
 * @Author:F.jq
 * @Date:Created in 2017/11/15.
 * @description _
 * <P>外观角色（Facade）：是模式的核心，他被客户client角色调用，知道各个子系统的功能。同时根据客户角色已有的需求预订了几种功能组合\</P>
 * <p>外观模式案例：http://blog.csdn.net/hguisu/article/details/7533759</p>
 */
public class FacadeEG {

    private Light light;            //电灯
    private AirConditioner ac;      //空调
    private Fan fan;                //电扇
    private Television tv;          //电视

    public FacadeEG() {
        this.light = new Light();
        this.ac = new AirConditioner();
        this.fan = new Fan();
        this.tv = new Television();
    }

    /**
     * 晚上开电灯
     */
    public void night(int isOpen){
        if (isOpen == 1){
            light.on();
            ac.on();
            fan.on();
            tv.on();
        }else{
            light.off();
            ac.off();
            fan.off();
            tv.off();
        }
    }

    /**
     * 白天不需要开电灯
     */
    public void daytime(int isOpen){
        if (isOpen == 1){
            ac.on();
            fan.on();
            tv.on();
        }else{
            ac.off();
            fan.off();
            tv.off();
        }
    }
}
