package interpreter;

import java.util.HashMap;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/6/4 22:09
 */
public class SymbolExpression implements Expression{
    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return 0;
    }
}
