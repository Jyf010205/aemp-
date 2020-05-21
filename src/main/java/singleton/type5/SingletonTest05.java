package singleton.type5;

/**
 * @author: jianyufeng
 * @description:双重检查
 * @date: 2020/5/12 21:58
 */
public class SingletonTest05 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
    }
}

class Singleton{
    private Singleton(){
    }
    //加入volatile关键字
    private static volatile Singleton instance;
    //提供一个静态的公有方法，加入双重检查代码，解决线程安全问题, 同时解决懒加载问题
    public static Singleton getInstance(){
        if (instance == null){
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
