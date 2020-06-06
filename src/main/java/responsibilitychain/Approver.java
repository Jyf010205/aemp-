package responsibilitychain;

import lombok.Data;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/6/6 15:20
 */
@Data
public abstract class Approver {
    protected Approver nextApprover;
    protected String name;
    abstract void processRequest(PurchaseRequest purchaseRequest);
}
