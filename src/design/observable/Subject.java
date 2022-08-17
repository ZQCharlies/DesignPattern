package design.observable;

/**
 * @Author: wzq
 * @Date: 2022/8/17
 * @Desc: 被订阅者
 **/
public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(String message);

}
