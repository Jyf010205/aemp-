package observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * @author: jianyufeng
 * @description: 邮件服务
 * @date: 2020/6/3 17:45
 */
public class EmailObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("邮件服务收到通知");
    }
}
