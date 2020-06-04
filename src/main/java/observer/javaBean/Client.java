package observer.javaBean;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/6/3 22:23
 */
public class Client {
    public static void main(String[] args) {
        PaymentStatusUpdateBean paymentStatusUpdateBean = new PaymentStatusUpdateBean();
        paymentStatusUpdateBean.addPropertyChangeListener(new PaymentStatusUpdateListener());
        paymentStatusUpdateBean.updateState(3);
    }
}
