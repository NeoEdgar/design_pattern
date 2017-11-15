package creational_pattern.factory.simple_factory;

/**
 * @Author:F.jq
 * @Date:Created in 2017/11/10.
 * @description _
 * <P></P>
 */
public enum CarType {

    SportCarType("跑车"),
    JeepCarType("越野"),
    HatchbackCar("两厢");

    private String path;

    CarType(String path) {
        this.path = path;
    }
}
