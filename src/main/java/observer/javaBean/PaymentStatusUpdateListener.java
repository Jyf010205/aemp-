package observer.javaBean;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/6/3 22:22
 */
public class PaymentStatusUpdateListener implements PropertyChangeListener {
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.printf("支付状态变更. eventName : %s, oldValue : %s, newValue : %s", evt.getPropertyName(), evt.getOldValue(), evt.getNewValue());
    }
}
