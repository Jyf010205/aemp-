package strategy;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/6/6 11:48
 */
public class Client {
    public static void main(String[] args) {
        CashContext cashContext = new CashContext(new CashNormal());
        double result = cashContext.getResult(100);
        System.out.println(result);
        cashContext.setCashSuper(new CashRebate(0.5));
        result = cashContext.getResult(100);
        System.out.println(result);
    }
}
