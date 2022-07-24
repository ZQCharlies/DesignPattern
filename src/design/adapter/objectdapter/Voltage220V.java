package design.adapter.objectdapter;

/**
 * @Author: wzq
 * @Date: 2022/7/24
 * @Desc: 被适配的类（220V电压）
 **/
public class Voltage220V {

    public int outPut220V(){
        int src = 220;
        System.out.println("适配器输入电压(单位：V)："+src);
        return src;
    }
}
