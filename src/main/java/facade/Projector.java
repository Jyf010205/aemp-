package facade;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/5/26 11:07
 */
public class Projector {
    private static Projector instance = new Projector();

    private Projector(){

    }

    public static Projector GetInstance(){
        return instance;
    }

    public void on(){
        System.out.println("Projector on");
    }

    public void off(){
        System.out.println("Projector off");
    }

    public void focus(){
        System.out.println("Projector focus");
    }
}
