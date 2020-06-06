package state.Prize;

import lombok.Data;

/**
 * @author: jianyufeng
 * @description: 抽奖活动
 * @date: 2020/6/5 18:39
 */
@Data
public class RaffleActivity {
    //当前的状态
    private State state;
    //奖品的数量
    private Integer Rafflecount = 10;

    NoRaffleState noRaffleState = new NoRaffleState(this);
    CanRaffleState canRaffleState = new CanRaffleState(this);
    DispenseState dispenseState = new DispenseState(this);
    DispenseOutState dispenseOutState = new DispenseOutState(this);

    //构造方法
    public RaffleActivity() {
        state = noRaffleState;
    }

    //扣分
    public void deductMoney(){
        state.deductMoney();
    }

    //抽奖
    public void raffle(){
        if (state.raffle()){
            state.dispensePrize();
        }
    }

}
