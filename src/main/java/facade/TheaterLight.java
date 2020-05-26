package facade;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/5/26 11:09
 */
public class TheaterLight {
    private static TheaterLight instance = new TheaterLight();

    private TheaterLight(){

    }

    public static TheaterLight GetInstance(){
        return instance;
    }

    public void on(){
        System.out.println("TheaterLight on");
    }

    public void off(){
        System.out.println("TheaterLight off");
    }

    public void bright(){
        System.out.println("TheaterLight bright");
    }

    public void dim(){
        System.out.println("TheaterLight dim");
    }
}
