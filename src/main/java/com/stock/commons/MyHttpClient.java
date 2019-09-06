package com.stock.commons;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.util.List;
import java.util.Map;


public class MyHttpClient {
    private static RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(15000)
            .setConnectTimeout(15000).setConnectionRequestTimeout(15000).build();

    public static List<Map<String, Object>> getShop() throws Exception {
        // String url = "http://www.baidu.com";//没有参数
        String url = "http://192.168.1.44:8095/selAllStudent";//可以传参数
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(url);
        httpGet.setConfig(requestConfig);
        // 执行请求
        CloseableHttpResponse response = httpClient.execute(httpGet);
        HttpEntity entity = response.getEntity();
        String responseContent = EntityUtils.toString(entity, "UTF-8");
        System.out.println(responseContent);
        ObjectMapper om = new ObjectMapper();
        List<Map<String,Object>> mapList=om.readValue(responseContent,new TypeReference<List<Map<String,Object>>>(){});
        // 关闭连接
        response.close();
        httpClient.close();
        return mapList;
    }

    public static void main(String[] args) throws Exception {
        getShop();
    }
}
