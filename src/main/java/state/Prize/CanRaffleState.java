package state.Prize;

import java.util.Random;

/**
 * @author: jianyufeng
 * @description: 可以抽奖的状态
 * @date: 2020/6/5 18:41
 */
public class CanRaffleState implements State{
    RaffleActivity activity;

    public CanRaffleState(RaffleActivity raffleActivity) {
        this.activity = raffleActivity;
    }
    @Override
    public void deductMoney() {
        System.out.println("已经扣除费用");
    }

    @Override
    public boolean raffle() {
        if (new Random().nextInt(10) >= 9){
            System.out.println("恭喜您中奖了");
            activity.setState(activity.getDispenseState());
            return true;
        }else {
            System.out.println("很遗憾没有抽中奖品");
            activity.setState(activity.getNoRaffleState());
            return false;
        }
    }

    @Override
    public void dispensePrize() {
        System.out.println("不能领奖");
    }
}
