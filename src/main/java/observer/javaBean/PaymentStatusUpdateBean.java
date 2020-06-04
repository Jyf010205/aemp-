package observer.javaBean;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/6/3 22:15
 */
public class PaymentStatusUpdateBean {
    PropertyChangeSupport paymentlisteners = new PropertyChangeSupport(this);

    public void updateState(int newStatus){
        System.out.println("支付状态变更");
        paymentlisteners.firePropertyChange("paymentStatuUpdate",0,newStatus);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener){
        paymentlisteners.addPropertyChangeListener(listener);
    }
}
