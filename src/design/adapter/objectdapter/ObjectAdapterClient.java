package design.adapter.objectdapter;

import design.adapter.classadapter.Phone;
import design.adapter.classadapter.ClassVoltageAdapter;

/**
 * @Author: wzq
 * @Date: 2022/7/24
 * @Desc: 对象适配器客户端
 **/
public class ObjectAdapterClient {

    public static void main(String[] args) {
        Phone phone = new Phone();
        Voltage220V voltage220V = new Voltage220V();
        ObjectVoltageAdapter voltageAdapter = new ObjectVoltageAdapter(voltage220V);
        phone.charging(voltageAdapter);
    }
}
