package strategy;

/**
 * @author: jianyufeng
 * @description: 正常收费
 * @date: 2020/6/6 11:46
 */
public class CashNormal implements CashSuper {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
