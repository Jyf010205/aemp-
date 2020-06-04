package observer.Pattern;

/**
 * @author: jianyufeng
 * @description: 被观察者
 * @date: 2020/6/3 17:28
 */
public interface Subject {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
