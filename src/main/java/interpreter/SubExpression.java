package interpreter;

import java.util.HashMap;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/6/4 22:12
 */
public class SubExpression extends SymbolExpression{

    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return left.interpreter(var) - right.interpreter(var);
    }
}
