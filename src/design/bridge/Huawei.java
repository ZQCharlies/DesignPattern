package design.bridge;

/**
 * @Author: wzq
 * @Date: 2022/7/26
 * @Desc: 具体行为类
 **/
public class Huawei implements IBrand {

    @Override
    public void open() {
        System.out.println("Huawei phone open");
    }

    @Override
    public void close() {
        System.out.println("Huawei phone close");
    }

    @Override
    public void call() {
        System.out.println("Huawei phone call");
    }
}
