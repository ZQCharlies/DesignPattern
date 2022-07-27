package design.bridge;

/**
 * @Author: wzq
 * @Date: 2022/7/26
 * @Desc: 桥接类，聚合了抽象行为类（Brand）
 **/
public abstract class AbstractPhone {
    //持有抽象的IBrand行为类
    private IBrand iBrand;

    public AbstractPhone(IBrand iBrand) {
        this.iBrand = iBrand;
    }

    protected void open() {
        this.iBrand.open();
    }
    protected void close() {
        this.iBrand.close();
    }
    protected void call() {
        this.iBrand.call();
    }
}
