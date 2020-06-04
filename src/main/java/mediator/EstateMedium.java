package mediator;

import java.util.HashMap;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/6/4 16:32
 */
public class EstateMedium implements Mediator{
    private HashMap<String,Customer> customers = new HashMap<>();

    @Override
    public void Registry(String name,Customer customer) {
        customers.put(name,customer);
        customer.setMediator(this);
    }

    @Override
    public void relay(String msg) {
        Customer customer = customers.get(msg);
        if (customer != null){
            customer.returnMessage();
        }
    }
}
