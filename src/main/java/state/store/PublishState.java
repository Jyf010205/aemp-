package state.store;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/6/5 23:03
 */
public class PublishState extends AbstractState{
    @Override
    public void acceptOrderEvent(Context context) {
        context.setState(new notPayState());
    }

    @Override
    public void notPeopleAcceptEvent(Context context) {
        context.setState(new feedBackState());
    }

    @Override
    public String getCurrentState() {
        return StateEnum.PUBLISHED.getName();
    }
}
