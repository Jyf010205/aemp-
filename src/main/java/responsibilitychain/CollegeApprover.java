package responsibilitychain;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/6/6 15:26
 */
public class CollegeApprover extends Approver {
    public CollegeApprover(String name) {
        this.name = name;
    }
    @Override
    void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() > 5000 && purchaseRequest.getPrice() <=10000){
            System.out.println("请求被" + this.name + "处理");
        }else {
            nextApprover.processRequest(purchaseRequest);
        }
    }
}
