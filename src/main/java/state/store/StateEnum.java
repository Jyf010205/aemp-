package state.store;

public enum StateEnum {
    //订单生成
    GENERATE(1,"订单生成"),
    //已审核
    REVIEWED(2,"已审核"),
    //已发布
    PUBLISHED(3,"已发布"),
    //待付款
    NOT_PAY(4,"待付款"),
    //已付款
    PAID(5,"已付款"),
    //已完结
    FEED_BACKED(6,"已完结");
    int key;
    String name;

    StateEnum(int key, String name) {
        this.key = key;
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
