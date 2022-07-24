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
}
