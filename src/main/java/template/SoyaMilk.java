package template;

public abstract class SoyaMilk {

    final void make(){
        select();
        addCondiments();
        soak();
        beat();
    }

    void select(){
        System.out.println("第一步:选择好的新鲜黄豆");
    }

    abstract void addCondiments();

    void soak(){
        System.out.println("第三部，黄豆和配料开始浸泡,需要 3 小时");
    }

    void beat(){
        System.out.println("第四步：黄豆和配料放到豆浆机去打碎");
    }
}
