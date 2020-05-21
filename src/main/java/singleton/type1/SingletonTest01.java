package singleton.type1;

/**
 * @author: jianyufeng
 * @description:饿汉式静态变量
 * @date: 2020/5/12 20:54
 */
public class SingletonTest01 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
    }
}

//饿汉式(静态变量)
class Singleton{
    //1. 构造器私有化,外部不能new
    private Singleton(){
    }
    //2.本类内部创建对象实例
    private static final Singleton instance = new Singleton();
    //3.向外暴露静态的方法,返回实例对象
    public static Singleton getInstance(){
        return instance;
    }
}
