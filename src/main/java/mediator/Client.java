package mediator;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/6/4 16:59
 */
public class Client {
    public static void main(String[] args) {
        EstateMedium medium = new EstateMedium();

        Buyer buyer = new Buyer("买方");
        Seller seller = new Seller("卖方");

        medium.Registry(buyer.name,buyer);
        medium.Registry(seller.name,seller);

        seller.sendMessage();
    }
}
