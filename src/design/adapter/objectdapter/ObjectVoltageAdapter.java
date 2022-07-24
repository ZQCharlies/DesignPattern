package design.adapter.objectdapter;

import design.adapter.classadapter.IVoltage5V;

/**
 * @Author: wzq
 * @Date: 2022/7/24
 * @Desc: 对象类型适配器：电压适配器,将220V电压适配5V电压
 **/
public class ObjectVoltageAdapter implements IVoltage5V {

    //通过关联关系引入220V电源
    private Voltage220V voltage220V;

    public ObjectVoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int outPut5V() {
        //转换处理
        int src = voltage220V.outPut220V();
        int dst  = src/44;
        System.out.println("适配器输出电压(单位：V)："+dst);
        return dst;
    }
}
