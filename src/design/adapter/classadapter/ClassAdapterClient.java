package design.adapter.classadapter;

/**
 * @Author: wzq
 * @Date: 2022/7/24
 * @Desc: 类适配器客户端
 **/
public class ClassAdapterClient {

    public static void main(String[] args) {
        Phone phone = new Phone();
        Voltage200VTo5VAdapter voltage200VTo5VAdapter = new Voltage200VTo5VAdapter();
        phone.charging(voltage200VTo5VAdapter);
    }
}
