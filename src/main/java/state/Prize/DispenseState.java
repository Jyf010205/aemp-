package state.Prize;

/**
 * @author: jianyufeng
 * @description: 发放奖品的状态
 * @date: 2020/6/5 18:40
 */
public class DispenseState implements State{
    RaffleActivity activity;

    public DispenseState(RaffleActivity raffleActivity) {
        this.activity = raffleActivity;
    }
    @Override
    public void deductMoney() {
        System.out.println("不能扣钱");
    }

    @Override
    public boolean raffle() {
        System.out.println("不能抽奖");
        return false;
    }

    @Override
    public void dispensePrize() {
        if (activity.getRafflecount() > 0){
            System.out.println("请取走奖品");
            activity.setRafflecount(activity.getRafflecount()-1);
            activity.setState(activity.getNoRaffleState());
        }else {
            System.out.println("很遗憾奖品发完了");
            activity.setState(activity.getDispenseOutState());
            System.out.println("抽奖活动结束");
        }
    }
}
