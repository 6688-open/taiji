package cn.com.taiji.web.controller.data;

import cn.com.taiji.common.base.AjaxResult;
import cn.com.taiji.common.utils.http.HttpUtils;
import cn.com.taiji.framework.web.base.BaseController;
import cn.com.taiji.system.domain.Test;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;


@RestController
@RequestMapping("/data")
public class DataController extends BaseController {


    private static final String CLIENT_ID = "57c2727d921f4c84bae6bf9553ae8589";
    private static final String CLIENT_SECRET = "aac706cfc64c4131bad8f76d681a7043";

   // private static final String API_1 = "http://10.18.17.84:9090/service/api/e683749f93e24d9e81d595ec87815360/api";
     private static final String API_1 = "http://10.18.17.84:9090/service/api/1a99e3cafd344814ba93304ab41db22d/api";

    /**
     * Token URL
     */
    private static final String TOKEN_URL = "http://10.18.17.84:9090/oauth/token";


    private static String getToken() throws Exception {
        String params = "client_id=" + CLIENT_ID + "&client_secret=" + CLIENT_SECRET;
        String result = HttpUtils.sendGet(TOKEN_URL, params);
        //   String result = "{\"access_token\":\"7c2046c9311049ccbadb0660965003c5\",\"token_type\":\"bearer\",\"expires_in\":300}";
       // JSONObject jsonObject = JSON.unmarshal(result, JSONObject.class);
       // String token = jsonObject.getStr("access_token");
        //return token;
        return null;
    }


    @GetMapping("/api1")
    public AjaxResult api1() throws Exception {
        String token = getToken();
        String params = "client_id=" + CLIENT_ID + "&access_token=" + token;
        String result = HttpUtils.sendGet(API_1, params);
        System.out.println(result);
        return toAjax(true);
    }



    public static void main(String[] args) {
        String sr = HttpRequestUtil.sendPost("http://10.18.17.84:9090/oauth/token?client_id=57c2727d921f4c84bae6bf9553ae8589&client_secret=aac706cfc64c4131bad8f76d681a7043","",false);
        //System.out.println(sr);
        //将json字符串转化为JSONObject
        JSONObject jsonObject = JSONObject.fromObject(sr);
        String access_token = jsonObject.get("access_token").toString();
        sr = HttpRequestUtil.sendPost("http://10.18.17.84:9090/service/api/ythzw/ds_ythzw_zw_fw_up_pro_result/133?client_id=57c2727d921f4c84bae6bf9553ae8589&access_token="+access_token+"&pageSize=10&pageNumber=1","",false);
        JSONArray jsonArray = JSONArray.fromObject(sr);
        LinkedList<Test> linkedList = new LinkedList<>();
        int i = 0;
        for (Object object : jsonArray) {
            JSONObject obj = (JSONObject) object;
            Test t = new Test();
            t.setCdOperation(obj.get("cd_operation").toString());
            t.setResultExplain(obj.get("resultexplain").toString());
            t.setRowguid(obj.get("rowguid").toString());
            t.setResultType(obj.get("resulttype").toString());
            t.setCdBatch(obj.get("cd_batch").toString());
            t.setHandleuserName(obj.get("handleusername").toString());
            t.setProjectNo(obj.get("projectno").toString());
            t.setResultcetrName(obj.get("resultcetrname").toString());
            t.setCdTime(obj.get("cd_time").toString());
            t.setDataSource(obj.get("datasource").toString());
            t.setResultDate( obj.get("resultdate").toString());
            t.setIsDeliveryResults(obj.get("isdeliveryresults").toString());
            t.setResultcetrNo(obj.get("resultcetrno").toString());
            linkedList.add(t);
           // System.out.println(obj);
        }
        System.out.println(linkedList.size());
        
        System.out.println(sr);
    }





    
}
