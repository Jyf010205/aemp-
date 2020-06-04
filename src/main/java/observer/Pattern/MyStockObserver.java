package observer.Pattern;

/**
 * @author: jianyufeng
 * @description: 库存服务
 * @date: 2020/6/3 17:26
 */
public class MyStockObserver implements Observer{
    @Override
    public void update() {
        System.out.println("库存服务收到通知");
    }
}
