package facade;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/5/26 11:01
 */
public class DVDPlayer {
    private static DVDPlayer instance = new DVDPlayer();

    private DVDPlayer(){

    }

    public static DVDPlayer GetInstance(){
        return instance;
    }

    public void on(){
        System.out.println("DVD on");
    }

    public void off(){
        System.out.println("DVD off");
    }

    public void play(){
        System.out.println("DVD play");
    }

    public void pause(){
        System.out.println("DVD pause");
    }
}
