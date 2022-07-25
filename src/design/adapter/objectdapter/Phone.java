package design.adapter.objectdapter;

import design.adapter.classadapter.IVoltage5V;

/**
 * @Author: wzq
 * @Date: 2022/7/24
 * @Desc: 类适配器模式使用
 **/
public class Phone {

    /**
     * 手机只能接收5V充电
     * @param iVoltage5V
     */
    public void charging(IVoltage5V iVoltage5V){
        if (iVoltage5V.outPut5V() == 5){
            System.out.println("手机开始充电");
        }else if (iVoltage5V.outPut5V() > 5){
            System.out.println("手机充电电压过高，无法充电");
        }
    }

    public static void main(String[] args) {
        Phone phone = new Phone();
        Voltage220V voltage220V = new Voltage220V();
        ObjectVoltageAdapter voltageAdapter = new ObjectVoltageAdapter(voltage220V);
        phone.charging(voltageAdapter);
    }
}
