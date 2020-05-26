package bridge;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/5/21 10:28
 */
public class UpRightPhone extends Phone {
    public UpRightPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void websocket() {
        String websocket = brand.websocket();
        System.out.println("滑盖手机" + websocket);
    }
}
