package observer.spring.event;

import observer.spring.entity.PaymentInfo;
import org.springframework.context.ApplicationEvent;

/**
 * @author: jianyufeng
 * @description: 支付状态更新事件 ApplicationEvent事件
 * @date: 2020/6/4 10:42
 */
public class PaymentStatusUpdateEvent extends ApplicationEvent {
    public PaymentStatusUpdateEvent(PaymentInfo source) {
        super(source);
    }
}
