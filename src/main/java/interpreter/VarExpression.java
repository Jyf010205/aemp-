package interpreter;

import java.util.HashMap;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/6/4 22:07
 */
public class VarExpression implements Expression{
    private String key;

    public VarExpression(String key){
        this.key = key;
    }
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(key);
    }
}
