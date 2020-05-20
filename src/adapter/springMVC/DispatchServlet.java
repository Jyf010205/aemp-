package adapter.springMVC;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/5/19 11:12
 */
public class DispatchServlet {
    public static List<HandlerAdapter> handlerAdapters = new ArrayList<>();

    public DispatchServlet(){
        handlerAdapters.add(new HttpHandlerAdapter());
        handlerAdapters.add(new SimpleHandlerAdapter());
        handlerAdapters.add(new AnnotationHandlerAdapter());
    }

    public void doDispatch(Controller controller){
        HandlerAdapter adapter = getHandler(controller);
        adapter.handler(controller);
    }

    private HandlerAdapter getHandler(Controller controller){
        for (HandlerAdapter adapter : handlerAdapters){
            if(adapter.supports(controller)){
                return adapter;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        DispatchServlet dispatchServlet = new DispatchServlet();
        dispatchServlet.doDispatch(new HttpController());
    }
}


