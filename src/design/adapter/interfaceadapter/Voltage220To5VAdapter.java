package design.adapter.interfaceadapter;

/**
 * @Author: wzq
 * @Date: 2022/7/25
 * @Desc: 具体的适配器类
 **/
public class Voltage220To5VAdapter extends AbstractAdapter{

    @Override
    public int voltage220To5V() {
        int v220 = 220;
        System.out.println("接口适配器电压由"+v220+"V转换为5V");
        int dis = v220/44;
        return dis;
    }
}
