package strategy;

import lombok.Data;

/**
 * @author: jianyufeng
 * @description: 传入收费策略
 * @date: 2020/6/6 11:43
 */
@Data
public class CashContext {
    private CashSuper cashSuper;

    public CashContext(CashSuper cashSuper){
        this.cashSuper = cashSuper;
    }

    public double getResult(double money){
        return cashSuper.acceptCash(money);
    }

}
