package singleton.type3;

/**
 * @author: jianyufeng
 * @description:懒汉式 线程不安全
 * @date: 2020/5/12 21:33
 */
public class SingletonTest03 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
    }
}

class Singleton{
    private static Singleton instance;

    private Singleton(){
    }
    //提供一个静态的公有方法，当使用到该方法时，才去创建 instance
    //即懒汉式
    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
