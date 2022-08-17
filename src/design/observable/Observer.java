package design.observable;

/**
 * @Author: wzq
 * @Date: 2022/8/17
 * @Desc: 抽象观察者
 **/
public interface Observer {

    void update(String message);
}
