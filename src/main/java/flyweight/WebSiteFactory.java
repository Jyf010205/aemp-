package flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/5/28 21:49
 */
public class WebSiteFactory {
    private Map<String,WebSite> pool = new HashMap<>();

    public WebSite getWebSite(String type){
        if (!pool.containsKey(type)){
            pool.put(type,new ConcreateWebSite(type));
        }
        return pool.get(type);
    }

    public int getWebSiteCount(){
        return pool.size();
    }
}
