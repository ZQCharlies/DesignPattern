package design.adapter.interfaceadapter;

/**
 * @Author: wzq
 * @Date: 2022/7/24
 * @Desc: 接口适配器抽象类
 **/
public abstract class AbstractAdapter implements IVoltage {

    @Override
    public int voltage110To5V() {
        return 0;
    }

    @Override
    public int voltage220To5V() {
        return 0;
    }
}
