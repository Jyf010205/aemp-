package state.store;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/6/5 23:20
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new GenerateState());
        context.checkFailEvent(context);
    }
}
