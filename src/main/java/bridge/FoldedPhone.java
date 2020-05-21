package bridge;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/5/20 15:45
 */
public class FoldedPhone extends Phone{
    public FoldedPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void websocket() {
        String websocket = brand.websocket();
        System.out.println("翻盖的" + websocket);
    }

}
