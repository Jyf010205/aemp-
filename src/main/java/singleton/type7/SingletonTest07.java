package singleton.type7;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/5/12 22:18
 */
public class SingletonTest07 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance1 == instance2);
        instance1.Say();
    }
}

enum Singleton{
    INSTANCE;
    public void Say(){
        System.out.println("ok!");
    }
}
