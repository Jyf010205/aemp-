package singleton.type6;

/**
 * @author: jianyufeng
 * @description:静态内部类
 * @date: 2020/5/12 22:13
 */
public class SingletonTest06 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
    }
}

class Singleton{
    //写一个静态内部类,该类中有一个静态属性 Singleton
    private static class SingletonInstance{
        private static final Singleton instance = new Singleton();
    }
    //提供一个静态的公有方法，直接返回静态内部类中的实例
    public static Singleton getInstance(){
        return SingletonInstance.instance;
    }
}
