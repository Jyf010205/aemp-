package responsibilitychain;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/6/6 15:28
 */
public class SchoolMasterApprover extends Approver{
    public SchoolMasterApprover(String name) {
        this.name = name;
    }
    @Override
    void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() >= 30000 ){
            System.out.println("请求被" + this.name + "处理");
        }else {
            System.out.println("发生错误");
        }
    }
}
