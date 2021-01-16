/**
 * L
 * Copyright (c) 1991-2020 All Rights Reserved.
 */
package com.springboot.qa.qasystem.test;

import com.google.common.collect.Lists;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.net.URI;
import java.util.List;

/**
 *
 * @author L
 * @version 1.0: SearchTest.java, v 1.0 2020年12月23日 2:26 L Exp $
 */
public class SearchTest {

    public static void main(String[] args) throws Exception {
        String url = "https://www.baidu.com/";    //请求路径
        //构造路径参数
        List<NameValuePair> nameValuePairList = Lists.newArrayList();
        nameValuePairList.add(new BasicNameValuePair("username","test"));
        nameValuePairList.add(new BasicNameValuePair("password","password"));
        //构造请求路径，并添加参数
        URI uri = new URIBuilder(url).addParameters(nameValuePairList).build();
        //构造Headers
        List<Header> headerList = Lists.newArrayList();
        headerList.add(new BasicHeader(HttpHeaders.ACCEPT_ENCODING,"gzip, deflate"));
        headerList.add(new BasicHeader(HttpHeaders.CONNECTION, "keep-alive"));
        //构造HttpClient
        HttpClient httpClient = HttpClients.custom().setDefaultHeaders(headerList).build();
        //构造HttpGet请求
        HttpUriRequest httpUriRequest = RequestBuilder.get().setUri(uri).build();
        //获取结果
        HttpResponse httpResponse = httpClient.execute(httpUriRequest);
        //获取返回结果中的实体
        HttpEntity entity = httpResponse.getEntity();
        //查看页面内容结果
        String rawHTMLContent = EntityUtils.toString(entity);
        System.out.println(rawHTMLContent);
        //关闭HttpEntity流
        EntityUtils.consume(entity);
    }
    //获取url网页的html
    private String httpGetHtml(String url){
        return null;
    }
    private void parse(String html){

    }
}
