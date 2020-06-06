package state.store;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/6/5 23:04
 */
public class notPayState extends AbstractState{
    @Override
    public void payOrderEvent(Context context) {
        context.setState(new PaidState());
    }

    @Override
    public void orderFailureEvent(Context context) {
        context.setState(new feedBackState());
    }

    @Override
    public String getCurrentState() {
        return StateEnum.NOT_PAY.getName();
    }
}
