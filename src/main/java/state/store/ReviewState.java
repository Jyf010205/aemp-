package state.store;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/6/5 23:00
 */
public class ReviewState extends AbstractState{
    @Override
    public void makePriceEvent(Context context) {
        context.setState(new PublishState());
    }

    @Override
    public String getCurrentState() {
        return StateEnum.REVIEWED.getName();
    }
}
