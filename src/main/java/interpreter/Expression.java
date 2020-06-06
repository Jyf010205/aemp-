package interpreter;

import java.util.HashMap;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/6/4 22:06
 */
public interface Expression {
    int interpreter(HashMap<String,Integer> var);
}
