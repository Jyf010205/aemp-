package mediator;

/**
 * @author: jianyufeng
 * @description: 抽象中介者
 * @date: 2020/6/4 16:12
 */
public interface Mediator {
    void Registry(String name,Customer customer);

    void relay(String msg);
}
