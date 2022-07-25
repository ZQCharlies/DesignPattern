package design.adapter.interfaceadapter;

/**
 * @Author: wzq
 * @Date: 2022/7/25
 * @Desc: 具体的适配器类
 **/
public class Voltage110To5VAdapter extends AbstractAdapter{

    public int voltage110To5V() {
        int v110 = 110;
        System.out.println("接口适配器电压由"+v110+"V转换为5V");
        int dis = v110/44;
        return dis;
    }
}
