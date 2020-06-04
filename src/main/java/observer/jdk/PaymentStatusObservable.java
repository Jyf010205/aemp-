package observer.jdk;

import java.util.Observable;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/6/3 17:47
 */
public class PaymentStatusObservable extends Observable {
    
    public void updatePaymentStatus() {
        // 业务逻辑操作
        System.out.println("更新新的支付状态");

        // 通知观察者
        this.setChanged();//需要调用一下这这方法，表示被观察者的状态已发生变更，Observable才会通知观察者
        this.notifyObservers();
    }
}
