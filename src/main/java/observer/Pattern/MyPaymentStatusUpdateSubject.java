package observer.Pattern;

import java.util.List;
import java.util.Vector;

/**
 * @author: jianyufeng
 * @description: 更改支付状态的被观察者
 * @date: 2020/6/3 17:30
 */
public class MyPaymentStatusUpdateSubject implements Subject{
    private List<Observer> observers = new Vector<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observers.contains(observer)){
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        observers.forEach(Observer->{
            Observer.update();
        });
    }

    public void PaymentStatus(){
        System.out.println("支付状态改变");
        this.notifyObservers();
    }
}
