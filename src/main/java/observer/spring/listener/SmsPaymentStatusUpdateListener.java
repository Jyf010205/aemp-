package observer.spring.listener;

import observer.spring.entity.PaymentInfo;
import observer.spring.event.PaymentStatusUpdateEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/6/4 10:46
 */
@Component
public class SmsPaymentStatusUpdateListener {
    @Async
    @EventListener()
    public void PaymentStatusUpdate(PaymentStatusUpdateEvent event){
        PaymentInfo source = (PaymentInfo)event.getSource();
        System.out.println("邮件服务, 收到支付状态更新的通知. " + source+ " - Thread: " + Thread.currentThread().getName());
    }
}
