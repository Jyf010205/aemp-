package observer.Pattern;

/**
 * @author: jianyufeng
 * @description: 邮件服务
 * @date: 2020/6/3 17:27
 */
public class MyEmailObserver implements Observer{
    @Override
    public void update() {
        System.out.println("邮件服务受到通知");
    }
}
