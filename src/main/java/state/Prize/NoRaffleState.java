package state.Prize;

/**
 * @author: jianyufeng
 * @description: 不能抽奖的状态
 * @date: 2020/6/5 18:39
 */
public class NoRaffleState implements State{
    RaffleActivity activity;

    public NoRaffleState(RaffleActivity raffleActivity) {
        this.activity = raffleActivity;
    }

    @Override
    public void deductMoney() {
        System.out.println("扣钱成功，可以开始抽奖");
        activity.setState(activity.getCanRaffleState());
    }

    @Override
    public boolean raffle() {
        System.out.println("不能抽奖");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("不能领奖");
    }
}
