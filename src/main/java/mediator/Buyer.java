package mediator;

/**
 * @author: jianyufeng
 * @description: 买方
 * @date: 2020/6/4 16:39
 */
public class Buyer extends Customer{

    public Buyer(String name) {
        super(name);
    }

    @Override
    void sendMessage() {
        System.out.println("买方发出消息");
        mediator.relay("卖方");
    }

    @Override
    void returnMessage() {
        System.out.println("买方收到消息");
    }
}
