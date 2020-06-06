package state.Prize;

/**
 * @author: jianyufeng
 * @description: 抽象状态类
 * @date: 2020/6/5 18:10
 */
public interface State {
    void deductMoney();

    boolean raffle();

    void dispensePrize();
}
