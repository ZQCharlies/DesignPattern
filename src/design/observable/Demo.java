package design.observable;

/**
 * @Author: wzq
 * @Date: 2022/8/17
 * @Desc:
 **/
public class Demo {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        subject.registerObserver(new ConcreteObserverOne());
        subject.registerObserver(new ConcreteObserverTwo());
        subject.notifyObservers("message");

    }
}
