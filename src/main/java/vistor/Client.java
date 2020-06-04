package vistor;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/6/2 22:25
 */
public class Client {
    public static void main(String[] args) {
        // 构建报表
        BusinessReport report = new BusinessReport();
        System.out.println("=========== CEO看报表 ===========");
        report.showReport(new CEOVisitor());
        System.out.println("=========== CTO看报表 ===========");
        report.showReport(new CTOVisitor());
    }
}
