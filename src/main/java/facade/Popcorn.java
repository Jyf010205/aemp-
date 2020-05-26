package facade;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/5/26 11:05
 */
public class Popcorn {
    private static Popcorn instance = new Popcorn();

    private Popcorn(){

    }

    public static Popcorn GetInstance(){
        return instance;
    }

    public void on(){
        System.out.println("Popcorn on");
    }

    public void off(){
        System.out.println("Popcorn off");
    }

    public void pop(){
        System.out.println("Popcorn pop");
    }
}
