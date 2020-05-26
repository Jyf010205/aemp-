package facade;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/5/26 11:15
 */
public class Client {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
        System.out.println("----------");
        homeTheaterFacade.play();
        System.out.println("----------");
        homeTheaterFacade.end();
    }
}
