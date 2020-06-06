package state.Prize;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/6/5 21:41
 */
public class Client {
    public static void main(String[] args) {
        RaffleActivity activity = new RaffleActivity();
        for (int i =0 ; i< 50 ; i++){
            activity.deductMoney();
            activity.raffle();
        }
    }
}
