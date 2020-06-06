package state.store;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/6/5 23:06
 */
public class feedBackState extends AbstractState{
    @Override
    public String getCurrentState() {
        return StateEnum.FEED_BACKED.getName();
    }
}
