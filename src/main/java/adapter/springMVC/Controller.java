package adapter.springMVC;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/5/19 11:05
 */
public interface Controller {
}

class HttpController implements Controller{
    public void doHttpHandler(){
        System.out.println("http...");
    }
}

class SimpleController implements Controller{
    public void doSimpleHandler(){
        System.out.println("simple...");
    }
}

class AnnotationController implements Controller{
    public void doAnnotationHandler(){
        System.out.println("annotation...");
    }
}