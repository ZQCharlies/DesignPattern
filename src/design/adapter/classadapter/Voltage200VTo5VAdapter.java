package design.adapter.classadapter;

/**
 * @Author: wzq
 * @Date: 2022/7/24
 * @Desc: 类适配器:电压适配器,将220V电压适配5V电压
 **/
public class Voltage200VTo5VAdapter extends Voltage220V implements IVoltage5V{

    @Override
    public int outPut5V() {
        //转换处理
        int src = this.outPut220V();
        int dst  = src/44;
        System.out.println("适配器输出电压(单位：V)："+dst);
        return dst;
    }
}
