package adapter.springMVC;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/5/19 11:02
 */
public interface HandlerAdapter {
    public boolean supports(Object handler);
    public void handler(Object handler);
}

class HttpHandlerAdapter implements HandlerAdapter{

    @Override
    public boolean supports(Object handler) {
        return (handler instanceof  HttpController);
    }

    @Override
    public void handler(Object handler) {
        ((HttpController)handler).doHttpHandler();
    }
}

class SimpleHandlerAdapter implements HandlerAdapter{

    @Override
    public boolean supports(Object handler) {
        return (handler instanceof  SimpleController);
    }

    @Override
    public void handler(Object handler) {
        ((SimpleController)handler).doSimpleHandler();
    }
}

class AnnotationHandlerAdapter implements HandlerAdapter{

    @Override
    public boolean supports(Object handler) {
        return (handler instanceof  AnnotationController);
    }

    @Override
    public void handler(Object handler) {
        ((AnnotationController)handler).doAnnotationHandler();
    }
}
