package state.store;

/**
 * @author: jianyufeng
 * @description: 订单生成状态
 * @date: 2020/6/5 22:55
 */
public class GenerateState extends AbstractState{
    @Override
    public void checkEvent(Context context) {
        context.setState(new ReviewState());
    }

    @Override
    public void checkFailEvent(Context context) {
        context.setState(new feedBackState());
    }

    @Override
    public String getCurrentState() {
        return StateEnum.GENERATE.getName();
    }
}
