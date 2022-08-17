package design.observable;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: wzq
 * @Date: 2022/8/17
 * @Desc: 具体被观察者
 **/
public class ConcreteSubject implements Subject{

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
