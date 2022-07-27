package design.bridge;

/**
 * @Author: wzq
 * @Date: 2022/7/26
 * @Desc: 具体行为类
 **/
public class Oppo implements IBrand {
    @Override
    public void open() {
        System.out.println("oppo phone open");
    }

    @Override
    public void close() {
        System.out.println("oppo phone close");
    }

    @Override
    public void call() {
        System.out.println("oppo phone call");
    }
}
