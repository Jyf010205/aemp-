package vistor;

/**
 * @author: jianyufeng
 * @description: CEO访问者
 * @date: 2020/6/2 22:23
 */
public class CEOVisitor implements Visitor{
    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师: " + engineer.name + ", KPI: " + engineer.kpi);
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("经理: " + manager.name + ", KPI: " + manager.kpi +
                ", 新产品数量: " + manager.getProducts());
    }
}
