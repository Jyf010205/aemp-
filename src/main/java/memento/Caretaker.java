package memento;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/6/4 17:34
 */
public class Caretaker {
    Map<Integer,GameRole> gameRoleMap = new HashMap<>();

    public void setGameRole(Integer num,GameRole gameRole){
        gameRoleMap.put(num,gameRole);
    }

    public GameRole getGameRole(int num){
        return gameRoleMap.get(num);
    }
}
