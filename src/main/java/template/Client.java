package template;

public class Client {
    public static void main(String[] args) {
        SoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
        peanutSoyaMilk.make();
        System.out.println("\n");

        SoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
        redBeanSoyaMilk.make();
        System.out.println("\n");

        NoSoyaMilk noSoyaMilk = new NoSoyaMilk();
        noSoyaMilk.make();
    }
}
