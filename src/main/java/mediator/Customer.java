package mediator;

/**
 * @author: jianyufeng
 * @description: 客户
 * @date: 2020/6/4 16:31
 */
public abstract class Customer {
    public String name;

    protected Mediator mediator;

    public Customer(String name){
        this.name = name;
    }

    public void setMediator(Mediator mediator){
        this.mediator = mediator;
    }

    abstract void sendMessage();

    abstract void returnMessage();
}
