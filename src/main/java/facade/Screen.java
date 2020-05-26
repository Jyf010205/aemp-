package facade;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/5/26 11:08
 */
public class Screen {
    private static Screen instance = new Screen();

    private Screen(){

    }

    public static Screen GetInstance(){
        return instance;
    }

    public void up(){
        System.out.println("Screen up");
    }

    public void down(){
        System.out.println("Screen down");
    }

}
