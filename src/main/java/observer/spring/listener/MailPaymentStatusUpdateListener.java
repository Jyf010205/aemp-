package observer.spring.listener;

import observer.spring.entity.PaymentInfo;
import observer.spring.event.PaymentStatusUpdateEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;

/**
 * @author: jianyufeng
 * @description: 有序监听器
 * @date: 2020/6/4 10:45
 */
//@Component
public class MailPaymentStatusUpdateListener implements SmartApplicationListener {
    @Override
    public boolean supportsEventType(Class<? extends ApplicationEvent> eventType) {
        return eventType == PaymentStatusUpdateEvent.class;
    }

    @Override
    public boolean supportsSourceType(Class<?> sourceType) {
        return sourceType == PaymentInfo.class;
    }

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("邮件服务, 收到支付状态更新的通知. " + event+ " - Thread: " + Thread.currentThread().getName());
    }

    @Override
    public int getOrder() {
        return 1;
    }
}
