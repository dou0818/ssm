package com.stock.commons;

import org.apache.http.client.config.RequestConfig;

public class MyHttpClient {
    private static RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(15000).setConnectTimeout(15000).setConnectionRequestTimeout(15000).build();

}
