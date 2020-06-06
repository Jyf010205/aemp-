package responsibilitychain;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/6/6 15:27
 */
public class ViceSchoolMasterApprover extends Approver{
    public ViceSchoolMasterApprover(String name) {
        this.name = name;
    }
    @Override
    void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() > 10000 && purchaseRequest.getPrice() <=30000){
            System.out.println("请求被" + this.name + "处理");
        }else {
            nextApprover.processRequest(purchaseRequest);
        }
    }
}
