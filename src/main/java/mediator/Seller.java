package mediator;

/**
 * @author: jianyufeng
 * @description: 卖方
 * @date: 2020/6/4 16:39
 */
public class Seller extends Customer{

    public Seller(String name) {
        super(name);
    }

    @Override
    void sendMessage() {
        System.out.println("卖方发出消息");
        mediator.relay("买方");
    }

    @Override
    void returnMessage() {
        System.out.println("卖方收到消息");
    }
}
