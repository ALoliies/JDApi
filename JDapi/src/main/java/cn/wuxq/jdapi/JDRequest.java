package cn.wuxq.jdapi;

import com.wxapi.WxApiCall.WxApiCall;
import com.wxapi.model.RequestModel;

import java.util.HashMap;
import java.util.Map;

public class JDRequest {

    public static  String getProducts(String base64) {
        RequestModel model = new RequestModel();
        model.setGwUrl("https://aiapi.jd.com/jdai/snapshop");
        model.setAppkey("3c7bd1e826e3618615952489aff94404");
        model.setSecretKey("c9414aaf1433e5272f86a95924df485c");
        model.setBodyStr("channel_id=test&imgBase64=" + base64);
        Map queryMap = new HashMap();
        model.setQueryParams(queryMap);
        WxApiCall call = new WxApiCall();
        call.setModel(model);
        return call.request();
    }

}
