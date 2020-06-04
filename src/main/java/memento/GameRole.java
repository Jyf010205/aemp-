package memento;

import cn.hutool.json.JSONUtil;
import lombok.Data;
import prototype.shallow.Sheep;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/6/4 17:22
 */
@Data
public class GameRole implements Cloneable{
    private int blo;
    private int atk;
    private int def;

    public GameRole(int blo, int atk, int def) {
        this.blo = blo;
        this.atk = atk;
        this.def = def;
    }

    public GameRole createGameRole() throws CloneNotSupportedException {
        return (GameRole) this.clone();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void recoverGameRole(GameRole gameRole){
        blo = gameRole.blo;
        atk = gameRole.atk;
        def = gameRole.def;
    }

    public void display(){
        System.out.println(JSONUtil.toJsonStr(this));
    }
}
