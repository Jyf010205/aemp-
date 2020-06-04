package observer.jdk;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/6/3 17:49
 */
public class Client {
    public static void main(String[] args) {
        // 被观察者,即事件源
        PaymentStatusObservable observable = new PaymentStatusObservable();

        observable.addObserver(new EmailObserver());
        observable.addObserver(new StockObserver());
        // 支付状态变更
        observable.updatePaymentStatus();
    }
}
