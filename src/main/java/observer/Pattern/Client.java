package observer.Pattern;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/6/3 17:35
 */
public class Client {
    public static void main(String[] args) {
        MyPaymentStatusUpdateSubject subject = new MyPaymentStatusUpdateSubject();
        subject.addObserver(new MyEmailObserver());
        subject.addObserver(new MyStockObserver());
        subject.PaymentStatus();
    }
}
