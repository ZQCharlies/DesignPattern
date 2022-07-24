package design.adapter.interfaceadapter;

/**
 * @Author: wzq
 * @Date: 2022/7/24
 * @Desc: 接口适配器客户端
 **/
public class InterfaceAdapterClient {

    public static void main(String[] args) {
        AbstractAdapter abstract220VAdapter = new AbstractAdapter(){
            @Override
            public int voltage220To5V(int v220) {
                System.out.println("接口适配器电压由"+v220+"V转换为5V");
                int dis = v220/44;
                return dis;
            }
        };

        AbstractAdapter abstract110VAdapter = new AbstractAdapter(){
            @Override
            public int voltage110To5V(int v110) {
                System.out.println("接口适配器电压由"+v110+"V转换为5V");
                int dis = v110/44;
                return dis;
            }
        };

        Phone phone = new Phone();
        int v5v = abstract220VAdapter.voltage220To5V(220);
        v5v = abstract110VAdapter.voltage110To5V(110);

        phone.charging(v5v);
    }
}
