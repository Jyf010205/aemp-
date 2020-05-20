package singleton.type4;

/**
 * @author: jianyufeng
 * @description:懒汉式 线程安全
 * @date: 2020/5/12 21:54
 */
public class SingletonTest04 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
    }
}

class Singleton{
    private static Singleton instance;

    private Singleton(){

    }
    //提供一个静态的公有方法，加入同步处理的代码，解决线程安全问题
    public synchronized static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
