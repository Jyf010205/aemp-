package observer.spring.service;

import observer.spring.entity.PaymentInfo;
import observer.spring.event.PaymentStatusUpdateEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

/**
 * @author: jianyufeng
 * @description: ApplicationEventPublisher事件源
 * @date: 2020/6/4 10:50
 */
@Service
public class PaymentService {
    @Autowired
    ApplicationEventPublisher publishEvent;

    public void pay(int newStatus,String msg){
        PaymentInfo paymentInfo = new PaymentInfo(newStatus, msg);
        PaymentStatusUpdateEvent paymentStatusUpdateEvent = new PaymentStatusUpdateEvent(paymentInfo);
        publishEvent.publishEvent(paymentStatusUpdateEvent);
    }
}
