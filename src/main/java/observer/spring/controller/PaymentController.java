package observer.spring.controller;

import observer.spring.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/6/4 11:01
 */
public class PaymentController {
    @Autowired
    PaymentService paymentService;

    public void test(){
        for (int i = 0; i < 50 ; i++){
            paymentService.pay(1,"支付成功");
        }
    }
}
