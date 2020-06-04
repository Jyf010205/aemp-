package observer.spring.entity;

import lombok.Data;

/**
 * @author: jianyufeng
 * @description: 支付实体类
 * @date: 2020/6/4 10:42
 */
@Data
public class PaymentInfo {

    private int id;
    private String stauts;

    public PaymentInfo(int id, String stauts) {
        this.id = id;
        this.stauts = stauts;
    }
    @Override
    public String toString() {
        return "PaymentInfo{" +
                "id=" + id +
                ", stauts='" + stauts + '\'' +
                '}';
    }
}
