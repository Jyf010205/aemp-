package strategy;

/**
 * @author: jianyufeng
 * @description: 打折收费
 * @date: 2020/6/6 11:46
 */
public class CashRebate implements CashSuper{
    private double moneyRebate = 1;

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}
