package design.adapter.interfaceadapter;

/**
 * @Author: wzq
 * @Date: 2022/7/24
 * @Desc: 接口适配器抽象类
 **/
public abstract class AbstractAdapter implements Interface4{

    @Override
    public int voltage110To5V(int v110) {
        return 0;
    }

    @Override
    public int voltage220To5V(int v220) {
        return 0;
    }
}
