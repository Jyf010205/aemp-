package observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/6/3 17:46
 */
public class StockObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("库存服务收到通知");
    }
}
