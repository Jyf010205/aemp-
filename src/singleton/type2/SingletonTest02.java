package singleton.type2;

/**
 * @author: jianyufeng
 * @description:饿汉式静态代码块
 * @date: 2020/5/12 21:04
 */
public class SingletonTest02 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
    }
}

//饿汉式(静态代码块)
class Singleton{
    private Singleton(){
    }
    private static Singleton instance;

    // 在静态代码块中，创建单例对象
    static {
        instance = new Singleton();
    }

    public static Singleton getInstance(){
        return instance;
    }
}
