package observer.spring.listener;

import observer.spring.event.PaymentStatusUpdateEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author: jianyufeng
 * @description: 无序事件监听器 ApplicationListener监听器
 * @date: 2020/6/4 10:44
 */
//@Component
public class StockPaymentStatusUpdateListener implements ApplicationListener<PaymentStatusUpdateEvent> {
    @Override
    public void onApplicationEvent(PaymentStatusUpdateEvent event) {
        System.out.println("库存服务, 收到支付状态更新的事件. " + event + " - Thread: " + Thread.currentThread().getName());
    }
}
