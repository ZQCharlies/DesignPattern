package design.adapter.interfaceadapter;

/**
 * @Author: wzq
 * @Date: 2022/7/24
 * @Desc: 接口适配器模式使用
 **/
public class Phone {

    public void charging(int disVoltage){
        if (disVoltage == 5){
            System.out.println("手机开始充电");
        }else if (disVoltage > 5){
            System.out.println("手机充电电压过高，无法充电");
        }
    }

    public static void main(String[] args) {
//        AbstractAdapter abstract220VAdapter = new AbstractAdapter(){
//            @Override
//            public int voltage220To5V() {
//                int v220 = 220;
//                System.out.println("接口适配器电压由"+v220+"V转换为5V");
//                int dis = v220/44;
//                return dis;
//            }
//        };
//
//        AbstractAdapter abstract110VAdapter = new AbstractAdapter(){
//            @Override
//            public int voltage110To5V() {
//                int v110 = 110;
//                System.out.println("接口适配器电压由"+v110+"V转换为5V");
//                int dis = v110/44;
//                return dis;
//            }
//        };

        Phone phone = new Phone();
        int v5v = 0;

        v5v = new Voltage110To5VAdapter().voltage110To5V();
        v5v = new Voltage220To5VAdapter().voltage110To5V();

        phone.charging(v5v);
    }
}
