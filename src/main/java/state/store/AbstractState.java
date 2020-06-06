package state.store;

/**
 * @author: jianyufeng
 * @description: 抽象类状态
 * @date: 2020/6/5 22:45
 */
public abstract class AbstractState implements State{
    protected static final RuntimeException exception = new RuntimeException("操作流程不允许");
    @Override
    public void checkEvent(Context context) {
        throw exception;
    }

    @Override
    public void checkFailEvent(Context context) {
        throw exception;
    }

    @Override
    public void makePriceEvent(Context context) {
        throw exception;
    }

    @Override
    public void acceptOrderEvent(Context context) {
        throw exception;
    }

    @Override
    public void notPeopleAcceptEvent(Context context) {
        throw exception;
    }

    @Override
    public void payOrderEvent(Context context) {
        throw exception;
    }

    @Override
    public void orderFailureEvent(Context context) {
        throw exception;
    }

    @Override
    public void feedBackEvent(Context context) {
        throw exception;
    }

    @Override
    public abstract String getCurrentState();
}
