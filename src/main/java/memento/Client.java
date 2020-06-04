package memento;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/6/4 17:38
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Caretaker caretaker = new Caretaker();
        GameRole gameRole = new GameRole(100,100,100);

        GameRole gameRole1 = gameRole.createGameRole();
        caretaker.setGameRole(1,gameRole1);

        //剩下50血
        gameRole.setBlo(50);
        GameRole gameRole2 = gameRole.createGameRole();
        caretaker.setGameRole(2,gameRole2);

        //剩下30血
        gameRole.setBlo(30);
        GameRole gameRole3 = gameRole.createGameRole();
        caretaker.setGameRole(3,gameRole3);
        gameRole.display();

        //恢复到状态1
        gameRole.recoverGameRole(caretaker.getGameRole(1));
        gameRole.display();
    }
}
